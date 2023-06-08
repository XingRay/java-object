package com.xingray.java.interfaces.observable.object;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Executor;

public interface NotNullObserver<T> {

    Executor executor();

    void onUpdate(@NotNull T oldValue, @NotNull T newValue);
}
