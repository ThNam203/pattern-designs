package Strategy;

import Strategy.FlyAlgorithm.FlyNoWay;
import Strategy.QuackAlgorithm.QuackLoud;

public class GrassDuck extends Duck {
    public GrassDuck() {
        this.quack = new QuackLoud();
        this.fly = new FlyNoWay();
    }
}
