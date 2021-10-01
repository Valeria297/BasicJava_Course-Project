package com.company;

import com.company.Cars.Car;
import com.company.Enums.Colours;

import java.util.ArrayList;

public class Service {
    protected boolean wheelIsDamage = false;
    protected Colours colour;
    ArrayList<String> optionsService = new ArrayList<>();


    public void changeTheWheel(boolean wheelIsDamage) {
        if (wheelIsDamage == true) {
            System.out.println("The wheels is changed.");
        } else {
            System.out.println("No wheel replacement is required.");
        }
    }

    public void newColour(Car car, Colours colour) {
        this.colour = colour;
        car.changeColour(colour);
    }

    public void optionsService() {
        System.out.println("Options: " + optionsService);
    }

    public void addOption(String str) {
        optionsService.add(str);
    }

    public void deleteOption(String str1) {
        String element = " ";
        for (String ce : optionsService) {
            if (ce.equals(str1)) {
                element = str1;
            }
        }
        optionsService.remove(element);
    }
}
