package com.random;

import java.util.Random;

public class RandomDemo {
    public static void main(String args[]){
        Random random = new Random();
        int x = random.nextInt(5)+10;
        boolean s = random.nextBoolean();
        System.out.println(s);
        System.out.println(x);
    }
}
