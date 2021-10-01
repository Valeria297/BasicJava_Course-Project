package com.company;

import com.company.Enums.Colours;
import com.company.Enums.EngineVolumes;
import com.company.Enums.Models;
import com.company.Enums.WheelSize;

public class CarStore {
    protected Colours colour;
    protected Models model;
    protected int yearOfRelease;
    protected WheelSize wheelSize;
    protected EngineVolumes engineVolume;
    protected Factory factory = new Factory();

    public void makeOffer(Colours colour, Models model, int yearOfRelease, WheelSize whileSize, EngineVolumes engineVolume) {
        if (this.model == Models.JEEP) {
            factory.makeCarJeep(this.colour, this.model, this.yearOfRelease, this.wheelSize, this.engineVolume);
        } else if (this.model == Models.JAGUAR) {
            factory.makeCarJaguar(this.colour, this.model, this.yearOfRelease, this.wheelSize, this.engineVolume);
        } else if (this.model == Models.BMW) {
            factory.makeCarBMW(this.colour, this.model, this.yearOfRelease, this.wheelSize, this.engineVolume);
        }

        System.out.println("Congratulate! You make offer on car: \r\n"
                + colour + " " + model + " " + yearOfRelease + " with wheel size " + wheelSize
                + " and engine volume " + engineVolume + " l.");

    }
}
