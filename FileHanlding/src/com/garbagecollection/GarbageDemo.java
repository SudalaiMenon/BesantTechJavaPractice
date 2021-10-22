package com.garbagecollection;

public class GarbageDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        GarbageDemo t1 = new GarbageDemo();
        GarbageDemo t2 = new GarbageDemo();

        t1 = null;

        System.gc();

        t2 = null;

        Runtime.getRuntime().gc();

    }

    @Override

    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected : " + this);
    }
}
