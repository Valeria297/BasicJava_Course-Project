package com.company;

import com.company.Cars.Car;
import com.company.Cars.CarBMW;
import com.company.Cars.JaguarCar;
import com.company.Cars.JeepCar;
import com.company.Enums.Colours;
import com.company.Enums.EngineVolumes;
import com.company.Enums.Models;
import com.company.Enums.WheelSize;
import com.company.Factories.Factory;
import com.company.Factories.FactoryBMW;
import com.company.Factories.JaguarFactory;
import com.company.Factories.JeepFactory;
import com.company.Services.ChangeColourService;
import com.company.Services.ChangeEngineVolumeService;
import com.company.Services.ChangeWheelService;

public class CarStore {
    protected Colours colour;
    protected Models model;
    protected final int yearOfRelease = 2021;
    protected WheelSize wheelSize;
    protected EngineVolumes engineVolume;
    protected ChangeColourService changeColourService = new ChangeColourService();
    protected ChangeWheelService changeWheelService = new ChangeWheelService();
    protected ChangeEngineVolumeService chanEnVolS = new ChangeEngineVolumeService();
    protected FactoryBMW factoryBMW = new FactoryBMW();
    protected JaguarFactory factoryJaguar = new JaguarFactory();
    protected JeepFactory factoryJeep = new JeepFactory();

    public void makeOffer(Colours colour, Models model, int yearOfRelease, WheelSize whileSize,
                          EngineVolumes engineVolume) {

        if (this.model == Models.BMW) {
            CarBMW car = new CarBMW();
            if (!(factoryBMW.makeCarBMW(this.colour, this.model, this.yearOfRelease,
                    this.wheelSize, this.engineVolume).equals(false))) {
                car = (CarBMW) factoryBMW.makeCarBMW(this.colour, this.model, this.yearOfRelease,
                        this.wheelSize, this.engineVolume);
            } else {
                changeColourService.changeColour(car, this.colour);
                changeWheelService.changeTheWheel(car, this.wheelSize);
                chanEnVolS.changeEngineVolume(car, this.engineVolume);
            }
        }

        if (this.model == Models.JAGUAR) {
            JaguarCar car = new JaguarCar();
            if (!(factoryJaguar.makeCarJaguar(this.colour, this.model, this.yearOfRelease,
                    this.wheelSize, this.engineVolume).equals(false))) {
                car = (JaguarCar) factoryJaguar.makeCarJaguar(this.colour, this.model, this.yearOfRelease,
                        this.wheelSize, this.engineVolume);
            } else {
                changeColourService.changeColour(car, this.colour);
                changeWheelService.changeTheWheel(car, this.wheelSize);
                chanEnVolS.changeEngineVolume(car, this.engineVolume);
            }
        }

        if (this.model == Models.JEEP) {
            JeepCar car = new JeepCar();
            if (!(factoryJeep.makeCarJeep(this.colour, this.model, this.yearOfRelease,
                    this.wheelSize, this.engineVolume).equals(false))) {
                car = (JeepCar) factoryJeep.makeCarJeep(this.colour, this.model, this.yearOfRelease,
                        this.wheelSize, this.engineVolume);
            } else {
                changeColourService.changeColour(car, this.colour);
                changeWheelService.changeTheWheel(car, this.wheelSize);
                chanEnVolS.changeEngineVolume(car, this.engineVolume);
            }
        }

        System.out.println("Congratulate! You make offer on car: \r\n"
                + colour + " " + model + " " + yearOfRelease + " with wheel size " + wheelSize
                + " and engine volume " + engineVolume + " l.");
    }

}
