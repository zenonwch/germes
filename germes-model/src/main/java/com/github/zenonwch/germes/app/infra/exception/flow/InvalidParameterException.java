package com.github.zenonwch.germes.app.infra.exception.flow;

import com.github.zenonwch.germes.app.infra.exception.base.FlowException;

/**
 * Signals that incorrect parameter was passed to method/constructor
 *
 * @author admin
 */
public class InvalidParameterException extends FlowException {
    private static final long serialVersionUID = 4990959228756992926L;

    public InvalidParameterException(final String message) {
        super(message);
    }
}
