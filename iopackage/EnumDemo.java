package com.iopackage;

public class EnumDemo
{
    enum Color
    {
        RED, GREEN, BLUE;
    }

    public static void main(String[] args)
    {
        Color color = Color.RED;
        Color color1 = Color.GREEN;
        System.out.println(color1);
        System.out.println(color);
    }
}