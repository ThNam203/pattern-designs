package StrategyPattern.QuackAlgorithm;

public class QuackNoWay implements Quack {
    @Override
    public String perform() {
        return "I can't quack, please help";
    }
}
