package com.abhra.Interfaces;

public class CdPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Music has started");
    }

    @Override
    public void stop() {
        System.out.println("Music has stopped");
    }
}
