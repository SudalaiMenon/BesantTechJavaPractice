package com.mapinterface;

import java.util.HashMap;
import java.util.Map;

class PutInMap {
    public static void main(String[] args)
    {

        // Initialization of a Map
        // using Generics
        Map<Integer, String> hashMap = new HashMap<>();

        // Inserting the Elements

        hashMap.put(1, "Hello");
        hashMap.put(2, "Everyone");
        hashMap.put(3, "Everyone");

        System.out.println("put the key value pairs " + hashMap);

        hashMap.put(2, "All");



        System.out.println("Change the key value pair " + hashMap);
    }
}