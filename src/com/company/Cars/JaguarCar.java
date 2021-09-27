package com.company.Cars;

import com.company.Enums.EngineVolumes;
import com.company.Enums.Models;
import com.company.Enums.WheelSize;

public class JaguarCar extends Car {

    public JaguarCar (){

    }

    JaguarCar(String color, Models model, int yearOfRelease, EngineVolumes engineVolume, WheelSize wheelSize) {
        super(color, model, yearOfRelease, engineVolume, wheelSize);
    }
}
