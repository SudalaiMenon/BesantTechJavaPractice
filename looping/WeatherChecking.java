package com.looping;

import java.util.Scanner;

public class WeatherChecking {
    public static void main(String args[]) {
        int temp = 0;
        try {
            System.out.println("Enter the temprature value:");
            Scanner scanner = new Scanner(System.in);
            temp = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Enter the integer values only");
            e.printStackTrace();
        }
        if(temp>=30) {
            System.out.println("It is hot outside");
        }
        else if(temp>=20 && temp<=30) {
            System.out.println("Its warm outside");
        }
        else {
            System.out.println("It is cold outside");
        }
    }
}
