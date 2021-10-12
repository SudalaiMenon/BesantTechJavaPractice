package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistSorting {
    public static void main(String[] args) {
        ArrayList<String> arrayListSorting = new ArrayList<>();
        arrayListSorting.add("Be kind");
        arrayListSorting.add("Dream");
        arrayListSorting.add("Express Thanks");
        arrayListSorting.add("Accept Difference");
        arrayListSorting.add("Count your Blessings");
        arrayListSorting.add("Count your Blessings");
        System.out.println(arrayListSorting);

        Collections.sort(arrayListSorting);   //Sorted arrayList
        System.out.println("After Sorting list:" + arrayListSorting);

        Iterator<String> iterator = arrayListSorting.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
