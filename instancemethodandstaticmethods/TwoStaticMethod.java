package com.instancemethodandstaticmethods;

//practice
//Create two static method and access the one method to another one

public class TwoStaticMethod {
    // static variable
    static int age;
    static int personCurrentAge = 20;

    // static method
    static void birthYear() {
        System.out.println("Person Current Age = " + personCurrentAge);
        System.out.println("Person Age is 20, so eligible for voting");
    }

    static void votingAge(){
        System.out.println("The person eligible age for voting =" +age);
        birthYear();
    }

    public static void main(String[] args) {
        age = 18;                 // access the static variable
        votingAge();                 // access the static method
    }
}
