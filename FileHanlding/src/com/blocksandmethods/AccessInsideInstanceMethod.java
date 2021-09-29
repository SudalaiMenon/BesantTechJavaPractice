package com.blocksandmethods;

public class AccessInsideInstanceMethod {
    int mobileIpNumber = 1002;
    String mobileBrand = "Sony Xperia";
    static int  mobileRamGBSize = 2;
    int mobileStroge = 64;

    public void mobilePrice()   //instance method
    {
        int mobilePrice = 10000;
        System.out.println("The mobile price is: " +mobilePrice);
    }
    public static void mobileReleaseDate()   //static method
    {
        String releaseDate = "20/5/2018";
        System.out.println("The mobile release Date: " + releaseDate);

    }
    public void mobileDetails()        //access inside instance method
    {
        String mobileColor = "Grey";
        System.out.println("The mobile brand is :" + mobileBrand);
        System.out.println("The mobile color is :" + mobileColor);
        System.out.println("The mobile Ip Address number: " +mobileIpNumber);
        System.out.println("The mobile Ram size: "+mobileRamGBSize);
        System.out.println("The mobile Storage: " +mobileStroge);
        mobilePrice();
        AccessInsideInstanceMethod.mobileReleaseDate();
    }
    public static void main(String[] args) {
        System.out.println("Create Instance methods with inside access local, static, instance variables and instance, static methods");
        AccessInsideInstanceMethod accessInsideInstanceMethod = new AccessInsideInstanceMethod();
        accessInsideInstanceMethod.mobileDetails();
    }

}
