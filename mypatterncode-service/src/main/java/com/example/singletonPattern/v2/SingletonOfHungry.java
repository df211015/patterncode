package com.example.singletonPattern.v2;

/**
 * 单例模式,懒汉式
 */
public final class SingletonOfHungry {
    private static SingletonOfHungry instance = null;

    private SingletonOfHungry() {
    }

    public synchronized SingletonOfHungry getInstance() {
        if (null == instance) {
            instance = new SingletonOfHungry();
        }

        return instance;
    }
}