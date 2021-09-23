package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Car car = new JeepCar("White", "Jeep Wrangler", 2021, 5, WheelSize.X50 );
        car.changeColour("Black");
        car.changeWheelSize(WheelSize.X70);
        car.getCar();

        car.addOption("Change the wheels");
        car.addOption("Move") ;
        car.addOption("Bip-Bip");
        car.addOption("Buy");
        car.deleteOption("Move");
        car.options();
    }
}
