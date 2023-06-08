package com.xingray.java.object.impl.property.observable;

import com.xingray.java.interfaces.observable.object.NotNullObservable;
import com.xingray.java.interfaces.observable.object.NotNullObserver;
import com.xingray.java.object.impl.property.NonNullReadWriteProperty;
import org.jetbrains.annotations.NotNull;

public class ObservableNonNullReadWriteProperty<T>extends NonNullReadWriteProperty<T> implements NotNullObservable<T> {
    public ObservableNonNullReadWriteProperty(@NotNull T value) {
        super(value);
    }

    @Override
    public void addObserver(NotNullObserver<T> observer) {

    }
}
