package com.company.Factories;

import com.company.Cars.Car;
import com.company.Cars.CarBMW;
import com.company.Enums.Colours;
import com.company.Enums.EngineVolumes;
import com.company.Enums.Models;
import com.company.Enums.WheelSize;
import com.company.Storage;

public class FactoryBMW extends Factory {

    public void makeCarBMW(Colours colour, Models model, int yearOfRelease, WheelSize whileSize, EngineVolumes engineVolume) {
        Car car = new CarBMW();
        this.colour = colour;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        storage.checkCar(car);
    }

    protected void getEngineVolumesBMW() {
        engineVolume.getEngineVolumes(Models.BMW);
    }

    protected void getWheelSizesBMW() {
        wheelSize.getWheelSize(Models.BMW);
    }

}
