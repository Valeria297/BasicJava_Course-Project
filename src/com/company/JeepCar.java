package com.company;

import java.util.ArrayList;

public class JeepCar extends Car{
    protected String colour;
    protected Models model;
    protected int yearOfRelease = 2021;
    protected WheelSize wheelSize;
    protected EngineVolumes engineVolume;

    JeepCar(){

    }

    JeepCar(String color, Models model, int yearOfRelease, EngineVolumes engineVolume, WheelSize wheelSize) {

        super(color, model, yearOfRelease, engineVolume, wheelSize);

        if (this.yearOfRelease < 2000 && this.yearOfRelease > 2022){
            System.out.println("Please, input the correct data");
        }
    }
}
