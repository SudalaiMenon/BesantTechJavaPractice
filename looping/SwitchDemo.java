package com.looping;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        int n = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your pincode:");
            n = sc.nextInt();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Enter available pincode only");
        }
        switch (n) {
            case 600020:
                System.out.println("Adyar");
                break;
            case 600004:
                System.out.println("Mylapore");
            case 600021:
                System.out.println("Nungambakkam");
                break;
            default:
                System.out.println("Not Matched pincode");

        }
    }
}
