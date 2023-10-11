package utilities.JWEResponse;

import com.cybersource.authsdk.core.MerchantConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utilities.JWEResponse.JWEException.JWEException;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;

public class JWEUtility {
    private static final Logger logger = LogManager.getLogger(JWEUtility.class);

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
}
