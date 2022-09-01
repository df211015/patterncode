package com.example.builderPattern.v1;

public abstract class Car {
    public abstract void start();

    public abstract void alarm();

    public abstract void stop();

    /**
     * 模板方法
     */
    public void run() {
        this.start();
        this.alarm();
        this.stop();
    }
}
