package com.example.learnjava;

public class Rectangle {
    // Exercise
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }

    public int area(){
        if(this.length < 0 || this.width < 0){
            return 0;
        }
        return this.length * this.width;
    }
}
