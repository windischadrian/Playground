package ObjectCreation.StaticFactory;

import ObjectCreation.BaseCar;

public class Car extends BaseCar {
    private Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public static  Car from(BaseCar baseCar){
        return new Car(baseCar.getBrand(), baseCar.getModel());
    }
}
