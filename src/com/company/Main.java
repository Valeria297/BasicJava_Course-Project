package com.company;


import com.company.Cars.Car;
import com.company.Cars.JeepCar;
import com.company.Enums.Colours;
import com.company.Enums.EngineVolumes;
import com.company.Enums.Models;
import com.company.Enums.WheelSize;

public class Main {

    public static void main(String[] args) {
        Car car = new JeepCar(Colours.BLUE, Models.JEEP, 2021, EngineVolumes.JE7, WheelSize.YJ50 );
        car.changeColour(Colours.BLACK);
        car.changeWheelSize(WheelSize.YJ70);
        Service service = new Service();
        service.newColour(car,Colours.ORANGE);
        car.getCar();

        car.addOption("Change the wheels");
        car.addOption("Move") ;
        car.addOption("Bip-Bip");
        car.addOption("Buy");
        car.deleteOption("Move");
        car.options();


    }
}
