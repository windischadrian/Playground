package DesignPatterns.TelescopicConstructor;

import DesignPatterns.BaseCar;

public class Car extends BaseCar {

    //Public constructor with all fields
    public Car(String brand, String model, FuelType fuel, int doorsNr, int power, float litreage) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.doorsNr = doorsNr;
        this.power = power;
        this.litreage = litreage;
    }

    //Public constructors with the first fields, each calling the 'upper level' constructor
    public Car(String brand, String model, FuelType fuel, int doorsNr, int power) {
        this(brand, model, fuel, doorsNr, power, 0);
    }
    public Car(String brand, String model, FuelType fuel, int doorsNr) {
        this(brand, model, fuel, doorsNr, 0);
    }
    public Car(String brand, String model, FuelType fuel) {
        this(brand, model, fuel, 0);
    }
    public Car(String brand, String model) {
        this(brand, model, FuelType.UNSPECIFIED);
    }
}
