package AbstractFactory;

public class FactoryMaker {
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
