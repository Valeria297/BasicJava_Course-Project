package com.company.Cars;

import com.company.Enums.*;
import com.company.Enums.EngineVolumes;
import com.company.Interfaces.ChangeColour;
import com.company.Storage;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Car {
    protected Colours colour;
    protected Models model;
    protected final int yearOfRelease = 2021;
    protected WheelSize wheelSize;
    protected EngineVolumes engineVolume;
    ArrayList<String> options = new ArrayList<>();
    Storage storage = new Storage();

    Car() {

    }

    Car(Colours colour, Models model, int yearOfRelease, EngineVolumes engineVolume, WheelSize wheelSize) {
        this.model = model;
        this.engineVolume = engineVolume;
        this.colour = colour;
        this.wheelSize = wheelSize;
    }

    public void getCar() {
        this.colour = colour;
        this.wheelSize = wheelSize;

        System.out.println("Congratulate! You make a car: \r\n"
                + colour + " " + model + " " + yearOfRelease + " with wheel size " + wheelSize
                + " and engine volume " + engineVolume + " l.");
    }


    public void getWheelSize() {
        System.out.println(Arrays.toString(WheelSize.values()));
    }

    public void changeColour(Colours colour) {
        this.colour = colour;
    }

    public void changeWheelSize(WheelSize wheelSize) {
        for (int i = 0; i < WheelSize.values().length; i++) {
            if (this.wheelSize == WheelSize.values()[i]) {
                this.wheelSize = wheelSize;
            }
        }
    }

    public void changeEngineVolume(EngineVolumes engineVolume) {
        for (int i = 0; i < EngineVolumes.values().length; i++) {
            if (this.engineVolume == EngineVolumes.values()[i]) {
                this.engineVolume = engineVolume;
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car)) {
            return false;
        }
        Car tempCar = (Car) obj;
        if (tempCar.model.equals(this.model) && tempCar.engineVolume.equals(this.engineVolume)) {
            return true;
        }
        return false;
    }

    public boolean compareCars(Car car1, Object car) {
        if (car1.equals(car)){
               return true;
        }
        return false;
    }

    public void options() {
        System.out.println("Options: " + options);
    }

    public void addOption(String str) {
        options.add(str);
    }

    public void deleteOption(String str1) {
        String element = " ";
        for (String ce : options) {
            if (ce.equals(str1)) {
                element = str1;
            }
        }
        options.remove(element);
    }

}
