package com.abhra.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();  // No new object is created just the instance of the previous object is passed to this object
    }
}
