package com.company;

public class FactoryBMW extends Factory {
    protected String colour;
    protected final String model = "BMW";
    protected final int yearOfRelease = 2021;
    protected WheelSize wheelSize;
    protected int engineVolume;

    public void makeCarBMW(String colour, String model, int yearOfRelease, WheelSize whileSize, int engineVolume) {
        Car car = new CarBMW();
        this.colour = colour;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        Storage storage = new Storage();
        storage.addStorage(car);
    }
}
