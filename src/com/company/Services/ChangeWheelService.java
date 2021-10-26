package com.company.Services;

import com.company.Cars.Car;
import com.company.Enums.Colours;
import com.company.Enums.WheelSize;
import com.company.Interfaces.ChangeTheWheel;

public class ChangeWheelService implements ChangeTheWheel {
    private WheelSize wheelSize;

    @Override
    public void changeTheWheel(Car car, WheelSize wheelSize) {
       this.wheelSize = wheelSize;
       car.changeWheelSize(wheelSize);
    }

}
