package com.instancemethodandstaticmethods;


//practice
//create two instance methods and access one and another method

public class TwoInstanceMethod {
    public void animal(){                //instance method1
        String tiger = "National Animal India";
        System.out.println("Tiger is the " +tiger);
    }

    public void bird(){                 //instance method2
        String peakock = "National bird in India";
        System.out.println("Peacock is the " +peakock);
        animal();

    }

    public static void main(String[] args) {
        TwoInstanceMethod twoInstanceMethod = new TwoInstanceMethod();
        twoInstanceMethod.bird();
    }
}
