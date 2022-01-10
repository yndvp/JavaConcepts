package Inheritance;

public class Hero extends Person{
    int power;

    // Constructors are NOT inherited in Java
    public Hero(String name, int age, int power){
        super(name, age);
        this.power = power;
    }
}
