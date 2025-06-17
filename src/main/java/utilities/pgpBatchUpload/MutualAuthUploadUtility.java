package utilities.pgpBatchUpload;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.UUID;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import Invokers.ApiException;
import Invokers.ApiResponse;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Utility class for uploading encrypted PGP files using mutual TLS authentication.
 * <p>
 * Supports multiple authentication mechanisms including JKS, P12/PFX, and direct private key/certificate usage.
 * Uses OkHttp for HTTP communication and supports multipart file uploads.
 * </p>
 */
public class MutualAuthUploadUtility {

    private static final Logger logger = LogManager.getLogger(MutualAuthUploadUtility.class);

    // Global variable to control SSL verification
    private static boolean disableSslVerification = false;

    /**
     * Handles file upload operation using JKS keystore and truststore for mutual authentication.
     * 
     * @param encryptedPgpBytes The encrypted PGP file content as byte array
     * @param endpointUrl The target URL endpoint for file upload
     * @param fileName The name of the file to be uploaded (will be suffixed with .pgp)
     * @param keystorePath The file path to the JKS keystore containing client certificates
     * @param keystorePassword The password for the JKS keystore
     * @param truststorePath (Optional) The file path to the JKS truststore containing trusted server certificates. Can be null if not required.
     * @param truststorePassword The password for the JKS truststore
     * @return ApiResponse containing the upload response details
     * @throws IOException If file operations or network communication fails
     * @throws KeyStoreException If keystore operations fail
     * @throws NoSuchAlgorithmException If required cryptographic algorithms are not available
     * @throws CertificateException If certificate processing fails
     * @throws KeyManagementException If SSL key management fails
     * @throws UnrecoverableKeyException If private key cannot be recovered from keystore
     */
    public static ApiResponse<String> handleUploadOperationWithJKS(byte[] encryptedPgpBytes, String endpointUrl, String fileName, String keystorePath,
            char[] keystorePassword, String truststorePath, char[] truststorePassword) throws IOException, KeyStoreException, 
            NoSuchAlgorithmException, CertificateException, KeyManagementException, UnrecoverableKeyException {
        
        KeyStore clientKeyStore = KeyStore.getInstance("JKS");
        KeyStore serverTrustStore = null;
        
        // Load the JKS keyStore using try-with-resources
        try (FileInputStream keyStoreFile = new FileInputStream(keystorePath)) {
            clientKeyStore.load(keyStoreFile, keystorePassword);
        }
            
        // Load the JKS trustStore using try-with-resources
        if(!StringUtils.isEmpty(truststorePath)) {
        	serverTrustStore = KeyStore.getInstance("JKS");
        	try (FileInputStream trustStoreFile = new FileInputStream(truststorePath)) {
                serverTrustStore.load(trustStoreFile, truststorePassword);
            }
        }
        
        try {
            OkHttpClient client = getOkHttpClientForMutualAuth(clientKeyStore, serverTrustStore, keystorePassword);
            return uploadFile(encryptedPgpBytes, fileName, endpointUrl, client);
        } catch (Exception e) {
            logger.error("Error during mutual auth upload operation", e);
            throw new IOException("Failed to perform upload operation with JKS", e);
        }
    }
    
