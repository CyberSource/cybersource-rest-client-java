package Invokers;

import okhttp3.Authenticator;
import okhttp3.logging.HttpLoggingInterceptor;
import utilities.listeners.NetworkEventListener;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import java.net.Proxy;

public class HttpClientFactoryAdditionalSettings {
    private HttpLoggingInterceptor customLoggingInterceptor;
    private SSLSocketFactory customSSLSocketFactory;
    private X509TrustManager customX509TrustManager;
    private HostnameVerifier customHostnameVerifier;
    private Boolean customRetryOnConnectionFailure;
    private NetworkEventListener customNetworkEventListener;
    private Proxy customProxy;
    private Authenticator customProxyAuthenticator;

    public HttpLoggingInterceptor getCustomLoggingInterceptor() {
        return customLoggingInterceptor;
    }

    public void setCustomLoggingInterceptor(HttpLoggingInterceptor customLoggingInterceptor) {
        this.customLoggingInterceptor = customLoggingInterceptor;
    }

    public SSLSocketFactory getCustomSSLSocketFactory() {
        return customSSLSocketFactory;
    }

    public void setCustomSSLSocketFactory(SSLSocketFactory customSSLSocketFactory) {
        this.customSSLSocketFactory = customSSLSocketFactory;
    }

    public X509TrustManager getCustomX509TrustManager() {
        return customX509TrustManager;
    }

    public void setCustomX509TrustManager(X509TrustManager customX509TrustManager) {
        this.customX509TrustManager = customX509TrustManager;
    }

    public HostnameVerifier getCustomHostnameVerifier() {
        return customHostnameVerifier;
    }

    public void setCustomHostnameVerifier(HostnameVerifier customHostnameVerifier) {
        this.customHostnameVerifier = customHostnameVerifier;
    }

    public Boolean getCustomRetryOnConnectionFailure() {
        return customRetryOnConnectionFailure;
    }

    public void setCustomRetryOnConnectionFailure(Boolean customRetryOnConnectionFailure) {
        this.customRetryOnConnectionFailure = customRetryOnConnectionFailure;
    }

    public NetworkEventListener getCustomNetworkEventListener() {
        return customNetworkEventListener;
    }

    public void setCustomNetworkEventListener(NetworkEventListener customNetworkEventListener) {
        this.customNetworkEventListener = customNetworkEventListener;
    }

    public Proxy getCustomProxy() {
        return customProxy;
    }

    public void setCustomProxy(Proxy customProxy) {
        this.customProxy = customProxy;
    }

    public Authenticator getCustomProxyAuthenticator() {
        return customProxyAuthenticator;
    }

    public void setCustomProxyAuthenticator(Authenticator customProxyAuthenticator) {
        this.customProxyAuthenticator = customProxyAuthenticator;
    }

    /**
     * Shallow copy used to apply a per-call override (e.g. forcing retry off for a payment
     * POST) without mutating the merchant's shared settings instance.
     */
    HttpClientFactoryAdditionalSettings copy() {
        HttpClientFactoryAdditionalSettings copy = new HttpClientFactoryAdditionalSettings();
        copy.customLoggingInterceptor = this.customLoggingInterceptor;
        copy.customSSLSocketFactory = this.customSSLSocketFactory;
        copy.customX509TrustManager = this.customX509TrustManager;
        copy.customHostnameVerifier = this.customHostnameVerifier;
        copy.customRetryOnConnectionFailure = this.customRetryOnConnectionFailure;
        copy.customNetworkEventListener = this.customNetworkEventListener;
        copy.customProxy = this.customProxy;
        copy.customProxyAuthenticator = this.customProxyAuthenticator;
        return copy;
    }
}
