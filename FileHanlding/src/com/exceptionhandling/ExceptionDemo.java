package com.exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10/0;
            System.out.println(a);
        }catch(Exception e) {
            e.printStackTrace();
            System.out.println("don't devided by zero");
        }

    }
}
