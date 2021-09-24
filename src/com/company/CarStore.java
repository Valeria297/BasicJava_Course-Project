package com.company;

public class CarStore {
    protected String colour;
    protected String model;
    protected int yearOfRelease;
    protected WheelSize wheelSize;
    protected int engineVolume;

    public void makeOffer(String colour, String model, int yearOfRelease, WheelSize whileSize, int engineVolume) {
        if (this.model == "Jeep" || this.model == "JEEP") {
            FactoryJeep factoryJeep = new FactoryJeep();
            factoryJeep.makeCarJeep(this.colour, this.model, this.yearOfRelease, this.wheelSize, this.engineVolume);
        } else if (this.model == "Jaguar" || this.model == "JAGUAR"){
            FactoryJaguar factoryJaguar = new FactoryJaguar();
            factoryJaguar.makeCarJaguar(this.colour, this.model, this.yearOfRelease, this.wheelSize, this.engineVolume);
        } else if (this.model == "BMW"){
            FactoryBMW factoryBMW = new FactoryBMW();
            factoryBMW.makeCarBMW(this.colour, this.model, this.yearOfRelease, this.wheelSize, this.engineVolume);
        }

        System.out.println("Congratulate! You make offer on car: \r\n"
                + colour + " " + model + " " + yearOfRelease + " with wheel size " + wheelSize
                + " and engine volume " + engineVolume + " l.");

    }
}
