package ObjectCreation.Builder;

import ObjectCreation.BaseCar;

public class Car extends BaseCar {

    //Private constructor used by the build method
    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.fuel = builder.fuel;
        this.doorsNr = builder.doorsNr;
        this.power = builder.power;
        this.litreage = builder.litreage;
    }

    public static class Builder {
        private String brand;
        private String model;
        private FuelType fuel;
        private int doorsNr;
        private int power;
        private float litreage;

        //Base constructor
        public Builder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        //Build method to return final created object
        public Car build() {
            return new Car(this);
        }

        //Methods to add each parameter individually
        public Builder fuel(FuelType fuel) {
            this.fuel = fuel;
            return this;
        }

        public Builder doorsNr(int doorsNr) {
            this.doorsNr = doorsNr;
            return this;
        }

        public Builder power(int power) {
            this.power = power;
            return this;
        }

        public Builder litreage(float litreage) {
            this.litreage = litreage;
            return this;
        }
    }
}
