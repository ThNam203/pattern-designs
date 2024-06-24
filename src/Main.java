import AbstractFactory.*;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        CarFactory normalCarFactory = FactoryMaker.getFactory(CarTypes.NormalCar);
        Car normalCar = normalCarFactory.createCar();
        normalCar.honk();
        normalCar.getName();

        CarFactory luxuryCarFactory = FactoryMaker.getFactory(CarTypes.LuxuryCar);
        Car luxuryCar = luxuryCarFactory.createCar();
        luxuryCar.honk();
        luxuryCar.getName();
    }
}