package com.abhra.Properties.Polymorphism;

public class ObjectPrint {
    int num;
    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num =" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(112233);
        System.out.println(obj.toString());
    }
}
