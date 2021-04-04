package utilities.flex.exception;

public class FlexSDKInternalException extends FlexException {
	private static final long serialVersionUID = 1L;

	public FlexSDKInternalException(String msg) {
        super(msg);
    }

    public FlexSDKInternalException(Throwable t) {
        super(t);
    }

    public FlexSDKInternalException(String message, Throwable t) {
        super(message, t);
    }
}