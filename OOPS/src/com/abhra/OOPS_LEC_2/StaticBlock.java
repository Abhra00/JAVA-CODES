package com.abhra.OOPS_LEC_2;
public class StaticBlock {
    static int a = 4;
    static int b;
//    Static block is used to initialize static variable And it will exactly run once while the class is being loaded
    static {
        System.out.println("I am inside the static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        System.out.println(obj1.a + " " + obj1.b);
        obj1.b += 3;
        System.out.println(obj1.a + " " + obj1.b);
        StaticBlock obj2 = new StaticBlock();
        System.out.println(obj1.a + " " + obj1.b);
    }
}
