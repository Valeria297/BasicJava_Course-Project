package com.company;

import java.util.ArrayList;

public class JeepCar extends Car{
    protected String colour;
    final protected String model = "Jeep Wrangler";
    final protected int yearOfRelease = 2021;
    protected WheelSize wheelSize;
    final protected int engineVolume = 4;

    JeepCar(){

    }

    JeepCar(String color, String model, int yearOfRelease, int engineVolume, WheelSize wheelSize) {
        super(color, model, yearOfRelease, engineVolume, wheelSize);
    }
}
