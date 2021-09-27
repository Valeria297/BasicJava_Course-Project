package com.company;

import com.company.Enums.WheelSize;

public class CarStore {
    protected String colour;
    protected String model;
    protected int yearOfRelease;
    protected WheelSize wheelSize;
    protected int engineVolume;
    protected Factory factory = new Factory();

    public void makeOffer(String colour, String model, int yearOfRelease, WheelSize whileSize, int engineVolume) {
        if (this.model == "Jeep" || this.model == "JEEP") {
            factory.makeCarJeep(this.colour, this.model, this.yearOfRelease, this.wheelSize, this.engineVolume);
        } else if (this.model == "Jaguar" || this.model == "JAGUAR") {
            factory.makeCarJaguar(this.colour, this.model, this.yearOfRelease, this.wheelSize, this.engineVolume);
        } else if (this.model == "BMW") {
            factory.makeCarBMW(this.colour, this.model, this.yearOfRelease, this.wheelSize, this.engineVolume);
        }

        System.out.println("Congratulate! You make offer on car: \r\n"
                + colour + " " + model + " " + yearOfRelease + " with wheel size " + wheelSize
                + " and engine volume " + engineVolume + " l.");

    }
}
