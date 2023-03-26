package com.abhra.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric engine starts as usual");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stops as usual");
    }

    @Override
    public void accelearate() {
        System.out.println("Electric engine accelerate as usual");
    }
}
