package Examples.AbstractFactory;

public interface CarFactory {
    Car createSedanCar();
    Car createSUVCar();
    Car createElectricCar();
}

