package utilities.pgpBatchUpload;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bouncycastle.openpgp.PGPCompressedData;
import org.bouncycastle.openpgp.PGPCompressedDataGenerator;
import org.bouncycastle.openpgp.PGPEncryptedData;
import org.bouncycastle.openpgp.PGPEncryptedDataGenerator;
import org.bouncycastle.openpgp.PGPException;
import org.bouncycastle.openpgp.PGPLiteralData;
import org.bouncycastle.openpgp.PGPPublicKey;
import org.bouncycastle.openpgp.PGPUtil;
import org.bouncycastle.openpgp.operator.jcajce.JcePGPDataEncryptorBuilder;
import org.bouncycastle.openpgp.operator.jcajce.JcePublicKeyKeyEncryptionMethodGenerator;

/**
 * Utility class for encrypting files using PGP (Pretty Good Privacy) encryption with BouncyCastle.
 * <p>
 * Provides methods to encrypt files using a PGP public key, supporting both key file paths and direct key objects.
 * </p>
 */
public class PgpEncryptionUtility {
    
    private static final Logger logger = LogManager.getLogger(PgpEncryptionUtility.class);
    private static int bufferSize = 65536;
    
    static {
        if (java.security.Security.getProvider("BC") == null) {
            java.security.Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        }
    }
    
    /**
     * Encrypts the given input file using the PGP public key located at the specified path.
     *
     * @param inputFile        The file to encrypt.
     * @param pgpPublicKeyPath The file path to the PGP public key.
     * @return The encrypted file as a byte array.
     * @throws IOException              If an I/O error occurs.
     * @throws PGPException             If a PGP error occurs.
     * @throws IllegalArgumentException If required arguments are missing.
     */
    public static byte[] handlePGPEncrypt(File inputFile, String pgpPublicKeyPath) 
        throws IOException, PGPException, IllegalArgumentException {
        PGPPublicKey publicKey = BatchUploadUtility.readPGPPublicKey(pgpPublicKeyPath);
        return handlePGPEncrypt(inputFile, publicKey);
    }

    /**
     * Encrypts the given input file using the provided PGP public key.
     *
     * @param inputFile    The file to encrypt.
     * @param pgpPublicKey The PGP public key to use for encryption.
     * @return The encrypted file as a byte array.
     * @throws IOException              If an I/O error occurs.
     * @throws PGPException             If a PGP error occurs.
     * @throws IllegalArgumentException If required arguments are missing.
     */
    public static byte[] handlePGPEncrypt(File inputFile, PGPPublicKey pgpPublicKey) throws IOException, PGPException {
        if (inputFile == null || pgpPublicKey == null) {
            throw new IllegalArgumentException("Missing required options for encrypt operation");
        }
        String inputFileName = inputFile.getName();
        
        logger.info("Starting file encryption: {}", inputFileName);
        byte[] encryptedPgpBytes = encryptFile(inputFile, pgpPublicKey);
        logger.info("File encrypted successfully for {}", inputFileName);
        return encryptedPgpBytes;
    }

    /**
     * Encrypts the given file using the specified PGP public key.
     *
     * @param inputFile The file to encrypt.
     * @param publicKey The PGP public key to use for encryption.
     * @return The encrypted file as a byte array.
     * @throws IOException  If an I/O error occurs.
     * @throws PGPException If a PGP error occurs.
     */
    private static byte[] encryptFile(File inputFile, PGPPublicKey publicKey) throws IOException, PGPException {
        try (ByteArrayOutputStream byteOut = new ByteArrayOutputStream()) {
            PGPEncryptedDataGenerator encGen = new PGPEncryptedDataGenerator(
                    new JcePGPDataEncryptorBuilder(PGPEncryptedData.AES_256)
                    .setWithIntegrityPacket(true)
                    .setSecureRandom(new SecureRandom())
                    .setProvider("BC")
            );
            encGen.addMethod(new JcePublicKeyKeyEncryptionMethodGenerator(publicKey).setProvider("BC"));
            try (OutputStream encOut = encGen.open(byteOut, new byte[bufferSize])) {
                PGPCompressedDataGenerator comData = new PGPCompressedDataGenerator(PGPCompressedData.ZIP);
                try (OutputStream comOut = comData.open(encOut)) {
                    PGPUtil.writeFileToLiteralData(comOut, PGPLiteralData.BINARY, inputFile);
                }
            }
            return byteOut.toByteArray();
        }
    }

    /**
     * Optionally sets the buffer size used during encryption.
     *
     * @param size The buffer size in bytes.
     */
    public static void setBufferSize(int size) {
        bufferSize = size;
    }
}
