package com.xingray.java.interfaces.nonnull;

import org.jetbrains.annotations.NotNull;

public interface Readable<T> {
    @NotNull
    T get();
}
