package utilities.flex.tokenverification;

import java.util.Map;

/**
 * Response with tokenized data
 */
public class FlexToken {

    private String keyId;
    private String token;
    private String maskedPan;
    private String cardType;
    private long timestamp;
    private Map<String, Object> discoverableServices;
    private String signedFields;
    private String signature;
    private Map<String, Object> embedded;

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMaskedPan() {
        return maskedPan;
    }

    public void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Map<String, Object> getDiscoverableServices() {
        return discoverableServices;
    }

    public void setDiscoverableServices(Map<String, Object> discoverableServices) {
        this.discoverableServices = discoverableServices;
    }

    public String getSignedFields() {
        return signedFields;
    }

    public void setSignedFields(String signedFields) {
        this.signedFields = signedFields;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Map<String, Object> getEmbedded() {
        return embedded;
    }

    public void setEmbedded(Map<String, Object> embedded) {
        this.embedded = embedded;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(FlexToken.class.getSimpleName());
        sb.append('[');
        sb.append("token=").append(this.token);
        sb.append(",maskedPan=").append(this.maskedPan);
        sb.append(']');
        return sb.toString();
    }

}