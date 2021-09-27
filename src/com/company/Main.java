package com.company;


import com.company.Cars.Car;
import com.company.Cars.JeepCar;
import com.company.Enums.EngineVolumes;
import com.company.Enums.Models;
import com.company.Enums.WheelSize;

public class Main {

    public static void main(String[] args) {
        Car car = new JeepCar("White", Models.JEEP, 2021, EngineVolumes.XX5, WheelSize.X50 );
        car.changeColour("Black");
        car.changeWheelSize(WheelSize.X70);
        Service service = new Service();
        service.newColour(car,"Orange");
        car.getCar();

        car.addOption("Change the wheels");
        car.addOption("Move") ;
        car.addOption("Bip-Bip");
        car.addOption("Buy");
        car.deleteOption("Move");
        car.options();


    }
}
