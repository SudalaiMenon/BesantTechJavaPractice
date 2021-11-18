package com.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(10);
        al.add(10.01);
        al.add('a');
        al.add("aaa");
        al.add(10);
        al.add(null);
        al.add(true);

        System.out.println(al);

        al.remove(0);
        System.out.println(al.contains("hello"));
        System.out.println(al);

        al.add('a');
        al.add("aaa");
        al.add(10);

        System.out.println(al);

    }
}
