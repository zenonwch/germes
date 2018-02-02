package com.github.zenonwch.germes.app.infra.exception.base;


/**
 * Signals about incorrect configuration settings/parameters
 *
 * @author admin
 */
public class ConfigurationException extends GermesException {
    private static final long serialVersionUID = -2177284893894040026L;

    public ConfigurationException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ConfigurationException(final String message) {
        super(message);
    }
}
