package com.company;

import com.company.Cars.Car;
import com.company.Cars.CarBMW;
import com.company.Cars.JaguarCar;
import com.company.Cars.JeepCar;
import com.company.Enums.Colours;
import com.company.Enums.EngineVolumes;
import com.company.Enums.Models;
import com.company.Enums.WheelSize;

import java.util.ArrayList;
import java.util.Arrays;

public class Factory {
    protected Colours colour;
    protected Models model;
    protected final int yearOfRelease = 2021;
    protected WheelSize wheelSize;
    protected EngineVolumes engineVolume;
    protected Storage storage = new Storage();
    private Object ArrayList;


    public void makeCarBMW(Colours colour, Models model, int yearOfRelease, WheelSize whileSize, EngineVolumes engineVolume) {
        Car car = new CarBMW();
        this.colour = colour;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        storage.checkCar(car);
    }

    public void makeCarJaguar(Colours colour, Models model, int yearOfRelease, WheelSize whileSize, EngineVolumes engineVolume) {
        Car car = new JaguarCar();
        this.colour = colour;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        storage.checkCar(car);
    }

    public void makeCarJeep(Colours colour, Models model, int yearOfRelease, WheelSize whileSize, EngineVolumes engineVolume) {
        Car car = new JeepCar();
        this.colour = colour;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        storage.checkCar(car);
    }

    public void getAllModels() {
       model.getAllModels();
    }

    public void getEngineVolumesJeep() {
        engineVolume.getEngineVolumes(Models.JEEP);
    }

    public void getEngineVolumesBMW() {
        engineVolume.getEngineVolumes(Models.BMW);
    }

    public void getEngineVolumesJaguar() {
        engineVolume.getEngineVolumes(Models.JAGUAR);
    }

    public void getAllCarColours() {
       colour.getColours();
    }

    public void getWheelSizesJeep() {
        wheelSize.getWheelSize(Models.JEEP);
    }

    public void getWheelSizesBMW() {
        wheelSize.getWheelSize(Models.BMW);
    }

    public void getWheelSizesJaguar() {
        wheelSize.getWheelSize(Models.JAGUAR);
    }


}
