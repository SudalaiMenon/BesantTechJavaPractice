package com.exceptionhandling;

class ArithmeticExceptionDivision {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 5, result;
        try {
            result = a / (b - c);
            System.out.println("result" + result);
        } catch (ArithmeticException e) {
            System.out.println("Catch the Exception : Division by zero");
        } finally {
            System.out.println("final block");
        }
    }
}