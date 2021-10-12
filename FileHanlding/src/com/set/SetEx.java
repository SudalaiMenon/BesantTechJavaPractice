package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class setEx {

    public static void main(String[] args) {

        Set s1 = new HashSet();

        s1.add(1);
        s1.add(1);
        s1.add('a');
        s1.add("aaa");
        s1.add('a');
        s1.add("aaa");
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(null);

        System.out.println(s1);

        HashSet hs1 = new HashSet();

        hs1.add(null);
        hs1.add(1);
        hs1.add(1);
        hs1.add('a');
        hs1.add("aaa");
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(null);

        System.out.println(hs1);


        hs1.add(10);
        hs1.add(20);
        hs1.add(30);

        System.out.println(hs1);
//
        HashSet hs2 = new HashSet();

        hs2.add(100);
        hs2.add(200);
        hs2.add(300);
        hs2.add(null);

        System.out.println(hs2);

        hs1.addAll(hs2); // hs1= hs1+hs2

        System.out.println(hs1);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        lhs.add(1000);
        lhs.add(3000);
        lhs.add(2000);
        lhs.add(5000);
        lhs.add(4000);
        lhs.add(null);
        lhs.add(1000);
        lhs.add(3000);
        lhs.add(2000);
        lhs.add(5000);
        lhs.add(4000);
        lhs.add(null);


        System.out.println(lhs);

        LinkedHashSet lh1 = new LinkedHashSet();

        lh1.add(100);
        lh1.add(100);
        lh1.add('a');
        lh1.add("aaa");
        lh1.add(null);


        System.out.println(lh1);

    }

}
