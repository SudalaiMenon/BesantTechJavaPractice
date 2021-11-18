package com.arraylist;


import java.util.ArrayList;
import java.util.Iterator;

class ArrayListGenerics {
    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<>();
        list.add("Madhan ");
        list.add("Gowri");

        //list.add(32);

        try {
            String s = list.get(0);      //type casting is not required
            System.out.println("Element is : "+ s);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}