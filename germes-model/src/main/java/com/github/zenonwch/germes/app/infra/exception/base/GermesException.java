package com.github.zenonwch.germes.app.infra.exception.base;

/**
 * Base class for all application-specific exceptions
 *
 * @author admin
 */
public class GermesException extends RuntimeException {
    private static final long serialVersionUID = 7837501112802868980L;

    public GermesException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public GermesException(final String message) {
        super(message);
    }
}
