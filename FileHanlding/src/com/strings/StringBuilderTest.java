package com.strings;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello ");
        builder.append("Everyone");
        builder.insert(6,"Java ");
        builder.delete(0,6);
       // builder.compareTo(builder);
        System.out.println(builder);
    }
}
