package com.company;

import java.util.ArrayList;

public class CarBMW extends Car{
    protected String colour;
    protected Models model;
    final protected int yearOfRelease = 2021;
    protected WheelSize wheelSize;
    protected EngineVolumes engineVolume;

    CarBMW(){

    }

    CarBMW(String color, Models model, int yearOfRelease, EngineVolumes engineVolume, WheelSize wheelSize) {
        super(color, model, yearOfRelease, engineVolume, wheelSize);
    }
}
