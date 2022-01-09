package com.example.learnjava;

public class Method {

    public static void main(String[] args) {
        showName();
        anotherMethod("Hello", 91);
        addNumbers(12,12);
        multiplyNumbers(8,6);
        divideNumbers(15, 7);

        System.out.println(addNums(2,3));
        int finalResult = addNums(4,5) + 10 + 45;
        System.out.println(finalResult);

        System.out.println(fullName("Yunna", "Jang"));

        System.out.println(showChar('A'));

        // Exercise
        System.out.println(rectArea(5,-6));
    }

    public static void showName(){
        System.out.println("From ShowName");
    }

    public static void anotherMethod(String something, int age){
        if(age > 90){
            System.out.println("I am still young");
        }
        System.out.println("Another Method " + something + " " + age);
    }

    public static void addNumbers(int a, int b){
        System.out.println("Sum is: " + a + b);
        System.out.println("Sum is: " + (a + b));
    }

    public static void multiplyNumbers(double a, double b){
        double multiply = a * b;
        System.out.println("Multiply is " + multiply);
    }

    public static void divideNumbers(double a, int b){
        System.out.println("Division is " + a / b);
    }

    /*
        Return type
        void: the function doesn't return anything
     */
    // Return an integer
    public static int addNums(int a, int b){
        int sum = a + b;
        return sum;
    }

    // Return a string
    public static String fullName(String firstName, String lastName){
        return firstName + " " +lastName;
    }

    // Return a character
    public static char showChar(char c){
        return c;
    }

    // Exercise
    public static int rectArea(int width, int length){
        int area = width * length;
        if(area < 0 ){
            area = -area;
        }
        return area;
    }
}
