package AbstractFactory;

public class LuxuryCarFactory implements CarFactory {
    @Override
    public LuxuryCar createCar() {
        return new LuxuryCar();
    }
}
