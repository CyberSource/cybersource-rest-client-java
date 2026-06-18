package Invokers;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Minimal, dependency-free, thread-safe cache with a time-based retention
 * policy.
 *
 * <p>Entries expire a configurable duration after they were last accessed
 * (idle expiration), and the total number of live entries is bounded by a
 * maximum size using least-recently-used eviction. Whenever an entry leaves the
 * cache - because it expired, was evicted to honour the size bound, or was
 * replaced after expiry - an optional {@code removalListener} is invoked so the
 * caller can release any resources associated with the cached value.
 *
 * <p>Expired entries are reclaimed lazily: a purge runs on every read/write, so
 * no background threads are created.
 *
 * @param <K> the type of keys maintained by this cache
 * @param <V> the type of cached values
 */
final class TimedCache<K, V> {

    private static final class Entry<V> {
        final V value;
        volatile long lastAccessNanos;

        Entry(V value, long lastAccessNanos) {
            this.value = value;
            this.lastAccessNanos = lastAccessNanos;
        }
    }

    private final ConcurrentHashMap<K, Entry<V>> entries = new ConcurrentHashMap<>();
    private final long expireAfterAccessNanos;
    private final int maximumSize;
    private final BiConsumer<K, V> removalListener;

    /**
     * @param expireAfterAccess idle duration after which an unused entry expires
     * @param unit              time unit of {@code expireAfterAccess}
     * @param maximumSize       maximum number of live entries before LRU eviction
     * @param removalListener   notified for every removed value (may be {@code null})
     */
    TimedCache(long expireAfterAccess, TimeUnit unit, int maximumSize, BiConsumer<K, V> removalListener) {
        if (expireAfterAccess <= 0) {
            throw new IllegalArgumentException("expireAfterAccess must be positive");
        }
        if (maximumSize <= 0) {
            throw new IllegalArgumentException("maximumSize must be positive");
        }
        this.expireAfterAccessNanos = unit.toNanos(expireAfterAccess);
        this.maximumSize = maximumSize;
        this.removalListener = removalListener != null ? removalListener : (k, v) -> { };
    }

    /**
     * Returns the value cached for {@code key}, creating and storing one with
     * {@code mappingFunction} when absent or expired. The mapping function is
     * invoked at most once per missing key, even under concurrent access.
     */
    V get(K key, Function<? super K, ? extends V> mappingFunction) {
        long now = System.nanoTime();
        purgeExpired(now);

        List<Map.Entry<K, V>> replaced = new ArrayList<>(1);
        Entry<V> entry = entries.compute(key, (k, existing) -> {
            if (existing != null && !isExpired(existing, now)) {
                existing.lastAccessNanos = now;
                return existing;
            }
            if (existing != null) {
                replaced.add(new AbstractMap.SimpleImmutableEntry<>(k, existing.value));
            }
            return new Entry<>(mappingFunction.apply(k), now);
        });

        notifyRemoval(replaced);
        enforceSizeBound();
        return entry.value;
    }

    private boolean isExpired(Entry<V> entry, long now) {
        return now - entry.lastAccessNanos >= expireAfterAccessNanos;
    }

    private void purgeExpired(long now) {
        List<Map.Entry<K, V>> evicted = null;
        for (Map.Entry<K, Entry<V>> e : entries.entrySet()) {
            Entry<V> entry = e.getValue();
            if (isExpired(entry, now) && entries.remove(e.getKey(), entry)) {
                if (evicted == null) {
                    evicted = new ArrayList<>();
                }
                evicted.add(new AbstractMap.SimpleImmutableEntry<>(e.getKey(), entry.value));
            }
        }
        notifyRemoval(evicted);
    }

    private void enforceSizeBound() {
        while (entries.size() > maximumSize) {
            Map.Entry<K, Entry<V>> lru = null;
            for (Map.Entry<K, Entry<V>> e : entries.entrySet()) {
                if (lru == null || e.getValue().lastAccessNanos < lru.getValue().lastAccessNanos) {
                    lru = e;
                }
            }
            if (lru == null || !entries.remove(lru.getKey(), lru.getValue())) {
                break;
            }
            removalListener.accept(lru.getKey(), lru.getValue().value);
        }
    }

    private void notifyRemoval(List<Map.Entry<K, V>> removed) {
        if (removed == null) {
            return;
        }
        for (Map.Entry<K, V> e : removed) {
            removalListener.accept(e.getKey(), e.getValue());
        }
    }
}
