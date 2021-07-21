package utilities.flex.exception;

public class FlexException extends Exception {
	private static final long serialVersionUID = 1L;

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