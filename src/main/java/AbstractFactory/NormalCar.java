package AbstractFactory;

public class NormalCar extends Car {
    public NormalCar() {
        this.setTires(4);
        this.setSeats(4);
    }

    @Override
    public String getName() {
        return CarNames.NORMAL_CAR;
    }
}
