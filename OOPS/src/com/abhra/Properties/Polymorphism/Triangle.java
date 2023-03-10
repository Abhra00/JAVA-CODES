package com.abhra.Properties.Polymorphism;

public class Triangle extends Shapes{
    @Override // This is called annotation
    void area() {
        System.out.println("Triangle's formula is :-> 1/2 * base * height");
    }
}
