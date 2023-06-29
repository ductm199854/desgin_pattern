package strategy_pattern.fly;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with rocket");
    }
}
