package utilities.flex.exception;

public class FlexException extends Exception {

    public FlexException(final String msg) {
        super(msg);
    }

    public FlexException(final Throwable t) {
        super(t);
    }

    public FlexException(String message, Throwable t) {
        super(message, t);
    }
}