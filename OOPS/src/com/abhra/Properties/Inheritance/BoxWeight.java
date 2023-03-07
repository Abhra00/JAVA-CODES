package com.abhra.Properties.Inheritance;

public class BoxWeight extends Box{
    double weight;
    BoxWeight(BoxPrice other) {
        this.weight = -1;
    }
    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);
        this.weight = weight;  // Calls the parent class constructor
    }
}
