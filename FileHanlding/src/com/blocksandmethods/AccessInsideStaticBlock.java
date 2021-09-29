package com.blocksandmethods;

//Excercise2
//create Static blocks with access instance, static blocks and access local, static, instance methods
public class AccessInsideStaticBlock {
    int mobileIpNumber = 1001;
    String mobileBrand = "Samsung M31";
    int  mobileRamGBSize = 4;
    int mobileStroge = 128;

    public void mobilePrice()
    {
        int mobilePrice = 15000;
        System.out.println("The mobile price is: " +mobilePrice);
    }
    public static void mobileReleaseDate() {
        String releaseDate = "20/5/2021";
        System.out.println("The mobile release Date: " + releaseDate);

    }
static
    {
        String mobileColor = "Red";
        AccessInsideStaticBlock staticMethod = new AccessInsideStaticBlock();
        System.out.println("The mobile brand is :" +staticMethod. mobileBrand);
        System.out.println("The mobile color is :" + mobileColor);
        System.out.println("The mobile Ip Address number: " +staticMethod.mobileIpNumber);
        System.out.println("The mobile Ram size: "+staticMethod.mobileRamGBSize);
        System.out.println("The mobile Storage: " +staticMethod.mobileStroge);
        staticMethod.mobilePrice();
        AccessInsideStaticBlock.mobileReleaseDate();
    }
    public static void main(String[] args) {
        System.out.println("Static blocks with Static and Instance, local variables, Instance, static methods");
    }
}

