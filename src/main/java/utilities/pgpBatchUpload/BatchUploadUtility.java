package utilities.pgpBatchUpload;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bouncycastle.openpgp.PGPException;
import org.bouncycastle.openpgp.PGPPublicKey;
import org.bouncycastle.openpgp.PGPPublicKeyRing;
import org.bouncycastle.openpgp.PGPPublicKeyRingCollection;
import org.bouncycastle.openpgp.PGPUtil;

import com.cybersource.authsdk.util.GlobalLabelParameters;

/**
 * Utility class for batch upload operations, including certificate and PGP key loading,
 * endpoint URL construction, and input validation for batch API operations.
 */
public class BatchUploadUtility {
	
	private static final Logger logger = LogManager.getLogger(BatchUploadUtility.class);
	private static final long MAX_FILE_SIZE_BYTES = 75 * 1024 * 1024;
	
	/**
     * Loads an X509 certificate from a PEM file.
     *
     * @param certFilePath The file path to the PEM certificate file.
     * @return The loaded X509Certificate object.
     * @throws CertificateException If the certificate cannot be parsed or is invalid.
     * @throws IOException If the file cannot be read or does not exist.
     */
    public static X509Certificate loadCertificateFromPemFile(String certFilePath) throws CertificateException, IOException {
	    try (FileInputStream inStream = new FileInputStream(certFilePath)) {
	        CertificateFactory cf = CertificateFactory.getInstance("X.509");
	        return (X509Certificate) cf.generateCertificate(inStream);
	    }
	}
    
    /**
     * Reads a PGP public key from the specified file.
     *
     * @param filePath The file path to the PGP public key.
     * @return The first encryption-capable PGPPublicKey found in the file.
     * @throws IOException              If an I/O error occurs.
     * @throws PGPException             If a PGP error occurs or no encryption key is found.
     * @throws IllegalArgumentException If the file path is null or empty.
     */
    public static PGPPublicKey readPGPPublicKey(String filePath) throws IOException, PGPException {
        validatePathAndFile(filePath, "pgp public key path");
        logger.debug("Reading pgp public key from file: {}", filePath);
        try (InputStream keyIn = new BufferedInputStream(new FileInputStream(filePath))) {
			PGPPublicKeyRingCollection pgpPub = new PGPPublicKeyRingCollection(PGPUtil.getDecoderStream(keyIn),
					new org.bouncycastle.openpgp.operator.jcajce.JcaKeyFingerprintCalculator());

			Iterator<PGPPublicKeyRing> keyRingIter = pgpPub.getKeyRings();
			while (keyRingIter.hasNext()) {
				PGPPublicKeyRing keyRing = keyRingIter.next();
				Iterator<PGPPublicKey> keyIter = keyRing.getPublicKeys();
				while (keyIter.hasNext()) {
					PGPPublicKey key = keyIter.next();
					if (key.isEncryptionKey()) {
						return key;
					}
				}
			}
		}
		throw new PGPException("No encryption key found in the provided key ring: " + filePath);
	}

    /**
     * Constructs the full endpoint URL for the given environment hostname and endpoint path.
     *
     * @param environmentHostname The environment hostname (with or without protocol prefix).
     * @param endpoint The endpoint path to append.
     * @return The full endpoint URL.
     */
    public static String getEndpointUrl(String environmentHostname , String endpoint) {
        String baseUrl;
        if(environmentHostname.startsWith(GlobalLabelParameters.URL_PREFIX))
            baseUrl=environmentHostname.trim();
        else
            baseUrl= GlobalLabelParameters.URL_PREFIX + environmentHostname.trim();
        return baseUrl + endpoint;
    }
    
    /**
     * Validates the input parameters for batch API using JKS keystore.
     *
     * @param inputFile The input CSV file for batch upload.
     * @param environmentHostname The environment hostname.
     * @param pgpEncryptionCertPath The path to the PGP encryption certificate.
     * @param keystorePath The path to the keystore file.
     * @param truststorePath The path to the truststore file.
     * @throws Exception If any validation fails.
     */
    public static void validateBatchApiJKSInputs(File inputFile, String environmentHostname, String pgpEncryptionCertPath, String keystorePath, String truststorePath) throws Exception{
    	validateInputFile(inputFile);
    	if(StringUtils.isEmpty(environmentHostname)) {
    		logger.error("Environment Host Name for Batch Upload API cannot be null or empty.");
    		throw new IllegalArgumentException("Environment Host Name for Batch Upload API cannot be null or empty.");
    	}
    	validatePathAndFile(pgpEncryptionCertPath, "PGP Encryption Cert Path");
    	validatePathAndFile(keystorePath, "Keystore Path");
    	validatePathAndFile(truststorePath, "Truststore Path");
    }
    
