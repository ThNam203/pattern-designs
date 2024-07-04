package DecoratePattern;

public abstract class Drink {
    String name;

    public String getDescription() {
        return this.name;
    }

    public abstract double cost();
}
