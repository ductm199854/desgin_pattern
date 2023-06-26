import polymorphism.Bike;
import polymorphism.Spender;

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
    }
}