    /**
     * Validates the input parameters for batch API using P12 client certificate.
     *
     * @param inputFile The input CSV file for batch upload.
     * @param environmentHostname The environment hostname.
     * @param pgpEncryptionCertPath The path to the PGP encryption certificate.
     * @param clientCertP12FilePath The path to the client certificate P12 file.
     * @param serverTrustCertPath The path to the server trust certificate.
     * @throws Exception If any validation fails.
     */
    public static void validateBatchApiP12Inputs(File inputFile, String environmentHostname, String pgpEncryptionCertPath,  String clientCertP12FilePath, String serverTrustCertPath) throws Exception{
    	validateInputFile(inputFile);
    	if(StringUtils.isEmpty(environmentHostname)) {
    		logger.error("Environment Host Name for Batch Upload API cannot be null or empty.");
    		throw new IllegalArgumentException("Environment Host Name for Batch Upload API cannot be null or empty.");
    	}
    	validatePathAndFile(pgpEncryptionCertPath, "PGP Encryption Cert Path");
    	validatePathAndFile(clientCertP12FilePath, "Client Cert P12 File Path");
    	validatePathAndFile(serverTrustCertPath, "Server Trust Cert Path");
    }
    
    /**
     * Validates the input parameters for batch API using direct key and certificate objects.
     *
     * @param inputFile The input CSV file for batch upload.
     * @param environmentHostname The environment hostname.
     * @param pgpPublicKey The PGP public key object.
     * @param clientPrivateKey The client private key.
     * @param clientCert The client X509 certificate.
     * @param serverTrustCert The server trust X509 certificate.
     * @throws Exception If any validation fails.
     */
    public static void validateBatchApiKeysInputs(File inputFile, String environmentHostname, PGPPublicKey pgpPublicKey,  PrivateKey clientPrivateKey, X509Certificate clientCert , X509Certificate serverTrustCert) throws Exception{
    	validateInputFile(inputFile);
    	if(StringUtils.isEmpty(environmentHostname)) {
    		logger.error("Environment Host Name for Batch Upload API cannot be null or empty.");
    		throw new IllegalArgumentException("Environment Host Name for Batch Upload API cannot be null or empty.");
    	}
    	if (pgpPublicKey == null) throw new IllegalArgumentException("PGP Public Key is null");
        if (clientPrivateKey == null) throw new IllegalArgumentException("Client Private Key is null");
        if (clientCert == null) throw new IllegalArgumentException("Client Certificate is null");
        if (serverTrustCert == null) throw new IllegalArgumentException("Server Trust Certificate is null");
    }
    
    /**
     * Validates the input file for batch upload.
     * Checks for existence, file type (CSV), and maximum file size (75MB).
     *
     * @param inputFile The input file to validate.
     * @throws IllegalArgumentException If the file is invalid, not a CSV, or exceeds size limit.
     */
    private static void validateInputFile(File inputFile) {
        if (inputFile == null || !inputFile.exists() || !inputFile.isFile()) {
        	logger.error("Input file is invalid or does not exist: " + (inputFile != null ? inputFile : "null"));
            throw new IllegalArgumentException("Input file is invalid or does not exist: " + inputFile);
        }
        //only csv files are allowed for batch api
        if (!inputFile.getName().toLowerCase().endsWith(".csv")) {
        	logger.error("Only CSV file type is allowed: " + inputFile.getName());
			throw new IllegalArgumentException("Only CSV file type is allowed: " + inputFile.getName());
		}
        //maximum file size allowed is 75MB
		if (inputFile.length() > MAX_FILE_SIZE_BYTES) {
			logger.error("Input file size exceeds the maximum allowed size of 75MB: " + inputFile.length() + " fileName=" + inputFile.getName());
			throw new IllegalArgumentException("Input file size exceeds the maximum allowed size of 75MB: " + inputFile.length());
		}
    }
    
    /**
     * Validates that the given file path exists and is not empty.
     *
     * @param path     The file path to validate.
     * @param pathType A description of the path type (e.g., "Input file").
     * @throws IOException              If the file does not exist.
     * @throws IllegalArgumentException If the path is null or empty.
     */
    private static void validatePathAndFile(String filePath, String pathType) throws IOException {
        if (filePath == null || filePath.trim().isEmpty()) {
            logger.error(pathType + " path cannot be null or empty");
            throw new IllegalArgumentException(pathType + " path cannot be null or empty");
        }

        // Normalize Windows-style paths that start with a slash before the drive letter
        String normalizedPath = filePath;
        if (File.separatorChar == '\\' && normalizedPath.matches("^/[A-Za-z]:.*")) {
            normalizedPath = normalizedPath.substring(1);
        }

        Path path = Paths.get(normalizedPath);
        if (!Files.exists(path)) {
            logger.error(pathType + " does not exist: " + path);
            throw new IOException(pathType + " does not exist: " + path);
        }
        if (!Files.isRegularFile(path)) {
        	logger.error(pathType + " does not have valid file: " + path);
            throw new IOException(pathType + " does not have valid file: " + path);
        }
        if (!Files.isReadable(path)) {
            logger.error(pathType + " is not readable: " + path);
            throw new IOException(pathType + " is not readable: " + path);
        }
    }
    
}
