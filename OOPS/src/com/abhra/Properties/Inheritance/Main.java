package com.abhra.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(23, 22, 12);
        System.out.println(box1.height + " " + box1.length + " " + box1.width);
        Box box2 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box2);
        BoxPrice box3 = new BoxPrice(2, 3, 4, 5, 12);
        System.out.println(box3.length + " " + box3.price);
        BoxPrice box4 = new BoxPrice(box3);
        System.out.println(box4.price);
    }
}
