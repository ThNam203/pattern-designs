package Examples.AbstractFactory;

public class EuropeCarFactory implements CarFactory {
    @Override
    public Car createSedanCar() {
        return new EuropeSedanCar("Europe Sedan engine", 4, "300cm3");
    }

    @Override
    public Car createSUVCar() {
        return new EuropeSUVCar("Europe SUV 1000 hour-power engine", 7, "500cm3");
    }

    @Override
    public Car createElectricCar() {
        return new EuropeElectricCar("Europe 150KW electric engine", 2, "200cm3");
    }
}
