package utilities.JWEResponse;

import com.cybersource.authsdk.core.MerchantConfig;
import com.nimbusds.jose.JOSEException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utilities.JWEResponse.JWEException.JWEException;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.text.ParseException;

public class JWEUtility {
    private static final Logger logger = LogManager.getLogger(JWEUtility.class);

    /**
     * This method has been marked as Deprecated and will be removed in coming releases.
     *
     * @param encodedResponse The encoded response that has to be decrypted
     * @param merchantConfig The merchant configuration object where the private key pem file path is provided
     * @return The decrypted response as a JSON string
     * @deprecated use {@link #decryptJWEResponse(PrivateKey, String)} instead.
     * @throws JWEException Error during decryption
     */
    @Deprecated
    public static String decryptJWEResponse(String encodedResponse, MerchantConfig merchantConfig) throws JWEException {
        try {
            return com.cybersource.authsdk.util.JWEUtility.decryptJWEUsingPEM(merchantConfig, encodedResponse);
        } catch (NoSuchAlgorithmException exception) {
          logger.error("NoSuchAlgorithmException: Could not able to find the required algorithm", exception);
          throw new JWEException("Could not able to find the required algorithm", exception);
        } catch (IOException exception) {
            logger.error("IOException: Could not able to load the PEM Object from PEM file");
            throw new JWEException("Could not able to load the PEM Object from PEM file", exception);
        } catch (ParseException exception) {
            logger.error("ParseException: Unparsable decrypted response", exception);
            throw new JWEException("Unparsable decrypted response", exception);
        }
        catch (Exception exception) {
            logger.error("JWE internal SDK exception", exception);
            throw new JWEException("Exception occurred while decrypting the response", exception);
        }
    }

    /**
     *
     * @param privateKey The private key to use for decrypting the encoded response
     * @param encodedResponse The encoded response that has to be decrypted
     * @return The decrypted response as a JSON string
     * @throws JWEException Error during decryption
     */
    public static String decryptJWEResponse(PrivateKey privateKey, String encodedResponse) throws JWEException {
        try {
            return com.cybersource.authsdk.util.JWEUtility.decryptJWEUsingPrivateKey(privateKey, encodedResponse);
        } catch (ParseException exception) {
            logger.error("ParseException: Unparsable decrypted response", exception);
            throw new JWEException("Unparsable decrypted response", exception);
        } catch (JOSEException exception) {
            logger.error("JOSEException: Could not able to decrypt the JWE response", exception);
            throw new JWEException("Could not able to decrypt the JWE response", exception);
        } catch (Exception exception) {
            logger.error("JWE internal SDK exception", exception);
            throw new JWEException("Exception occurred while decrypting the response", exception);
        }
    }
}
