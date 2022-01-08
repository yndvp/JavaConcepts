package com.example.learnjava;

public class LoopAndBranch {
    public static void main(String[] args) {
        // for-loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Counter is " + i);
        }

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0)
                System.out.println(i + " is a multiple of 2");
        }

        int i = 0;
        for (; i < 10; i++) {
            System.out.println("Counter is " + i);
        }

        // else-if statement
        char grade = 'B';

        if(grade == 'A') {
            System.out.println("A is for Awesome!");
        } else if(grade == 'B'){
            System.out.println("B is for Beautifully done!");
        } else if(grade == 'C'){
            System.out.println("C is for Careless.");
        } else if(grade == 'F'){
            System.out.println("F is for Future Unknown.");
        }

        // switch statement
        int command = 9;

        switch (command){
            case 0:
                System.out.println("CodeRunner running North");
                break;
            case 1:
                System.out.println("CodeRunner running South");
                break;
            case 2:
                System.out.println("CodeRunner running West");
                break;
            case 3:
                System.out.println("CodeRunner running East");
                break;
            default:
                System.out.println("CodeRunner is confused - doesn't know where to go!");
        }

        // switch statement - exercise
        String com = "Deposit";
        int balance = 1000;
        int amount = 100;

        switch(com) {
            case "Withdraw":
                balance -= amount;
                break;
            case "Deposit":
                balance += amount;
                break;
            default:
                System.out.println("Please choose a command");
        }
        System.out.println("Your balance used to be 1000, and now is " + balance);

        // do-while loop
        int limit = 10;
        int counter = 1;

        do {
            System.out.println("We keep counting..." + counter);
            counter++;
        } while(counter > limit);
    }
}
