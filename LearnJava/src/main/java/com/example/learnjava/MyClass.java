package com.example.learnjava;

public class MyClass {
    public static void main(String[] args) {
//        /*
//            Variables = bucket in memory
//         */
//
//        // String
//        String name = "Julie";
//
//        // Char: one character only
//        char letter = 'C';
//
//        // Integer: hold 32 bits
//        int age = 23;
////        int num = 19999999999; -> impossible
//
//        // Long: hold 64 bits
//        long bigNumber = 19999999999L;
//
//        // Byte: hold 8 bits
//        byte myByte = 127;
////        byte myByte = 128; -> impossible
//
//        // Short: hold 16 bits
//        short myShort = 289;
//
//        // Float: decimal numbers, hold 32 bits
//        float celsius = 45.9f;
//
//        // Double: decimal numbers, hold 64 bits
//        double height = 5.9;
//
//        // Boolean = true or false 1, 0
//        boolean isTall;
//        isTall = false;
//        System.out.println(isTall);
//
//        // Concatenation
//        System.out.println("Hello my name is " + name + " and I'm " + age + " years old.");
//
//        /*
//            Operators
//         */
//        double a = 12;
//        double b = 8;
//
//        int sum = (int) (a + b);
//        int diff = (int) (b - a);
//        int mult = (int) (a * b);
//        double quot = a / b;
//
//        // Remainder = %
//        double remainder = a % b;
//
//        System.out.println("The sum is " + sum);
//        System.out.println("The difference is " + diff);
//        System.out.println("The product is " + mult);
//        System.out.println("The quotient is " + quot);
//        System.out.println("The remainder " + remainder);

        /*
            = --> assignment

            ---Relational Operators---
            == --> comparison if(a == b)
            != --> NOT Equal if(a != b)
            < --> Less than
            > --> Greater than
            <= --> Less than or equal to
            >= --> Greater than or equal to

            ---Logical Operators---
            ! --> NOT, Negate if(!isTall)
         */
        int a = 90;
        int b = 10;
        boolean isTall = true;

        if(isTall){
            System.out.println("True");
        } else {
            System.out.println("Not true");
        }
    }
}