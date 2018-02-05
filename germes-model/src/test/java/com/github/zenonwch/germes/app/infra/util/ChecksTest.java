package com.github.zenonwch.germes.app.infra.util;

import com.github.zenonwch.germes.app.infra.exception.flow.InvalidParameterException;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Contains unit-tests to check functionality of {@link Checks} class
 *
 * @author admin
 */
public class ChecksTest {
    @Test
    public void testCheckParameterGetException() {
        try {
            Checks.checkParameter(false, "test");
            fail();
        } catch (final Exception e) {
            assertSame(InvalidParameterException.class, e.getClass());
            assertEquals("test", e.getMessage());
        }
    }

    @Test
    public void testCheckParameterNoException() {
        try {
            Checks.checkParameter(true, "test");
        } catch (final Exception e) {
            fail(e.getClass().getCanonicalName());
        }
    }
}