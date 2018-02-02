package com.github.zenonwch.germes.app.infra.exception.base;

/**
 * Signals about exceptional cases in the application logic
 *
 * @author admin
 */
public class FlowException extends GermesException {
    private static final long serialVersionUID = -2889607185988464072L;

    public FlowException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public FlowException(final String message) {
        super(message);
    }
}
