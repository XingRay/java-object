package com.xingray.java.object.impl.property.observable;

import com.xingray.java.interfaces.observable.object.NullableObservable;
import com.xingray.java.interfaces.observable.object.NullableObserver;
import com.xingray.java.object.impl.property.NullableReadWriteProperty;

public class ObservableNullableReadWriteProperty<T> extends NullableReadWriteProperty<T> implements NullableObservable<T> {
    public ObservableNullableReadWriteProperty() {
    }

    public ObservableNullableReadWriteProperty(T value) {
        super(value);
    }

    @Override
    public void addObserver(NullableObserver<T> nullableObserver) {

    }
}
