package com.abhra.ObjectClonig;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Abhra = new Human("Abhra Mondal", 20);
        Human twin = (Human) Abhra.clone();
        System.out.println(twin.name);
        System.out.println(twin.age);
    }

}
