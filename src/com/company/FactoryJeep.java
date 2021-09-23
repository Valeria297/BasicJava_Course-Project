package com.company;

public class FactoryJeep extends Factory {
    protected String colour;
    protected final String model = "Jeep";
    protected final int yearOfRelease = 2021;
    protected WheelSize wheelSize;
    protected int engineVolume;

    public void makeCarJeep(String colour, String model, int yearOfRelease, WheelSize whileSize, int engineVolume) {
        Car car = new JeepCar();
        this.colour = colour;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        Storage storage = new Storage();
        storage.addStorage(car);
    }
}
