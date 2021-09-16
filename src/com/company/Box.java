package com.company;

public class Box {
    int height;
    int width;
    int length;

    Box (){

    }

    Box (int height){

    }

    Box (int length, int width){

    }

    Box (int height, int width, int length) {

    }

    public void getBoxType(int height) {
        System.out.println("It is a cube!");
    }

    public void getBoxType(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;

        if (height == length && length == width) {
            System.out.println("It is a cube!");
        } else {
            System.out.println("It's just a box!");
        }
    }

    public void getBoxType(int width, int length) {
        System.out.println("It is a letter");
    }
}
