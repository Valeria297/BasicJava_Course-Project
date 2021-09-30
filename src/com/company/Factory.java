package com.company;

import com.company.Cars.Car;
import com.company.Cars.CarBMW;
import com.company.Cars.JaguarCar;
import com.company.Cars.JeepCar;
import com.company.Enums.WheelSize;

import java.util.ArrayList;
import java.util.Arrays;

public class Factory {

    protected String[] modelsAll = {"Jeep", "BMW", "Jaguar"};
    protected String[] engineVolumeAll = {"XX3", "XX4", "XX5"};
    protected String[] carColoursAll = {"Black", "White", "Red", "Purple", "Yellow", "Grey", "Blue", "Green", "Orange"};
    protected String[] wheelSizeAll = {"X50", "X60", "X70"};
    protected String colour;
    protected final String model = "BMW";
    protected final int yearOfRelease = 2021;
    protected WheelSize wheelSize;
    protected int engineVolume;
    protected Storage storage = new Storage();

    public void makeCarBMW(String colour, String model, int yearOfRelease, WheelSize whileSize, int engineVolume) {
        Car car = new CarBMW();
        this.colour = colour;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;

        if (storage.containsCar(car)){
            storage.containsCar(car);
        }
        storage.addStorage(car);
    }
    public void makeCarJeep(String colour, String model, int yearOfRelease, WheelSize whileSize, int engineVolume) {
        Car car = new JeepCar();
        this.colour = colour;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;

        if (storage.containsCar(car)){
           storage.containsCar(car);
        }
        storage.addStorage(car);
    }
    public void makeCarJaguar(String colour, String model, int yearOfRelease, WheelSize whileSize, int engineVolume) {
        Car car = new JaguarCar();
        this.colour = colour;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;

        if ( storage.containsCar(car)){
            storage.containsCar(car);
        }
        storage.addStorage(car);
    }

    public void getAllModels() {
        System.out.println(Arrays.toString(modelsAll));
    }

    public void getEngineVolumes() {
        System.out.println(Arrays.toString(engineVolumeAll));
    }

    public void getAllCarColours() {
        System.out.println(Arrays.toString(carColoursAll));
    }

    public void getWheelSizes() {
        System.out.println(Arrays.toString(wheelSizeAll));
    }


}
