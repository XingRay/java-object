package com.xingray.java.interfaces.observable.object;

public interface NullableObservable<T> {
    void addObserver(NullableObserver<T> nullableObserver);
}