    /**
     * Handles file upload operation using P12/PFX keystore and PEM server certificate(s) for mutual authentication
     *
     * @param encryptedPgpBytes The encrypted PGP file content as a byte array
     * @param endpointUrl The target URL endpoint for file upload
     * @param fileName The name of the file to be uploaded (will be suffixed with .pgp)
     * @param p12FilePath The file path to the P12/PFX keystore containing client certificates
     * @param p12FilePassword The password for the P12/PFX keystore
     * @param serverTrustCertPath (Optional) The file path to the PEM file containing one or more server trust certificates. Can be null if not required
     * @return ApiResponse containing the upload response details
     * @throws IOException If file operations or network communication fails
     * @throws KeyStoreException If keystore operations fail
     * @throws NoSuchAlgorithmException If required cryptographic algorithms are not available
     * @throws CertificateException If certificate processing fails
     * @throws KeyManagementException If SSL key management fails
     * @throws UnrecoverableKeyException If private key cannot be recovered from keystore
     */
    public static ApiResponse<String> handleUploadOperationUsingP12orPfx(byte[] encryptedPgpBytes, String endpointUrl, String fileName, String p12FilePath, char[] p12FilePassword, String serverTrustCertPath) throws IOException, KeyStoreException, 
            NoSuchAlgorithmException, CertificateException, KeyManagementException, UnrecoverableKeyException {
            
            Collection<X509Certificate> serverTrustCert;
            KeyStore clientKeyStore;
            KeyStore serverTrustStore =null;
            
            if(!StringUtils.isEmpty(serverTrustCertPath)) {
                try {
                    serverTrustCert = BatchUploadUtility.loadCertificatesFromPemFile(serverTrustCertPath);
                } catch (CertificateException e) {
                    logger.error("Error loading certificate from PEM file", e);
                    throw new CertificateException("Failed to load certificate from PEM file: " + serverTrustCertPath, e);
                }
                serverTrustStore = KeyStore.getInstance("JKS");
                serverTrustStore.load(null, null);
                int i = 0;
                for (X509Certificate cert : serverTrustCert) {
                    serverTrustStore.setCertificateEntry("server-" + i, cert);
                    i++;
                }
            }
                
            clientKeyStore = KeyStore.getInstance("PKCS12", new BouncyCastleProvider());
            
            // Use try-with-resources for proper resource management
            try (FileInputStream file = new FileInputStream(new File(p12FilePath))) {
                clientKeyStore.load(file, p12FilePassword);
            }

            try {
                OkHttpClient client = getOkHttpClientForMutualAuth(clientKeyStore, serverTrustStore, p12FilePassword);
                return uploadFile(encryptedPgpBytes, fileName, endpointUrl, client);
            } catch (Exception e) {
                logger.error("Error during P12/PFX upload operation", e);
                throw new IOException("Failed to perform upload operation with P12/PFX", e);
            }
    }
    
    /**
     * Handles file upload operation using provided private key and certificates for mutual authentication.
     * 
     * @param encryptedPgpBytes The encrypted PGP file content as byte array
     * @param endpointUrl The target URL endpoint for file upload
     * @param fileName The name of the file to be uploaded (will be suffixed with .pgp)
     * @param clientPrivateKey The client's private key for authentication
     * @param clientCert The client's X509 certificate
     * @param serverTrustCerts (Optional) A collection of server's trusted X509 certificates (can be a certificate chain). Can be null or empty if not required.
     * @return ApiResponse containing the upload response details
     * @throws KeyStoreException If keystore operations fail
     * @throws NoSuchAlgorithmException If required cryptographic algorithms are not available
     * @throws CertificateException If certificate processing fails
     * @throws IOException If file operations or network communication fails
     * @throws UnrecoverableKeyException If private key cannot be recovered
     * @throws KeyManagementException If SSL key management fails
     */
    public static ApiResponse<String> handleUploadOperationUsingPrivateKeyAndCerts(byte[] encryptedPgpBytes, String endpointUrl, String fileName, PrivateKey clientPrivateKey, X509Certificate clientCert, Collection<X509Certificate> serverTrustCerts) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException, UnrecoverableKeyException, KeyManagementException 
	{
		// Create a KeyStore containing the client private key and certificate
        KeyStore clientKeyStore = KeyStore.getInstance("PKCS12");
        clientKeyStore.load(null, null);
         
        clientKeyStore.setKeyEntry("client", clientPrivateKey, new char[] {}, new java.security.cert.Certificate[]{clientCert});

        // Create a KeyStore containing the server's trusted certificate
        KeyStore serverTrustStore =null;
        if(serverTrustCerts!=null && !serverTrustCerts.isEmpty()) {
            serverTrustStore = KeyStore.getInstance("JKS");
            serverTrustStore.load(null, null);
            int i = 0;
            for (X509Certificate cert : serverTrustCerts) {
                serverTrustStore.setCertificateEntry("server-" + i, cert);
                i++;
            }
        }
        
        try {
			OkHttpClient client = getOkHttpClientForMutualAuth(clientKeyStore, serverTrustStore, new char[] {});
			return uploadFile(encryptedPgpBytes, fileName, endpointUrl, client);
		} catch (Exception e) {
			logger.error("Error during upload operation using private/cert keys ", e);
			throw new IOException("Failed to perform upload operation with private/cert keys ", e);
		}
	}

    /**
     * Sets whether SSL verification should be disabled.
     * @param disable true to disable SSL verification, false to enable
     * By default, SSL verification is enabled.
     */
    public static void setDisableSslVerification(boolean disable) {
        logger.warn("Setting disableSslVerification to: " + disable);
        if (disable) {
            logger.warn("SSL verification is DISABLED. This setting is NOT SAFE for production and should NOT be used in production environments!");
        }
        disableSslVerification = disable;
    }
    
