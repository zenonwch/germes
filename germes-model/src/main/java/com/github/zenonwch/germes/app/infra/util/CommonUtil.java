package com.github.zenonwch.germes.app.infra.util;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

/**
 * Contains utility functions for the general purposes
 *
 * @author admin
 */
public final class CommonUtil {
    private CommonUtil() {
    }

    /**
     * Returns not-null unmodifiable copy of the source set
     * @param src .
     * @return Unmodifiable Set<T>
     */
    public static <T> Set<T> getSafeSet(final Set<T> src) {
        //noinspection NestedMethodCall
        return Collections.unmodifiableSet(Optional.ofNullable(src).orElse(Collections.emptySet()));
    }
}
