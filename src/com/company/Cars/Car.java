package com.company.Cars;

import com.company.Enums.EngineVolumes;
import com.company.Enums.Models;
import com.company.Enums.WheelSize;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Car {
    protected String colour;
    protected Models model;
    protected final int yearOfRelease = 2021;
    protected WheelSize wheelSize;
    protected EngineVolumes engineVolume;
    ArrayList<String> options = new ArrayList<>();

    Car(){

    }

    Car(String color, Models model, int yearOfRelease, EngineVolumes engineVolume, WheelSize wheelSize) {
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

    public void changeColour(String colour) {
        this.colour = colour;
    }

    public void changeWheelSize(WheelSize wheelSize) {
        for (int i = 0; i < WheelSize.values().length; i++) {
            if (this.wheelSize != WheelSize.values()[i]) {
                this.wheelSize = wheelSize;
            }
        }
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
