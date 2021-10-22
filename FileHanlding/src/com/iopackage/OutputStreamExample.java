package com.iopackage;

import java.io.FileOutputStream;
public class OutputStreamExample {
    public static void main(String[] args){
        try {
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            String s = "Welcome to home";
            byte[] b = s.getBytes();    //converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}