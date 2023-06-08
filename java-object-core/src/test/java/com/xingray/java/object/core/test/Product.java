package com.xingray.java.object.core.test;

import com.xingray.java.object.annotations.*;

public class Product {

    @ReadOnly
    @DisallowNull
    private Long id;

    @ReadOnly
    @DisallowNull
    private String name;

    @ReadWrite
    @DisallowNull
    @Observable
    private Double price;

    @ReadWrite
    @AllowNull
    @Observable
    private String desc;
}
