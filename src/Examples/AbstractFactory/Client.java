package Examples.AbstractFactory;

public class Client {
    Car electricCar, suvCar, sedanCar;

    Client(CarFactory factory) {
        electricCar = factory.createElectricCar();
        suvCar = factory.createSUVCar();
        sedanCar = factory.createSedanCar();
    }

    public String getElectricCarDetail() {
        return electricCar.getDetail();
    }

    public String getSuvCarDetail() {
        return suvCar.getDetail();
    }

    public String getSedanCarDetail() {
        return sedanCar.getDetail();
    }
}
