package strategy_pattern;

import strategy_pattern.fly.FlyNoWay;
import strategy_pattern.quack.Squeak;

public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I'm a Model Duck");
    }

    public ModelDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
}
