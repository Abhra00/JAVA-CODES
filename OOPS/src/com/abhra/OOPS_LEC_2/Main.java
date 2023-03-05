package com.abhra.OOPS_LEC_2;

public class Main {
    public static void main(String[] args) {
        Human abhra = new Human("Abhra Mondal", 20, 1_50_000);
        Human rahul = new Human("Rahul Mondal", 22, 1_20_000);
        System.out.println(abhra.name);
        System.out.println(abhra.age);
        System.out.println(abhra.salary);
        System.out.println(Human.population);
    }


}
