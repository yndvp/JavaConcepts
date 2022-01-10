package com.example.learnjava;

public class Box extends Rectangle{
    // Exercise
    private int height;

    public Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int area() {
        return getLength() * getWidth() * height;
    }
}
