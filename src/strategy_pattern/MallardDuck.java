package strategy_pattern;


import strategy_pattern.fly.FlyWithWings;
import strategy_pattern.quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck () {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
