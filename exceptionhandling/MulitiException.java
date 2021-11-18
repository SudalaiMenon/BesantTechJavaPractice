package com.exceptionhandling;

public class MulitiException {
    public static void main(String args[]) {
        try {
            int y = 10 / 0;

        } catch (Exception e) {
            e.printStackTrace();

        }
//        catch (ArithmeticException e) {
//
//           e.printStackTrace();
//        }

    }
}
