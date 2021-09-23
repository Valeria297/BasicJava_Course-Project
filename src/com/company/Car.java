package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public abstract class Car {
    protected String colour;
    protected String model;
    protected int yearOfRelease;
    protected int wheelSize;
    protected int engineVolume;
    ArrayList<String> options = new ArrayList<>(100);

    Car() {

    }

    Car(String color, String model, int yearOfRelease, int wheelSize, int engineVolume) {
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.engineVolume = engineVolume;
        this.colour = colour;
        this.wheelSize = wheelSize;
    }

    public void getCar() {
        this.colour = colour;
        this.wheelSize = wheelSize;

        System.out.println("Congratulate! You make offer on car: \r\n"
                + colour + " " + model + " " + yearOfRelease + " with wheel size " + wheelSize
                + " sm and engine volume " + engineVolume + " l.");
    }

    public void changeColour(String colour) {
        this.colour = colour;
    }

    public void changeWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void options() {
        options.add("Move");
        options.add("Bip-Bip");
        options.add("Stop moving");
        options.add("Buy");
        System.out.println("Options: " + options);
    }

    public String getOptions() {
        return options.toString();
    }

    public void addOption(String str) {
        options.add(str);
    }

    public void deleteOption(String str1) {
        System.out.println(options);
        String element = " ";
        for (String ce : options) {
            if (ce.equals(str1)) {
                element = str1;
            }
        }
        options.remove(element);

    }
}
