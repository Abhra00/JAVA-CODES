package com.abhra.AccessModifier;

public class B extends A{

    public B(int num) {
        super(num);
    }

    public static void main(String[] args) {
        A obj = new A(56);
        int n = obj.num;
    }
}
