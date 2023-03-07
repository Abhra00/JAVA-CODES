package com.abhra.Properties.Inheritance;

public class Box {
    double length;
    double width;
    double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public Box(Box old) {
        this.length = old.length;
        this.width = old.width;
        this.height= old.height;
    }

//    cube

    public Box(double length) {
        this.length = length;
        this.height = length;
        this.width = length;
    }
    Box() {
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }
}
