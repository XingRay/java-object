package com.xingray.java.object.impl.property;

import com.xingray.java.interfaces.nonnull.ReadWrite;
import org.jetbrains.annotations.NotNull;

public class NonNullReadWriteProperty<T> implements ReadWrite<T> {

    private T value;

    public NonNullReadWriteProperty(@NotNull T value) {
        this.value = value;
    }

    @Override
    @NotNull
    public T get() {
        return value;
    }

    @Override
    public void set(@NotNull T value) {
        this.value = value;
    }
}
