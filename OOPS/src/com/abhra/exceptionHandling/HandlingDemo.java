package com.abhra.exceptionHandling;

public class HandlingDemo {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        try {
            float c =(float) a / b;
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Everytime it will run!!");
        }
    }
}
