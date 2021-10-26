package com.company.Factories;

import com.company.Cars.Car;
import com.company.Cars.CarBMW;
import com.company.Cars.JaguarCar;
import com.company.Cars.JeepCar;
import com.company.Enums.Colours;
import com.company.Enums.EngineVolumes;
import com.company.Enums.Models;
import com.company.Enums.WheelSize;
import com.company.Interfaces.ChangeEngineVolume;
import com.company.Services.ChangeColourService;
import com.company.Services.ChangeEngineVolumeService;
import com.company.Services.ChangeWheelService;
import com.company.Storage;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Factory {
    protected Colours colour;
    protected Models model;
    protected final int yearOfRelease = 2021;
    protected WheelSize wheelSize;
    protected EngineVolumes engineVolume;
    protected Storage storage = new Storage();


    protected void getAllModels() {
       model.getAllModels();
    }

    protected void getAllCarColours() {
       colour.getColours();
    }

}
