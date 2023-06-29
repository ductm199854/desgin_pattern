package strategy_pattern;

import strategy_pattern.fly.FlyBehavior;
import strategy_pattern.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();
    public void performQuack() {
        quackBehavior.quack();;
    }
    public void performFly() {
        flyBehavior.fly();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys");
    }
}
