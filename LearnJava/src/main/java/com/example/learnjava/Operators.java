package com.example.learnjava;

public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        double a = 12;
        double b = 8;

        int sum = (int) (a + b);
        int diff = (int) (b - a);
        int mult = (int) (a * b);
        double quot = a / b;

        // Remainder = %
        double remainder = a % b;

        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + diff);
        System.out.println("The product is " + mult);
        System.out.println("The quotient is " + quot);
        System.out.println("The remainder " + remainder);

        /*
            = --> assignment operator

            ---Relational Operators---
            == --> comparison if(a == b)
            != --> NOT Equal if(a != b)
            < --> Less than
            > --> Greater than
            <= --> Less than or equal to
            >= --> Greater than or equal to

            ---Logical Operators---
            ! --> NOT, returns the reverse value of the logical expression
            && -> AND, both must be true for the whole condition to return true
            || -> OR, returns true when one or both conditions are true

         */
        boolean isTall = false;

        if(!isTall){
            System.out.println("True");
        } else {
            System.out.println("Not true");
        }

        int age = 18;
        boolean isCitizen = true;
        boolean notAFelon = false;

        if((age >= 18) && isCitizen && notAFelon) {
            System.out.println("Can vote!");
        } else {
            System.out.println("Can't vote!");
        }

        int f = 12;
        int g = 11;
        boolean isSnowing = false;

        if(f > g || isSnowing == true) {
            System.out.println("True since one or both conditions are true");
        } else {
            System.out.println("False since both conditions are false");
        }
    }
}
