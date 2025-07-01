package Api;

import java.io.File;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bouncycastle.openpgp.PGPPublicKey;

import Invokers.ApiException;
import Invokers.ApiResponse;
import utilities.pgpBatchUpload.BatchUploadUtility;
import utilities.pgpBatchUpload.MutualAuthUploadUtility;
import utilities.pgpBatchUpload.PgpEncryptionUtility;

/**
 * API class for uploading batch files to CyberSource using mutual TLS authentication.
 * <p>
 * Supports multiple authentication mechanisms: JKS keystore/truststore, PKCS#12 client certificates, 
 * and direct private key/certificate objects. Handles PGP encryption of files before upload.
 * </p>
 */
public class BatchUploadwithMTLSApi {
    private static Logger logger = LogManager.getLogger(BatchUploadwithMTLSApi.class);

    /**
     * Uploads a batch file using mutual TLS authentication with JKS keystore and truststore.
     *
     * @param inputFile The file to be uploaded.
     * @param environmentHostname The environment hostname (e.g., secure-batch-test.cybersource.com).
     * @param pgpEncryptionCertPath Path to the PGP encryption certificate.
     * @param keystorePath Path to the JKS keystore file containing client certificates.
     * @param keystorePassword Password for the keystore.
     * @param truststorePath Path to the JKS truststore file containing trusted server certificates. <b>Optional</b>: Can be <code>null</code> if not required.
     * @param truststorePassword Password for the truststore.
     * @return ApiResponse containing the server response as a String.
     * @throws ApiException If an API error occurs.
     * @throws Exception If a general error occurs.
     */
    public ApiResponse<String> uploadBatchAPI(File inputFile, String environmentHostname, String pgpEncryptionCertPath, String keystorePath, char[] keystorePassword, String truststorePath, char[] truststorePassword) throws ApiException, Exception {
        logger.info("Starting batch upload with JKS for given file");
        BatchUploadUtility.validateBatchApiJKSInputs(inputFile, environmentHostname, pgpEncryptionCertPath, keystorePath, truststorePath);
        String endpoint = "/pts/v1/transaction-batch-upload";
        String endpointUrl = BatchUploadUtility.getEndpointUrl(environmentHostname, endpoint); 
        byte[] encryptedPgpBytes = PgpEncryptionUtility.handlePGPEncrypt(inputFile, pgpEncryptionCertPath);
        return MutualAuthUploadUtility.handleUploadOperationWithJKS(
            encryptedPgpBytes, endpointUrl, inputFile.getName(),
            keystorePath, keystorePassword, truststorePath, truststorePassword
        );
    }

    /**
     * Uploads a batch file using mutual TLS authentication with a PKCS#12 (.p12/.pfx) client certificate file.
     *
     * @param inputFile The file to be uploaded.
     * @param environmentHostname The environment hostname (e.g., api.cybersource.com).
     * @param pgpEncryptionCertPath Path to the PGP encryption certificate.
     * @param clientCertP12FilePath Path to the PKCS#12 client certificate file (.p12 or .pfx).
     * @param clientCertP12Password Password for the PKCS#12 client certificate.
     * @param serverTrustCertPath Path to the server trust certificate(s) in PEM format. <b>Optional</b>: Can be <code>null</code> if not required.
     * @return ApiResponse containing the server response as a String.
     * @throws ApiException If an API error occurs.
     * @throws Exception If a general error occurs.
     */
    public ApiResponse<String> uploadBatchAPI(File inputFile, String environmentHostname, String pgpEncryptionCertPath, String clientCertP12FilePath , char[] clientCertP12Password, String serverTrustCertPath) throws ApiException, Exception{
        logger.info("Starting batch upload with p12/pfx for given file");
        BatchUploadUtility.validateBatchApiP12Inputs(inputFile, environmentHostname, pgpEncryptionCertPath, clientCertP12FilePath, serverTrustCertPath);
        String endpoint = "/pts/v1/transaction-batch-upload";
        String endpointUrl = BatchUploadUtility.getEndpointUrl(environmentHostname, endpoint);
        byte[] encryptedPgpBytes = PgpEncryptionUtility.handlePGPEncrypt(inputFile, pgpEncryptionCertPath);
        return MutualAuthUploadUtility.handleUploadOperationUsingP12orPfx(
            encryptedPgpBytes, endpointUrl, inputFile.getName(),
            clientCertP12FilePath, clientCertP12Password, serverTrustCertPath
        );
    }

    /**
     * Uploads a batch file using mutual TLS authentication with client private key and certificates as objects.
     *
     * @param inputFile The file to be uploaded.
     * @param environmentHostname The environment hostname (e.g., api.cybersource.com).
     * @param pgpPublicKey The PGP public key for encryption.
     * @param clientPrivateKey The client's private key.
     * @param clientCert The client's X509 certificate.
     * @param serverTrustCerts A collection of server's trusted X509 certificates (can be a certificate chain). <b>Optional</b>: Can be <code>null</code> or empty if not required.
     * @return ApiResponse containing the server response as a String.
     * @throws ApiException If an API error occurs.
     * @throws Exception If a general error occurs.
     */
    public ApiResponse<String> uploadBatchAPI(File inputFile, String environmentHostname, PGPPublicKey pgpPublicKey, PrivateKey clientPrivateKey, X509Certificate clientCert , Collection<X509Certificate> serverTrustCerts) throws ApiException, Exception {
        logger.info("Starting batch upload with client private key and certs for given file");
        BatchUploadUtility.validateBatchApiKeysInputs(inputFile, environmentHostname, pgpPublicKey, clientPrivateKey, clientCert, serverTrustCerts);
        String endpoint = "/pts/v1/transaction-batch-upload";
        String endpointUrl = BatchUploadUtility.getEndpointUrl(environmentHostname, endpoint);
        byte[] encryptedPgpBytes = PgpEncryptionUtility.handlePGPEncrypt(inputFile, pgpPublicKey);
        return MutualAuthUploadUtility.handleUploadOperationUsingPrivateKeyAndCerts(
            encryptedPgpBytes, endpointUrl, inputFile.getName(),
            clientPrivateKey, clientCert, serverTrustCerts
        );
    }

}
