package Invokers;

import okhttp3.RequestBody;
import okio.Buffer;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public class EmptyPostBodyTest {
    @Test
    public void serializesEmptyPostAsJsonObject() throws Exception {
        ApiClient client = new ApiClient();
        Method createRequestBody = ApiClient.class.getDeclaredMethod(
                "createRequestBody", String.class, Object.class, Map.class, String.class);
        createRequestBody.setAccessible(true);
        for (String contentType : new String[] {"application/json", "application/json;charset=utf-8"}) {
            RequestBody body = (RequestBody) createRequestBody.invoke(
                    client, "POST", Collections.emptyMap(), Collections.emptyMap(), contentType);
            Buffer buffer = new Buffer();
            body.writeTo(buffer);
            Assert.assertEquals("{}", buffer.readUtf8());
        }
    }

    @Test
    public void serializedMlePayloadUsesConfiguredGsonAdapters() throws Exception {
        ApiClient client = new ApiClient();
        JSON configuredJson = new JSON(client);
        configuredJson.setGson(new GsonBuilder()
                .registerTypeAdapter(Date.class, new JsonSerializer<Date>() {
                    @Override
                    public JsonPrimitive serialize(Date value, Type type, JsonSerializationContext context) {
                        return new JsonPrimitive("custom-date-format");
                    }
                }).create());
        client.setJSON(configuredJson);

        String payload = client.serializePayload(Collections.singletonMap("created", new Date(0)), "application/json");

        Assert.assertEquals("{\"created\":\"custom-date-format\"}", payload);
    }
}