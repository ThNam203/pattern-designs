package AbstractFactory;

public class NormalCarFactory implements CarFactory {
    public NormalCar createCar() {
        return new NormalCar();
    }
}



