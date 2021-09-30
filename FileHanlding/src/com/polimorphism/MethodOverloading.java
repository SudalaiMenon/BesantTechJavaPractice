package com.polimorphism;

public class MethodOverloading {
    static int addition (int a, int b){
        System.out.println("Add the given values:");
        return a + b;
    }
    static double subtraction(double c, double d) {
        System.out.println("Subtract the given values:");
        return c - d;
    }

    public static void main(String[] args) {
        System.out.println(MethodOverloading.addition(10,30));
        System.out.println(MethodOverloading.subtraction(50,30));

    }
}
