package com.looping;

public class NestedForLoop
{
    public static void main(String[] args)
    {
        int i, j;
        for( i = 0 ; i <= 5 ; i++)
        {          //outer loop
            //System.out.println('\n');
            for( j = 0 ; j <= i ; j++)  //inner loop
                System.out.println("* ");
           System.out.println();
        }
      //  System.out.println(" ");
    }
}