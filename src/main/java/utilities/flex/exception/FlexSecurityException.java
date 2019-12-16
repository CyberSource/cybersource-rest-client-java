package utilities.flex.exception;

public class FlexSecurityException extends FlexException {

    public FlexSecurityException(String msg) {
        super(msg);
    }

    public FlexSecurityException(String msg, Exception e) {
        super(msg, e);
    }
}