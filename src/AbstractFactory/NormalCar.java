package AbstractFactory;

public class NormalCar extends Car {
    public NormalCar() {
        this.setTires(4);
        this.setSeats(4);
    }

    @Override
    public void honk() {
        System.out.println("I'm honking as a normal car");
    }

    @Override
    public void getName() {
        System.out.println("I'm a normal car");
    }

    public static NormalCar getCar() {
        return new NormalCar();
    }
}
