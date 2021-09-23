package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Car car = new JeepCar("White", "Jeep Wrangler", 2021, 50, 4);
        car.changeColour("Black");
        car.changeWheelSize(60);
        car.getCar();

        car.addOption("Change the wheels");
        car.deleteOption("Move");
        car.options();
    }
}
