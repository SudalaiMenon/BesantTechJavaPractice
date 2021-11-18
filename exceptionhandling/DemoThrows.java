package com.exceptionhandling;

class DemoThrows
{
    static void display() throws IllegalAccessException {
        System.out.println("Inside  the methods ");
        throw new IllegalAccessException("demo exception");
    }
    public static void main(String[] args)
    {
       try
        {
            display();
       }
        catch(IllegalAccessException e)
        {
            System.out.println("Exception catch in main methods");
        }
    }
}