package com.company;

import java.util.ArrayList;

public class JeepCar extends Car{
    protected String colour;
    final protected String model = "Jeep Wrangler";
    final protected int yearOfRelease = 2021;
    protected int wheelSize;
    final protected int engineVolume = 4;


    JeepCar(String color, String model, int yearOfRelease, int wheelSize, int engineVolume) {
        super(color,model,yearOfRelease,wheelSize,engineVolume);
    }
}
