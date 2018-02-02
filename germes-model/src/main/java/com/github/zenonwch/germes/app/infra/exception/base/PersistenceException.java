package com.github.zenonwch.germes.app.infra.exception.base;

/**
 * Signals about data access layer unexpected situations
 *
 * @author admin
 */
public class PersistenceException extends GermesException {
    private static final long serialVersionUID = -7889716045779735512L;

    public PersistenceException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public PersistenceException(final String message) {
        super(message);
    }
}
