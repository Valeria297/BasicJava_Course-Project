package com.company;

import java.util.ArrayList;

public class JaguarCar extends Car{
    protected String colour;
    protected Models model;
    final protected int yearOfRelease = 2021;
    protected WheelSize wheelSize;
    final protected int engineVolume = 3;

    JaguarCar (){

    }

    JaguarCar(String color, Models model, int yearOfRelease, EngineVolumes engineVolume, WheelSize wheelSize) {
        super(color, model, yearOfRelease, engineVolume, wheelSize);
    }
}
