package com.blocksandmethods;

public class AccessInsideConstructor {
    int mobileIpNumber = 1110;
    String mobileBrand = "One Plus Nord";
    static int  mobileRamGBSize = 12;
    int mobileStroge = 256;

    public void mobilePrice()   //instance method
    {
        int mobilePrice = 39000;
        System.out.println("The mobile price is: " +mobilePrice);
    }
    public static void mobileReleaseDate()   //static method
    {
        String releaseDate = "10/8/2021";
        System.out.println("The mobile release Date: " + releaseDate);
    }
AccessInsideConstructor()        //constructor
    {
        String mobileColor = "Black";
        System.out.println("The mobile brand is :" + mobileBrand);
        System.out.println("The mobile color is :" + mobileColor);
        System.out.println("The mobile Ip Address number: " +mobileIpNumber);
        System.out.println("The mobile Ram size: "+mobileRamGBSize);
        System.out.println("The mobile Storage: " +mobileStroge);
        mobilePrice();
        AccessInsideConstructor.mobileReleaseDate();
    }
    public static void main(String[] args) {
        System.out.println("Create Constructor access inside local, static, instance variables and instance, static methods");
        new AccessInsideConstructor();
    }
}

