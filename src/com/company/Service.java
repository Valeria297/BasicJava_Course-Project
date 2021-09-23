package com.company;

import java.util.ArrayList;

public class Service {
    protected boolean wheelIsDamage = false;
    protected String colour;
    ArrayList<String> optionsService = new ArrayList<>(100);

    public void changeTheWheel (boolean wheelIsDamage){
        if (wheelIsDamage == true){
            System.out.println("The wheels is changed.");
        } else {
            System.out.println("No wheel replacement is required.");
        }
    }

    public void changeColour(String colour) {
        this.colour = colour;
    }


    public void optionsService () {
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
