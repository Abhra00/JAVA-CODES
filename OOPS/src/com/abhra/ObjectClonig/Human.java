package com.abhra.ObjectClonig;

public class Human implements Cloneable{
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
