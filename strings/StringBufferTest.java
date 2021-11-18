package com.strings;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("hello ");
        buffer.append("everyone");
        buffer.reverse();
        String srt = buffer.toString();
        System.out.println(srt.length());
        System.out.println(buffer);

    }
}
