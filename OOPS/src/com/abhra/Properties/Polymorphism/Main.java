package com.abhra.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes obj = new Shapes();
        System.out.println(obj.toString());
        Circle c1 = new Circle();
        Triangle t1 = new Triangle();
        c1.area();  // area method is being overridden and which function will be called it properly depends upon the type of object
//      even if the reference variable is type of parent class
//        The reference type defines which things we can access
//        The object type defines which method will be  called and this is done during the runtime and java determines this via dynamic method dispatch
//        Example :->
        Shapes obj1 = new Triangle(); // This is called upcasting
        obj1.area();

    }
}
