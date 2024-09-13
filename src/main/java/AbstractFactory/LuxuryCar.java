package AbstractFactory;

public class LuxuryCar extends Car {
    public LuxuryCar() {
        this.setTires(8);
        this.setSeats(8);
    }

    @Override
    public String getName() {
        return CarNames.LUXURY_CAR;
    }
}