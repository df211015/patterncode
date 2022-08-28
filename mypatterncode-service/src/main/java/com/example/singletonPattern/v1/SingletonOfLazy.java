package com.example.singletonPattern.v1;

/**
 * 单例模式,单例模式
 *
 */
public final class SingletonOfLazy {
    private static final SingletonOfLazy singleton = new SingletonOfLazy();

    private SingletonOfLazy() {
    }

    public static SingletonOfLazy getSingleton() {
        return singleton;
    }
}
