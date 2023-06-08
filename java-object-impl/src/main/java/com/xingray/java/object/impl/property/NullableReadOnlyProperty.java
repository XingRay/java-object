package com.xingray.java.object.impl.property;

import com.xingray.java.interfaces.nullable.Readable;
import org.jetbrains.annotations.Nullable;

public class NullableReadOnlyProperty<T> implements Readable<T> {
    @Nullable
    private final T value;

    public NullableReadOnlyProperty() {
        this(null);
    }

    public NullableReadOnlyProperty(@Nullable T value) {
        this.value = value;

    }

    @Override
    @Nullable
    public T get() {
        return value;
    }
}