    /**
     * Creates an OkHttpClient configured for mutual TLS authentication.
     * 
     * @param clientKeyStore The keystore containing client certificates and private keys
     * @param serverTrustStore The truststore containing trusted server certificates
     * @param keyPassword The password for accessing private keys in the keystore
     * @return Configured OkHttpClient with mutual TLS support
     * @throws NoSuchAlgorithmException If required cryptographic algorithms are not available
     * @throws UnrecoverableKeyException If private key cannot be recovered from keystore
     * @throws KeyStoreException If keystore operations fail
     * @throws KeyManagementException If SSL key management fails
     */
    private static OkHttpClient getOkHttpClientForMutualAuth(KeyStore clientKeyStore, KeyStore serverTrustStore, 
        char[] keyPassword) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException, 
        KeyManagementException 
    {
        if (disableSslVerification) {
        	logger.warn("SSL verification is DISABLED. This setting is NOT SAFE for production and should NOT be used in production environments!");
            // Trust all certificates
            X509TrustManager trustAllManager = new X509TrustManager() {
                public void checkClientTrusted(X509Certificate[] chain, String authType) {}
                public void checkServerTrusted(X509Certificate[] chain, String authType) {}
                public X509Certificate[] getAcceptedIssuers() { return new X509Certificate[0]; }
            };
            KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            kmf.init(clientKeyStore, keyPassword);

            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(kmf.getKeyManagers(), new javax.net.ssl.TrustManager[]{trustAllManager}, new SecureRandom());

            return new OkHttpClient.Builder()
                .sslSocketFactory(sslContext.getSocketFactory(), trustAllManager)
                .hostnameVerifier((hostname, session) -> true)
                .build();
        } else {
            // Set up KeyManager and TrustManager
            KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            kmf.init(clientKeyStore, keyPassword);  // Use the provided password
            TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            tmf.init(serverTrustStore);
    
            // Create SSL context
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), new SecureRandom());
    
            // Build OkHttpClient with mutual TLS
            return new OkHttpClient.Builder()
                    .sslSocketFactory(sslContext.getSocketFactory(), (X509TrustManager) tmf.getTrustManagers()[0])
                    .build();
        }
    }
    
    /**
     * Uploads a file to the specified endpoint using the provided HTTP client.
     * 
     * @param encryptedPgpBytes The encrypted PGP file content as byte array
     * @param fileName The name of the file to be uploaded (will be suffixed with .pgp if not present)
     * @param endpointUrl The target URL endpoint for file upload
     * @param okHttpClient The configured HTTP client to use for the upload
     * @return ApiResponse containing the upload response details including status code and response body
     * @throws IOException If network communication fails or server returns an error status
     * @throws ApiException If API-specific errors occur during the upload process
     */
    private static ApiResponse<String> uploadFile(byte[] encryptedPgpBytes, String fileName, String endpointUrl, OkHttpClient okHttpClient) throws IOException, ApiException {
		logger.info("Starting file upload process");
		
		fileName = StringUtils.isEmpty(fileName) ? "file.pgp" : (fileName.contains(".") ? fileName.substring(0, fileName.lastIndexOf('.')) : fileName) + ".pgp";
		// Prepare multipart request
		RequestBody fileBody = RequestBody.create(encryptedPgpBytes, MediaType.parse("application/octet-stream"));
		MultipartBody requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM)
				.addFormDataPart("file", fileName, fileBody).build();

		String correlationId = UUID.randomUUID().toString();
		Request request = new Request.Builder().url(endpointUrl)
				.addHeader("v-c-correlation-id", correlationId).post(requestBody).build();

		logger.info("Executing HTTP POST request to URL: {} with correlation ID: {} for file: {}", endpointUrl, correlationId, fileName);
		try (Response response = okHttpClient.newCall(request).execute()) {
			int statusCode = response.code();
			String responseBody = response.body() != null ? response.body().string() : "";
			logger.info("Upload completed for correlationId: {}. Response status code: {}", correlationId, statusCode);
			if (statusCode >= 200 && statusCode < 300) {
				logger.info("File uploaded successfully for correlationId: {}", correlationId);
				return new ApiResponse<String>(response.code(), response.headers().toMultimap(), response.message(), responseBody);
			} else {
				logger.error("File upload failed for correlationId: {}. Status code: {}, response: {}", correlationId, statusCode, responseBody);
				String errorMessage= "File upload failed. Status code: " + statusCode + ", body: " + responseBody;
				throw new ApiException(errorMessage, statusCode, response.headers().toMultimap(), responseBody);
			}
		}
	}
	
}
