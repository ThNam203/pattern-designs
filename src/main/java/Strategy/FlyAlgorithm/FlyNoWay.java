package Strategy.FlyAlgorithm;

public class FlyNoWay implements Fly {
    @Override
    public String perform() {
        return "I'm a useless duck that I can't fly";
    }
}
