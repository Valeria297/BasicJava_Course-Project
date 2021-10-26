package com.company.Factories;

import com.company.Cars.Car;
import com.company.Cars.CarBMW;
import com.company.Cars.JeepCar;
import com.company.Enums.Colours;
import com.company.Enums.EngineVolumes;
import com.company.Enums.Models;
import com.company.Enums.WheelSize;

public class JeepFactory extends Factory {

    public Object makeCarJeep(Colours colour, Models model, int yearOfRelease, WheelSize whileSize, EngineVolumes engineVolume) {
        Car car = new JeepCar();

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

    protected void getEngineVolumesJeep() {
        engineVolume.getEngineVolumes(Models.JEEP);
    }

    protected void getWheelSizesJeep() {
        wheelSize.getWheelSize(Models.JEEP);
    }

}
