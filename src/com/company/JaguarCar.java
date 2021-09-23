package com.company;

import java.util.ArrayList;

public class JaguarCar extends Car{
    protected String colour;
    final protected String model = "Jaguar XX6";
    final protected int yearOfRelease = 2021;
    protected WheelSize wheelSize;
    final protected int engineVolume = 3;

    JaguarCar (){

    }

    JaguarCar(String color, String model, int yearOfRelease, int engineVolume, WheelSize wheelSize) {
        super(color, model, yearOfRelease, engineVolume, wheelSize);
    }
}
