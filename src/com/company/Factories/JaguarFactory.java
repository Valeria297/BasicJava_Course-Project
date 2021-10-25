package com.company.Factories;

import com.company.Cars.Car;
import com.company.Cars.JaguarCar;
import com.company.Enums.Colours;
import com.company.Enums.EngineVolumes;
import com.company.Enums.Models;
import com.company.Enums.WheelSize;
import com.company.Storage;

public class JaguarFactory extends Factory {

    public void makeCarJaguar(Colours colour, Models model, int yearOfRelease, WheelSize whileSize, EngineVolumes engineVolume) {
        Car car = new JaguarCar();
        this.colour = colour;
        this.wheelSize = wheelSize;
        this.engineVolume = engineVolume;
        storage.checkCar(car);
    }

    protected void getEngineVolumesJaguar() {
        engineVolume.getEngineVolumes(Models.JAGUAR);
    }

    protected void getWheelSizesJaguar() {
        wheelSize.getWheelSize(Models.JAGUAR);
    }

}
