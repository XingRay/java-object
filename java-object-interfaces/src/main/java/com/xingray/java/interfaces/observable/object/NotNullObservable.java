package com.xingray.java.interfaces.observable.object;

public interface NotNullObservable<T> {
    void addObserver(NotNullObserver<T> observer);
}
