package Examples.AbstractFactory;

public abstract class Car {
    private String engine;
    private Integer seats;
    private String size;

    public Car(String engine, Integer seats, String size) {
        this.engine = engine;
        this.seats = seats;
        this.size = size;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDetail() {
        return "Car's engine is " + this.engine + ", while the seats is " + this.seats + " with overall size is " + this.size;
    }
}
