package com.polimorphism;

public class OverloadedMethod {
    public int calculate(int a, int b) {
        return a + b;
    }
    public int calculate(int a,int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        OverloadedMethod overloadedMethod = new OverloadedMethod();
        System.out.println(overloadedMethod.calculate(10,10));
        System.out.println(overloadedMethod.calculate(10,10,10));
    }
}
