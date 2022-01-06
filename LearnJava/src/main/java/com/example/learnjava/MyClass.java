package com.example.learnjava;

public class MyClass {
    public static void main(String[] args) {
        // Variables = bucket in memory

        // String
        String name = "Julie";

        // Char: one character only
        char letter = 'C';

        // Integer: hold 32 bits
        int age = 23;
//        int num = 19999999999; -> impossible

        // Long: hold 64 bits
        long bigNumber = 19999999999L;

        // Byte: hold 8 bits
        byte myByte = 127;
//        byte myByte = 128; -> impossible

        // Short: hold 16 bits
        short myShort = 289;

        // Float: decimal numbers, hold 32 bits
        float celsius = 45.9f;

        // Double: decimal numbers, hold 64 bits
        double height = 5.9;

        // Boolean = true or false 1, 0
        boolean isTall;
        isTall = false;
        System.out.println(isTall);

        // Concatenation
        System.out.println("Hello my name is " + name + " and I'm " + age + " years old.");

    }
}