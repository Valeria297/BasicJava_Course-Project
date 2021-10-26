package com.company.Factories;

import com.company.Cars.Car;
import com.company.Cars.CarBMW;
import com.company.Cars.JaguarCar;
import com.company.Enums.Colours;
import com.company.Enums.EngineVolumes;
import com.company.Enums.Models;
import com.company.Enums.WheelSize;
import com.company.Storage;

public class JaguarFactory extends Factory {

    public Object makeCarJaguar(Colours colour, Models model, int yearOfRelease, WheelSize whileSize, EngineVolumes engineVolume) {
        Car car = new JaguarCar();

        if (storage.checkCar(car).equals(false)) {
            this.colour = colour;
            this.wheelSize = wheelSize;
            this.engineVolume = engineVolume;
            return car;
        } else {
            car = (Car) storage.checkCar(car);
            return false;
        }
    }

    protected void getEngineVolumesJaguar() {
        engineVolume.getEngineVolumes(Models.JAGUAR);
    }

    protected void getWheelSizesJaguar() {
        wheelSize.getWheelSize(Models.JAGUAR);
    }

}
