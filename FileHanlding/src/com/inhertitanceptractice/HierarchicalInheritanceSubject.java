package com.inhertitanceptractice;

public class HierarchicalInheritanceSubject {
    int studentRollNumber = 1001;       //variables
    String studentName = "Saravanan";

    static {                              //static blocks
        HierarchicalInheritanceSubject hierarchicalInheritanceSubject = new HierarchicalInheritanceSubject();
        System.out.println("Enter the Student Roll Number: " + hierarchicalInheritanceSubject.studentRollNumber);
        System.out.println("Enter the Student Name: "+ hierarchicalInheritanceSubject.studentName);
    }

  static void englishMark() {
      int englishMark = 95;
      System.out.println("Students English Marks: " + englishMark);
  }
      {
          HierarchicalInheritanceSubject.englishMark();  //static methods calling
      }


    static class ComputerScience extends HierarchicalInheritanceSubject
    {
        public void computerMark(){     //methods
            int computerMarks = 95;
            System.out.println("Students Computer Science Marks: " +computerMarks);
        }
        {

           computerMark();                //instance block
        }

    }
    static class Maths extends HierarchicalInheritanceSubject{

        Maths(){                              //constructor
            int mathsMarks = 64;
            System.out.println("Student Maths Marks: " +mathsMarks);

        }
    }


    public static void main(String[] args) {
     new Maths();
     new ComputerScience();
    }
}
