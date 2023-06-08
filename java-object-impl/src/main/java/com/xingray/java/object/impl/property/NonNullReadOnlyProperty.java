package com.xingray.java.object.impl.property;

import com.xingray.java.interfaces.nonnull.Readable;
import org.jetbrains.annotations.NotNull;

public class NonNullReadOnlyProperty<T> implements Readable<T> {
    private final T value;

    public NonNullReadOnlyProperty(@NotNull T value) {
        this.value = value;
    }

    @Override
    @NotNull
    public T get() {
        return value;
    }
}
