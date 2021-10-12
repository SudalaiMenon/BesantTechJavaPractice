package com.arraylist;


import java.util.ArrayList;

class StudentDetails {

    int studentId;             //instance variable
    String studentName;

    StudentDetails(int studentId, String studentName){
        this.studentId = studentId;          //access instance variable using this keyword
        this.studentName = studentName;
    }
}
public class ArrayListDemo2 {

    public static void main(String[] args) {

        StudentDetails studentOne = new StudentDetails(100, "Murugan");
        StudentDetails studentTwo = new StudentDetails(200, "Rajan");
        StudentDetails studentThree = new StudentDetails(300, "Madhavan");

        ArrayList<StudentDetails> al = new ArrayList<>();     //generic collection

        al.add(studentOne);
        al.add(studentTwo);
        al.add(studentThree);
      //  al.remove(0);

        for (StudentDetails stud : al) {                      //student deatail to al object
            System.out.println(stud.studentId + " " + stud.studentName);
        }

    }
}













