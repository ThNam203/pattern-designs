package Strategy.HeadFirst;

import Strategy.HeadFirst.FlyAlgorithm.FlyNoWay;
import Strategy.HeadFirst.QuackAlgorithm.QuackNoWay;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        this.quack = new QuackNoWay();
        this.fly = new FlyNoWay();
    }
}
