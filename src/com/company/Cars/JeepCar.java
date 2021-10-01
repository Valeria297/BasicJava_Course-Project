package com.company.Cars;

import com.company.Enums.Colours;
import com.company.Enums.EngineVolumes;
import com.company.Enums.Models;
import com.company.Enums.WheelSize;

public class JeepCar extends Car {

    public JeepCar(){

    }

    public JeepCar(Colours colour, Models model, int yearOfRelease, EngineVolumes engineVolume, WheelSize wheelSize) {
        super(colour, model, yearOfRelease, engineVolume, wheelSize);
    }
}
