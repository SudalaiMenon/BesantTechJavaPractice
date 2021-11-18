package com.javapracticeprogram;

//Exercise3
//Create Instance block with access local, instance, static variables and instance and static methods.

public class InstanceBlockEx3 {
    int studentRollNo = 1005;
    String studentName = "Surya";
    int tamilMark = 80;
    int englishMark = 62;

    public void computerScience()
    {
        int computerMark = 95;
        System.out.println("Computer Science mark: " +computerMark);
    }
    public static void schoolName() {
        String schoolName = "Government Higher Secondary School";
        System.out.println("School Name: " + schoolName);

    }

    {
        int mathsMark = 90;
        System.out.println("Student Roll Number: " + studentRollNo);
        System.out.println("Student Name :" + studentName);
        System.out.println("Student Tamil mark: "+ tamilMark);
        System.out.println("Student English mark: " + englishMark);
        InstanceBlockEx3.schoolName();
        System.out.println("Maths mark :" + mathsMark);

        computerScience();

    }
    public static void main(String[] args) {
        new InstanceBlockEx3();
    }
}
