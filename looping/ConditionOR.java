package com.looping;

import java.util.Scanner;

public class ConditionOR {
    public static void main(String args[]) {
        String response;
        Scanner scanner = new Scanner(System.in);
        System.out.println("you are playing the game! if you quit press q or Q :");
        response = scanner.next();
        if(response.equals("q") || response.equals("Q")){
            System.out.println("You quit the game");
        }
        else
        {
            System.out.println("you are still the playing the game");
        }
    }
}
