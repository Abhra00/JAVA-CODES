package com.abhra.OOPS_LEC_2;
//Packages are nothing but folders
public class Human {
    int salary;
    String name;
    int age;
    static long population;
    // Static variables and methods can be accessed without creating an object of that class
   //    So basically they are not dependent to objects; static variables or methods belongs to the class and
    //   same for every object
    Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population += 1;  //good convention to do it like this instead of this reference
    }
}
