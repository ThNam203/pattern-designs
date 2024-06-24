package AbstractFactory;

public abstract class Car {
    private int tires;
    private int seats;

    public abstract void honk();
    public abstract void getName();

    public void setTires(int tires) {
        this.tires = tires;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getTires() {
        return this.tires;
    }

    public int getSeats() {
        return this.seats;
    }
}