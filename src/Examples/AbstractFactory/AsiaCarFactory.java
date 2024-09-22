package Examples.AbstractFactory;

public class AsiaCarFactory implements CarFactory {
    @Override
    public Car createSedanCar() {
        return new AsiaSedanCar("Asia S-type Legendary Sedan engine", 4, "320cm3");
    }

    @Override
    public Car createSUVCar() {
        return new AsiaSUVCar("Asia SUV 777 man-power engine", 7, "450cm3");
    }

    @Override
    public Car createElectricCar() {
        return new AsiaElectricCar("Asia 200KW Vietnam designated electric engine", 3, "200cm3");
    }
}
