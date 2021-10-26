package com.company.Services;

import com.company.Cars.Car;
import com.company.Enums.EngineVolumes;
import com.company.Interfaces.ChangeEngineVolume;

public class ChangeEngineVolumeService implements ChangeEngineVolume {
    private EngineVolumes engineVolume;

    @Override
    public void changeEngineVolume(Car car, EngineVolumes engineVolume) {
        this.engineVolume = engineVolume;
        car.changeEngineVolume(engineVolume);
    }

}
