package com.company;

public class Service {
    public boolean wheelIsDamage = false;
    public void changeTheWheel (){
        if (wheelIsDamage == true){
            System.out.println("The wheels is changed.");
        } else {
            System.out.println("No wheel replacement is required.");
        }
    }
}
