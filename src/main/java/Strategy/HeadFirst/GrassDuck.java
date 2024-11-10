package Strategy.HeadFirst;

import Strategy.HeadFirst.FlyAlgorithm.FlyNoWay;
import Strategy.HeadFirst.QuackAlgorithm.QuackLoud;

public class GrassDuck extends Duck {
    public GrassDuck() {
        this.quack = new QuackLoud();
        this.fly = new FlyNoWay();
    }
}
