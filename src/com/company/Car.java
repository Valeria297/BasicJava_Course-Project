package com.company;

public class Car {
    String mark;
    String colour;

    public void changeColour(String mark, String colour) {
        if (mark == "Audi" && colour == "Blue") {
            colour = "Red";
            System.out.println("Mark is: " + mark + "; Colour is: " + colour);
            return;
        } else if (mark == "Audi" && colour == "Red"){
            colour = "Green";
            System.out.println("Mark is: " + mark + "; Colour is: " + colour);
            return;
        } else if (mark == "Audi" && colour == "Green"){
            colour = "Blue";
            System.out.println("Mark is: " + mark + "; Colour is: " + colour);
            return;
        } else {
            System.out.println("Mark is: " + mark + "; Colour is: " + colour);
        }

        if (mark == "BMW" && colour == "Orange") {
            colour = "Black";
            System.out.println("Mark is: " + mark + "; Colour is: " + colour);
            return;
        } else if (mark == "BMW" && colour == "Black"){
            colour = "Purple";
            System.out.println("Mark is: " + mark + "; Colour is: " + colour);
            return;
        } else if (mark == "BMW" && colour == "Purple"){
            colour = "Orange";
            System.out.println("Mark is: " + mark + "; Colour is: " + colour);
            return;
        } else {
            System.out.println("Mark is: " + mark + "; Colour is: " + colour);
        }

        if (mark == "KIA" && colour == "Yellow") {
            colour = "Grey";
            System.out.println("Mark is: " + mark + "; Colour is: " + colour);
            return;
        } else if (mark == "KIA" && colour == "Grey"){
            colour = "White";
            System.out.println("Mark is: " + mark + "; Colour is: " + colour);
            return;
        } else if (mark == "KIA" && colour == "White"){
            colour = "Yellow";
            System.out.println("Mark is: " + mark + "; Colour is: " + colour);
            return;
        } else {
            System.out.println("Mark is: " + mark + "; Colour is: " + colour);
        }

    }
}
