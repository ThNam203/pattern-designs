package StrategyPattern;

import StrategyPattern.FlyAlgorithm.FlyHigh;
import StrategyPattern.FlyAlgorithm.FlyNoWay;
import StrategyPattern.QuackAlgorithm.QuackNoWay;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        this.quack = new QuackNoWay();
        this.fly = new FlyNoWay();
    }
}
