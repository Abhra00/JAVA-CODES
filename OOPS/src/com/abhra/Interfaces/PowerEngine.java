package com.abhra.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power engine starts as usual");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stops as usual");
    }

    @Override
    public void accelearate() {
        System.out.println("Power engine accelerate as usual");
    }
}
