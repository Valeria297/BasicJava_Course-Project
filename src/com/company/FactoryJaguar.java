package com.company;

public class FactoryJaguar extends Factory {
    protected String colour;
    protected final String model = "Jaguar";
    protected final int yearOfRelease = 2021;
    protected WheelSize wheelSize;
    protected int engineVolume;

    public void makeCarJaguar(String colour, String model, int yearOfRelease, WheelSize whileSize, int engineVolume) {
        Car car = new JaguarCar();
        this.colour = colour;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        Storage storage = new Storage();
        storage.addStorage(car);
    }
}
