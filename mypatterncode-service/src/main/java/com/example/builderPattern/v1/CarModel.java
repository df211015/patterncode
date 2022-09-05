package com.example.builderPattern.v1;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {
    private List<String> sequence = new ArrayList<>();

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    public void run() {
        //todo
    }
}
