package com.polimorphism;

public class ConstructorOverloading {
    ConstructorOverloading(int a, int b, int c) {
       int d = a + b + c;
        System.out.println(d);

    }
    ConstructorOverloading(double k, double v){
        double m = k * v;
        System.out.println(m);
    }

    public static void main(String[] args) {
       new ConstructorOverloading(50,20,60);
       new ConstructorOverloading(50,20);
    }
}
