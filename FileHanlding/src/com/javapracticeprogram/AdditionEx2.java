package com.javapracticeprogram;

//Exercise2
//Create constructor with access instance and static methods.

public class AdditionEx2 {
    int a;
    int b;
    AdditionEx2() {
        this.a = 10;
        this.b = 20;
    }
    public void add(){
        int c = a + b;
        System.out.println("Addition value is : " +c);
    }
    public static int sub(int a, int b){
        int c = a - b;
        System.out.println("Subtraction value is : " +c);
        return c;
    }


    public static void main(String[] args) {
        AdditionEx2 additionEx2 = new AdditionEx2();
        additionEx2.add();
        AdditionEx2.sub(1000,500);
    }
}
