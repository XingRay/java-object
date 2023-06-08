package com.xingray.java.object.impl.property;

public class Property<T> {
    private T value;
    private String name;

    public Property(T value, String name) {
        this.value = value;
        this.name = name;
    }

    public String name() {
        return name;
    }
}
