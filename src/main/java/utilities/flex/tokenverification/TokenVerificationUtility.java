package utilities.flex.tokenverification;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import utilities.flex.exception.FlexEncodingException;
import utilities.flex.exception.FlexException;
import utilities.flex.exception.FlexSDKInternalException;
import utilities.flex.exception.FlexSecurityException;
import utilities.flex.security.Base64;

public class TokenVerificationUtility {
	private Logger logger;
	
	public TokenVerificationUtility() {
		this.logger = LogManager.getLogger(this.getClass());
	}
	
	public boolean verifyToken(PublicKey publicKey, Map<?, ?> postParams) throws FlexException {
		if (postParams == null) {
			this.logger.error("FlexSecurityException : A valid Map must be supplied");
			throw new FlexSecurityException("A valid Map must be supplied");
		}
		final String signature = (String) postParams.get("signature");
		
		if (signature == null) {
			this.logger.error("FlexSecurityException : Missing required field 'signature'");
			throw new FlexSecurityException("Missing required field: signature");
		}
		final String signedFields = (String) postParams.get("signedFields");
		
		if (signedFields == null) {
			this.logger.error("FlexSecurityException : Missing required field: 'signedFields'");
			throw new FlexSecurityException("Missing required field: signedFields");
		}
		
		StringBuilder sb = new StringBuilder();
		for (String k : signedFields.split(",")) {
			sb.append(',');
			sb.append(postParams.get("" + k));
		}
		final String signedValues = sb.substring(1);
		return validateTokenSignature(publicKey, signedValues, signature);		
}
	
	private boolean validateTokenSignature(PublicKey publicKey, String signedFields, String signature) throws FlexException {
		boolean success = false;
		
		if (publicKey == null) {
			this.logger.error("FlexSecurityException : Must supply a valid PublicKey instance");
			throw new FlexSecurityException("Must supply a valid PublicKey instance");
		}
		
		if (signature == null) {
			this.logger.error("FlexSecurityException : Missing required field 'signature'");
			throw new FlexSecurityException("Missing required field: signature");
		}
		
		if (signedFields == null) {
			this.logger.error("FlexSecurityException : Missing required field: 'signedFields'");
			throw new FlexSecurityException("Missing required field: signedFields");
		}
		
		try {
			final Signature signInstance = Signature.getInstance("SHA512withRSA");
			signInstance.initVerify(publicKey);
			signInstance.update(signedFields.getBytes());
			success = signInstance.verify(Base64.decode(signature));
			System.out.println(success);
		} catch (IOException e) {
			this.logger.error("FlexEncodingException : Unable to decode signature\n{}", e);
			throw new FlexEncodingException("Unable to decode signature"+ e);
		} catch (GeneralSecurityException e) {
			this.logger.error("FlexSDKInternalException : {}", e);
			throw new FlexSDKInternalException(e);
		}
		return success;
	}
}
