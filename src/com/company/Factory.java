package com.company;

import java.util.Arrays;

public class Factory {
    protected String[] models = {"Jeep", "BMW", "Jaguar"};
    protected int[] engineVolume = {3, 4, 5};
    protected String[] carColours = {"Black", "White", "Red", "Purple", "Yellow", "Grey", "Blue", "Green", "Orange"};
    protected String[] wheelSize = {"X50", "X60", "X70"};

    public void getAllModels() {
        System.out.println(Arrays.toString(models));
    }

    public void getEngineVolumes() {
        System.out.println(Arrays.toString(engineVolume));
    }

    public void getAllCarColours() {
        System.out.println(Arrays.toString(carColours));
    }

    public void getWheelSizes() {
        System.out.println(Arrays.toString(wheelSize));
    }

}
