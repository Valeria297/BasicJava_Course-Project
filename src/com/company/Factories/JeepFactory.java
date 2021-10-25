package com.company.Factories;

import com.company.Cars.Car;
import com.company.Cars.JeepCar;
import com.company.Enums.Colours;
import com.company.Enums.EngineVolumes;
import com.company.Enums.Models;
import com.company.Enums.WheelSize;

public class JeepFactory extends Factory {

    public void makeCarJeep(Colours colour, Models model, int yearOfRelease, WheelSize whileSize, EngineVolumes engineVolume) {
        Car car = new JeepCar();
        this.colour = colour;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        storage.checkCar(car);
    }

    protected void getEngineVolumesJeep() {
        engineVolume.getEngineVolumes(Models.JEEP);
    }

    protected void getWheelSizesJeep() {
        wheelSize.getWheelSize(Models.JEEP);
    }

}
