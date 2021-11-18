package com.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

//import java.util.ArrayList;
//import java.util.ListIterator;

class Emp3{

    int e3id;
    String e3Name;

    Emp3(int e3id, String e3Name){
        this.e3id = e3id;
        this.e3Name = e3Name;
    }
}

public class ArrayListDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Emp3 e31 = new Emp3(1, "saravanan");
        Emp3 e32 = new Emp3(2, "mano");
        Emp3 e33 = new Emp3(3, "ganesh");
        Emp3 e34 = new Emp3(4, "prabu");
        Emp3 e35 = new Emp3(5, "ramesh");
        Emp3 e36 = new Emp3(6, "kavin");


        ArrayList<Emp3> al3 = new ArrayList<>();
        al3.add(e31);
        al3.add(e32);
        al3.add(e33);
        al3.add(e34);

        ListIterator<Emp3> lstr3 = al3.listIterator();
        lstr3.add(e35);

//		System.out.println(al3);
//		System.out.println(lstr3);

        while(lstr3.hasNext()) {

            Emp3 em3 = lstr3.next();
            if((em3.e3Name).equals("saravanan")) {
                lstr3.remove();
            }

            if((em3.e3Name).equals("mano")) {
                lstr3.set(e36);
            }

        }

        for(Emp3 ee : al3) {
            System.out.println(ee.e3id+"  "+ee.e3Name);
        }

    }

}
