package com.example.learnjava;

public class OOP {
    public static void main(String[] args) {
        // Instantiate Microphone object
        Microphone microphone = new Microphone("Blue Yeti", "Blue", 133543);

        Microphone microphone1 = new Microphone("GHZB", "Red", 465);
        microphone1.setModel(999);
        microphone1.setName("New GHZB");
        microphone1.setColor("Red blue");

        // Invoking overloaded constructor
        Microphone microphone2 = new Microphone();
        microphone2.setColor("Yellow");
        System.out.println(microphone2.getColor());
        Microphone microphone3 = new Microphone("Grand", "Green");

        System.out.println(microphone.getName());
        System.out.println(microphone1.getName());

        microphone.turnOn();
        microphone.setVolume();
        microphone.turnOff();
        System.out.println(microphone.showDescription());

        microphone1.turnOn();
        microphone1.setVolume();
        microphone1.turnOff();
        System.out.println(microphone1.showDescription());

        // StringBuilder class
        String name = "Lucy";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hey my name is " + name);
        stringBuilder.append(" and I'm 45 years old!");
        System.out.println(stringBuilder);

        // Math class
        System.out.println(Math.abs(-90));
        System.out.println(Math.PI);

        // Exercise
        Rectangle rectangle = new Rectangle(10,5);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.area());

        // Exercise
        Box box = new Box(2,6,3);
        System.out.println("Area of box: " + box.area());
    }
}
