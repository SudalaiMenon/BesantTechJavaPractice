package com.blocksandmethods;

public class AccessInsideStaticMethods {
    int mobileIpNumber = 1010;
    String mobileBrand = "Iphone 8";
    static int  mobileRamGBSize = 8;
    int mobileStroge = 128;

    public void mobilePrice()   //instance method
    {
        int mobilePrice = 82000;
        System.out.println("The mobile price is: " +mobilePrice);
    }
    public static void mobileReleaseDate()   //static method
    {
        String releaseDate = "01/10/2018";
        System.out.println("The mobile release Date: " + releaseDate);

    }
    public static void mobileDetails()        //access inside static method
    {
        AccessInsideStaticMethods accessInsideStaticMethods = new AccessInsideStaticMethods();
        String mobileColor = "White";
        System.out.println("The mobile brand is :" +accessInsideStaticMethods. mobileBrand);
        System.out.println("The mobile color is :" +mobileColor);
        System.out.println("The mobile Ip Address number: " +accessInsideStaticMethods.mobileIpNumber);
        System.out.println("The mobile Ram size: "+mobileRamGBSize);
        System.out.println("The mobile Storage: " +accessInsideStaticMethods.mobileStroge);
        accessInsideStaticMethods.mobilePrice();
        mobileReleaseDate();
    }
    public static void main(String[] args) {
        System.out.println("Create Static methods with inside access local, static, instance variables and instance, static methods");
        mobileDetails();
    }
}
