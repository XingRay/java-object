package com.xingray.java.interfaces.nonnull;

import org.jetbrains.annotations.NotNull;

public interface Writable<T> {
    void set(@NotNull T t);
}
