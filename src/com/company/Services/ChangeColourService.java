package com.company.Services;

import com.company.Cars.Car;
import com.company.Enums.Colours;
import com.company.Interfaces.ChangeColour;

public class ChangeColourService implements ChangeColour {
    private Colours colour;

    @Override
    public void changeColour(Car car, Colours colour) {
        this.colour = colour;
        car.changeColour(colour);
    }

}
