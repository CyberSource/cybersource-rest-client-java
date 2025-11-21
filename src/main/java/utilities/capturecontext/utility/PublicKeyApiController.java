package utilities.capturecontext.utility;

import com.cybersource.authsdk.util.jwt.JWTUtility;
import com.cybersource.authsdk.util.jwt.exceptions.InvalidJwkException;
import com.nimbusds.jose.JOSEException;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.URL;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;

public class PublicKeyApiController {
    public static RSAPublicKey fetchPublicKey(String kid, String runEnvironment)
            throws IOException, ParseException, JOSEException, InvalidJwkException {
        URL url = new URL("https://" + runEnvironment + "/flex/v2/public-keys/" + kid);

        Request request = new Request.Builder().url(url).build();

        OkHttpClient client = new OkHttpClient();

        Call call = client.newCall(request);

        String jwkJsonString;

        try (Response response = call.execute()) {
            assert response.body() != null;
            jwkJsonString = response.body().string();
        }

        return JWTUtility.getRSAPublicKeyFromJwk(jwkJsonString);
    }
}
