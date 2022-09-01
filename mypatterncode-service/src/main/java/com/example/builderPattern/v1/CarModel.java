package com.example.builderPattern.v1;

public class CarModel extends Car {
    @Override
    public void start() {
        System.out.println("启动");
    }

    @Override
    public void alarm() {
        System.out.println("鸣喇叭");
    }

    @Override
    public void stop() {
        System.out.println("停止");
    }
}
