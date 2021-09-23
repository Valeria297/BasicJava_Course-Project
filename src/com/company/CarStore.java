package com.company;

public class CarStore {
    protected String colour;
    protected String model;
    protected int yearOfRelease;
    protected WheelSize wheelSize;
    protected int engineVolume;

    public void makeOffer(String colour, String model, int yearOfRelease, WheelSize whileSize, int engineVolume) {
        Car car = new JeepCar();
        this.colour = colour;
        this.wheelSize = wheelSize;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.engineVolume = engineVolume;
        System.out.println("Congratulate! You make offer on car: \r\n"
                + colour + " " + model + " " + yearOfRelease + " with wheel size " + wheelSize
                + " and engine volume " + engineVolume + " l.");
    }
}
