package com.abhra.Generics;

public class Main {
    public static void main(String[] args) {
        CustomArraylist<String> list = new CustomArraylist<>();
        list.add("Abhra");
        list.add("Shreya");
        System.out.println(list.toString());
    }
}
