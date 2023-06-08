package com.xingray.java.object.core.test;

import com.xingray.java.object.impl.property.NonNullReadOnlyProperty;
import com.xingray.java.object.impl.property.observable.ObservableNonNullReadWriteProperty;
import com.xingray.java.object.impl.property.observable.ObservableNullableReadWriteProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ProductObject {
    public final NonNullReadOnlyProperty<Long> id;
    public final NonNullReadOnlyProperty<String> name;
    public final ObservableNonNullReadWriteProperty<Double> price;
    public final ObservableNullableReadWriteProperty<String> desc;

    public ProductObject(@NotNull Long id, @NotNull String name, @NotNull Double price, @Nullable String desc) {
        this.id = new NonNullReadOnlyProperty<>(id);
        this.name = new NonNullReadOnlyProperty<>(name);
        this.price = new ObservableNonNullReadWriteProperty<>(price);
        this.desc = new ObservableNullableReadWriteProperty<>(desc);
    }
}
