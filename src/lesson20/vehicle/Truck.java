package lesson20.vehicle;

public class Truck extends Vehicle implements Motor , SpeedSwitching{
    public Truck(String type) {
        super(type);
    }

    @Override
    public void motorStart() {
        System.out.println("Motor Truck started");

    }

    @Override
    public void motorStop() {
        System.out.println("Motor Truck stopped");

    }

    @Override
    void speedUp() {
        System.out.println("Truck speedUp");

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
