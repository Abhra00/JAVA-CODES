package com.abhra.Interfaces;


public class Car implements Engine, Brake, Media{
    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal a car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car");
    }

    @Override
    public void accelearate() {
        System.out.println("I accelerate like a normal car");
    }

}
