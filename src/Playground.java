import CommonMethods.CommonMethods;
import ObjectCreation.BaseCar;

import java.util.HashMap;

public class Playground {
    public static void main(String[] args) {
        System.out.println("Started");

        //designPatterns();
        commonMethods();
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

    private static void commonMethods() {
        CommonMethods cm = new CommonMethods(1, "The String");
        CommonMethods cm2 = new CommonMethods(1, "The String");
        System.out.println(cm.toString());
        System.out.println(cm.hashCode());
        System.out.println(cm2.hashCode());
        System.out.println(cm.equals(cm2));

        HashMap<CommonMethods, String> map = new HashMap<>();
        map.put(cm, "CommonMethods object");

        //Works because of the new hashCode
        System.out.println(map.get(new CommonMethods(1, "The String")));

        CommonMethods cm3 = cm.clone();
        System.out.println(cm3);

    }
}
