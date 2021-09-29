package com.blocksandmethods;

//Excercise1
//Create instance blocks with access instance, static blocks and access local, static, instance methods

public class AccessInsideInstanceBlock {

    int mobileIpNumber = 1005;
    String mobileBrand = "Samsung A50";
    int  mobileRamGBSize = 8;
    int mobileStroge = 256;

    public void mobilePrice()
    {
        int mobilePrice = 24000;
        System.out.println("The mobile price is: " +mobilePrice);
    }
    public static void mobileReleaseDate() {
        String releaseDate = "30/9/2021";
        System.out.println("The mobile release Date: " + releaseDate);

    }

    {
        String mobileColor = "Blue";
        System.out.println("The mobile brand is :" + mobileBrand);
        System.out.println("The mobile color is :" + mobileColor);
        System.out.println("The mobile Ip Address number: " +mobileIpNumber);
        System.out.println("The mobile Ram size: "+mobileRamGBSize);
        System.out.println("The mobile Storage: " +mobileStroge);
        mobilePrice();
        AccessInsideInstanceBlock.mobileReleaseDate();
    }
    public static void main(String[] args) {
        System.out.println("Create Instance blocks with inside access Static and Instance, Local variables and  Instance, Static methods");
        new AccessInsideInstanceBlock();
    }
}
