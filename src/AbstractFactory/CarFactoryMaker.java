package AbstractFactory;

public class CarFactoryMaker {
    public static CarFactory getFactory(CarTypes types) {
        switch (types) {
            case NormalCar -> {
                return new NormalCarFactory();
            }
            case LuxuryCar -> {
                return new LuxuryCarFactory();
            }
            case null, default -> {
                throw new IllegalArgumentException();
            }
        }
    }
}
