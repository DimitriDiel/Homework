package lesson20.vehicle;

public class Motorcycle extends Vehicle implements Motor , SpeedSwitching{
    public Motorcycle(String type) {
        super(type);
    }

    @Override
    public void motorStart() {

        System.out.println("Motor Motorcycle started");

    }

    @Override
    public void motorStop() {
        System.out.println("Motor Motorcycle stopped");

    }

    @Override
    void speedUp() {
        System.out.println("Motorcycle speedUp");

    }

    @Override
    void speedDown() {

    }

    @Override
    public void speedSwitchingUp() {

    }

    @Override
    public void speedSwitchingDown() {

    }
}
