package com.threadconcept;

 public class MultithreadingDemo extends Thread {
    public void run()
    {
        try {
            System.out.println("Thread is running " + Thread.currentThread().getId());
        }
        catch (Exception e) {

            System.out.println("Exception is caught");
        }
    }
}

class Multithreading {
    public static void main(String[] args)
    {
        int n = 8;
        for (int i = 0; i < n; i++)
        {
            MultithreadingDemo multithreadingDemo = new MultithreadingDemo();
            multithreadingDemo.start();
        }
    }
}
