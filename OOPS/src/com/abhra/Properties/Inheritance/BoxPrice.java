package com.abhra.Properties.Inheritance;

public class BoxPrice extends BoxWeight{
    int price;
    public BoxPrice(double length, double width, double height, double weight, int price) {
        super(length, width, height, weight);
        this.price = price;
    }
    BoxPrice(BoxPrice other) {
        super(other);
        this.price = other.price;
    }
}
