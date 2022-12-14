package com.example.factoryPattern.v2;

public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
