package StrategyPattern;

import StrategyPattern.FlyAlgorithm.Fly;
import StrategyPattern.FlyAlgorithm.FlyNoWay;
import StrategyPattern.QuackAlgorithm.Quack;
import StrategyPattern.QuackAlgorithm.QuackLoud;

public class GrassDuck extends Duck {
    public GrassDuck() {
        this.quack = new QuackLoud();
        this.fly = new FlyNoWay();
    }
}
