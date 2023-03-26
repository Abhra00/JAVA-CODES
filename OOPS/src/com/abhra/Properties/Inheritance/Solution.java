package com.abhra.Properties.Inheritance;

import java.io.*;
import java.util.*;
class Arithmetic{
  void add(int a, int b) {
      System.out.println(a + " " + b + " " + (a + b));
  }
}
class Adder extends Arithmetic{
    Adder() {
        System.out.println("My superclass is: Arithmetic");
    }
}
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Adder obj = new Adder();
        obj.add(25, 30);
    }
}