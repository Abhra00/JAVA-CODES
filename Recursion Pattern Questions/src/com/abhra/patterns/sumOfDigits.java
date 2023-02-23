package com.abhra.patterns;

public class sumOfDigits {

    public static void main(String[] args) {
        System.out.println(digitSum(345));
    }

    static int digitSum(int n) {
        if(n == 0) {
            return 0;
        }
        int digit = n % 10;
        return digit + digitSum(n / 10);
    }
}
