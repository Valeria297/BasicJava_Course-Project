package com.company;

import java.util.ArrayList;

public class CarBMW extends Car{
    protected String colour;
    final protected String model = "BMW X6";
    final protected int yearOfRelease = 2021;
    protected int wheelSize;
    final protected int engineVolume = 3;


    CarBMW(String color, String model, int yearOfRelease, int wheelSize, int engineVolume) {
        super(color,model,yearOfRelease,wheelSize,engineVolume);
    }
}
