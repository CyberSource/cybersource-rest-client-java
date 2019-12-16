package utilities.flex.exception;

public class FlexSDKInternalException extends FlexException {

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