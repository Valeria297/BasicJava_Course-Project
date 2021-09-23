package com.company;

import java.util.ArrayList;

public class CarBMW extends Car{
    protected String colour;
    final protected String model = "BMW X6";
    final protected int yearOfRelease = 2021;
    protected WheelSize wheelSize;
    final protected int engineVolume = 3;

    CarBMW(){

    }

    CarBMW(String color, String model, int yearOfRelease, int engineVolume, WheelSize wheelSize) {
        super(color, model, yearOfRelease, engineVolume, wheelSize);
    }
}
