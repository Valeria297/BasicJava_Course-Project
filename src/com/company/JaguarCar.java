package com.company;

import java.util.ArrayList;

public class JaguarCar extends Car{
    protected String colour;
    final protected String model = "Jaguar XX6";
    final protected int yearOfRelease = 2021;
    protected int wheelSize;
    final protected int engineVolume = 3;


    JaguarCar(String color, String model, int yearOfRelease, int wheelSize, int engineVolume) {
        super(color,model,yearOfRelease,wheelSize,engineVolume);
    }
}
