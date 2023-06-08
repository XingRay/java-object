package com.xingray.java.interfaces.observable.object;

import org.jetbrains.annotations.Nullable;

import java.util.concurrent.Executor;

public interface NullableObserver<T> {

    Executor executor();

    void onUpdate(@Nullable T oldValue, @Nullable T newValue);
}
