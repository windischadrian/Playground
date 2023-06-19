import ObjectCreation.BaseCar;
import ObjectCreation.Builder.Car;

public class Playground {
    public static void main(String[] args) {
        System.out.println("Started");

        designPatterns();
    }

    private static void designPatterns() {
        //Builder
        ObjectCreation.Builder.Car.Builder reusableBuilder = new ObjectCreation.Builder.Car.Builder("Dacia", "Logan"); //Builders are reusable

        ObjectCreation.Builder.Car carBuilder = new ObjectCreation.Builder.Car.Builder("Volkswagen", "Golf GTI")
                .litreage(2.0f)
                .doorsNr(5)
                .fuel(BaseCar.FuelType.PETROL)
                .power(245)
                .build();

        System.out.println(carBuilder);

        //Java Beans
        ObjectCreation.Javabeans.Car carJavabeans = new ObjectCreation.Javabeans.Car("Audi", "S5");
        carJavabeans.setDoorsNr(3);
        carJavabeans.setPower(280);

        //Telescopic Constructor
        ObjectCreation.TelescopicConstructor.Car  carTelescopic = new ObjectCreation.TelescopicConstructor.Car("Porsche", "911");
        ObjectCreation.TelescopicConstructor.Car  carTelescopic2 = new ObjectCreation.TelescopicConstructor.Car("Porsche", "911", BaseCar.FuelType.HYBRID, 5);
        System.out.println(carTelescopic2);

        //Static Factory
        ObjectCreation.StaticFactory.Car carFactory = ObjectCreation.StaticFactory.Car.from(carTelescopic);
        System.out.println(carFactory);
    }
}
