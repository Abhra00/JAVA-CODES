package com.abhra.Singleton;

public class Singleton {
//    Singleton is that type of class where you are allowed to create one instance of an object
//    So we make the constructor private\
    private Singleton() {

    }

    public static Singleton Instance;

    public static Singleton getInstance() {
        if(Instance == null) {
            Instance = new Singleton();
        }
        return Instance;
    }
}

