package com.mapinterface;

import java.util.*;

public class EntrySetDemo {
    public static void main(String[] args)
    {


        HashMap<Integer, String> hashMapDemo = new HashMap<>();


        hashMapDemo.put(10, "Early");
        hashMapDemo.put(15, "7");
        hashMapDemo.put(20, "Success");
        hashMapDemo.put(25, "Is");
        hashMapDemo.put(30, "Scam");

        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hashMapDemo);

        Set setDemo = hashMapDemo.keySet();       //key return set interface
        System.out.println("Keys only:" + setDemo);

        Collection values = hashMapDemo.values();    //values return collection
        System.out.println("Only values:" + values);

        Set<Map.Entry<Integer, String>> setKeyValue = hashMapDemo.entrySet();    //map convert into set using entrySet

        Iterator iter = setKeyValue.iterator();

        while(iter.hasNext()) {
            Map.Entry m = (Map.Entry)iter.next();
            System.out.println(m.getKey() + "----" + m.getValue() );
           // System.out.println();

        }

        // Using entrySet() to get the set view
        System.out.println("The set is: " + hashMapDemo.entrySet());
    }

}
