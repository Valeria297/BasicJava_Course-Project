package com.company.Services;

import com.company.Interfaces.ChangeTheWheel;

public class ChangeWheelService implements ChangeTheWheel {

    @Override
    public void changeTheWheel(boolean wheelIsDamage) {
        if (wheelIsDamage == true) {
            System.out.println("The wheels is changed.");
        } else {
            System.out.println("No wheel replacement is required.");
        }
    }

}
