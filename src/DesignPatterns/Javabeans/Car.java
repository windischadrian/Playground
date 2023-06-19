package DesignPatterns.Javabeans;

import DesignPatterns.BaseCar;

public class Car extends BaseCar {

    //Base constructor with mandatory fields
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    //Can add other fields using Java setters
    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }

    public void setDoorsNr(int doorsNr) {
        this.doorsNr = doorsNr;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setLitreage(float litreage) {
        this.litreage = litreage;
    }
}
