package com.xingray.java.object.impl.property;

import com.xingray.java.interfaces.nullable.ReadWrite;
import org.jetbrains.annotations.Nullable;

public class NullableReadWriteProperty<T> implements ReadWrite<T> {
    @Nullable
    private T value;

    public NullableReadWriteProperty() {
        this(null);
    }

    public NullableReadWriteProperty(@Nullable T value) {
        this.value = value;
    }

    @Override
    @Nullable
    public T get() {
        return value;
    }

    @Override
    public void set(@Nullable T value) {
        this.value = value;
    }
}
