package com.instancemethodandstaticmethods;

public class StaticToInstanceMethod {
    int laptopSerialNo = 1001;
    int labtopRam = 8;
    static String manufacturingMonth = "May 2021";

    public void lobtopModelOne(){
        double labtopIndiaPrice = 54000.50;
        System.out.println("Laptop Manufacturing Month :" + manufacturingMonth);
        System.out.println("Laptop Price in India:" + labtopIndiaPrice);
    }

    public static void labtopModelTwo(){
        StaticToInstanceMethod staticToInstanceMethod = new StaticToInstanceMethod();
        String labtopBrand = "HP";
        System.out.println("labtop Brand :" + labtopBrand);
        System.out.println("HP latop Serial No: " + staticToInstanceMethod.laptopSerialNo);
        System.out.println("HP labtop Ram Size: " + staticToInstanceMethod.labtopRam);
        staticToInstanceMethod.lobtopModelOne();
    }

    public static void main(String[] args){
        StaticToInstanceMethod.labtopModelTwo();

    }
}
