package com.abhra.introduction;

import java.sql.SQLOutput;

public class Basics {
    static class Student{
        long rNo;
        String name;
        float marks;
//        Creating constructor
        Student(long rollNo, String name, float marks) {
            this.name = name;
            this.rNo = rollNo;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(11500222123l, "Abhra Mondal", 88.5f);
        System.out.println(student1.name);
        System.out.println(student1.rNo);
        System.out.println(student1.marks);
    }
}
