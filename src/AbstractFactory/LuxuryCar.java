package AbstractFactory;

public class LuxuryCar extends Car {
    public LuxuryCar() {
        this.setTires(8);
        this.setSeats(8);
    }
    @Override
    public void honk() {
        System.out.println("I'm honking as a luxury car");
    }

    @Override
    public void getName() {
        System.out.println("I'm a luxury car");
    }

    public static LuxuryCar getCar() {
        return new LuxuryCar();
    }
}