package utilities.flex.exception;

public class FlexSecurityException extends FlexException {
	private static final long serialVersionUID = 1L;

	public FlexSecurityException(String msg) {
        super(msg);
    }

    public FlexSecurityException(String msg, Exception e) {
        super(msg, e);
    }
}