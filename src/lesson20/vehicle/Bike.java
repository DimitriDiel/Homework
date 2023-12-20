package lesson20.vehicle;

public class Bike extends Vehicle implements SpeedSwitching{
    public Bike(String type) {
        super(type);
    }

    @Override
    void speedUp() {
        System.out.println("Bike speedUp");


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
