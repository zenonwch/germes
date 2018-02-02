package com.github.zenonwch.germes.app.infra.exception.base;

/**
 * Signals about exception cases in the work of external services and API
 *
 * @author admin
 */
public class CommunicationException extends GermesException {
    private static final long serialVersionUID = -2850898723336164866L;

    public CommunicationException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public CommunicationException(final String message) {
        super(message);
    }
}
