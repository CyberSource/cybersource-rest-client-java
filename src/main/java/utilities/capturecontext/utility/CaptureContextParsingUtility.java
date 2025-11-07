package utilities.capturecontext.utility;

import com.cybersource.authsdk.cache.CacheForPublicKeys;
import com.cybersource.authsdk.core.ConfigException;
import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.authsdk.util.jwt.JWTUtility;
import com.cybersource.authsdk.util.jwt.exceptions.InvalidJwkException;
import com.cybersource.authsdk.util.jwt.exceptions.InvalidJwtException;
import com.cybersource.authsdk.util.jwt.exceptions.JwtSignatureValidationException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.Payload;
import com.nimbusds.jwt.SignedJWT;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import java.util.HashMap;

public class CaptureContextParsingUtility {
    private static CacheForPublicKeys cache = new CacheForPublicKeys();

    public static JsonObject parseCaptureContextResponse(
            String jwtValue, MerchantConfig merchantConfig, boolean verifyJwt)
            throws InvalidJwtException, ConfigException, IOException, InvalidJwkException, JwtSignatureValidationException {
        SignedJWT signedJWT = JWTUtility.parse(jwtValue);

        if (verifyJwt) {
            RSAPublicKey publicKey;
            boolean isJwtValid = false;

            JWSHeader jwsHeader = signedJWT.getHeader();

            String kid = jwsHeader.getKeyID();

            boolean isPublicKeyFromCache = false;

            try {
                publicKey = cache.getPublicKeyFromCache(merchantConfig.getRunEnvironment(), kid);
                isPublicKeyFromCache = true;
            } catch (NullPointerException e) {
                fetchPublicKeyFromApi(kid, merchantConfig.getRunEnvironment());
                publicKey = cache.getPublicKeyFromCache(merchantConfig.getRunEnvironment(), kid);
            }

            try {
                assert publicKey != null;
                isJwtValid = JWTUtility.verifyJwt(signedJWT, publicKey);
            } catch (JwtSignatureValidationException e) {
                if (isPublicKeyFromCache) {
                    fetchPublicKeyFromApi(kid, merchantConfig.getRunEnvironment());
                    publicKey = cache.getPublicKeyFromCache(merchantConfig.getRunEnvironment(), kid);
                    isJwtValid = JWTUtility.verifyJwt(signedJWT, publicKey);
                }
            }

            if (!isJwtValid) {
                throw new JwtSignatureValidationException("JWT validation failed");
            }
        }

        return convertPayloadMapToJsonObject(signedJWT.getPayload());
    }

    private static JsonObject convertPayloadMapToJsonObject(Payload payload) {
        Gson gson = new Gson();
        Type typeObject = new TypeToken<HashMap<String, Object>>() {}.getType();
        String jsonRepresentation = gson.toJson(payload.toJSONObject(), typeObject);
        return JsonParser.parseString(jsonRepresentation).getAsJsonObject();
    }

    private static void fetchPublicKeyFromApi(String kid, String runEnvironment) throws ConfigException, IOException, InvalidJwkException {
        RSAPublicKey publicKey;

        try {
            publicKey = PublicKeyApiController.fetchPublicKey(kid, runEnvironment);
            cache.addPublicKeyToCache(runEnvironment, kid, publicKey);
        } catch (MalformedURLException err) {
            throw new ConfigException("Invalid Runtime URL in Merchant Config");
        } catch (IOException err) {
            throw new IOException("Error while trying to retrieve public key from server");
        } catch (ParseException err) {
            throw new InvalidJwkException("JWK received from server cannot be parsed correctly", err);
        } catch (JOSEException err) {
            throw new InvalidJwkException("Cannot convert JWK to RSA Public Key", err);
        }
    }
}
