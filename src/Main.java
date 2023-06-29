import polymorphism.Bike;
import polymorphism.Spender;
import strategy_pattern.MallardDuck;
import strategy_pattern.fly.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // POLYMORPHISM
        Bike bike = new Bike();
        bike.run();

        Bike bike2 = new Spender();
        bike2.run();

        Spender bike3 = new Spender();
        bike3.run();

        System.out.println("====================");
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println("======");
        mallardDuck.setFlyBehavior(new FlyRocketPowered());
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}