package Strategy;

import Strategy.FlyAlgorithm.FlyNoWay;
import Strategy.QuackAlgorithm.QuackNoWay;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        this.quack = new QuackNoWay();
        this.fly = new FlyNoWay();
    }
}
