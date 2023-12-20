package lesson20.vehicle;

public class Auto extends Vehicle implements Motor , SpeedSwitching{
    public Auto(String type) {
        super(type);
    }

    @Override
    public void motorStart() {

        System.out.println(getType() + " Motor started");

    }

    @Override
    public void motorStop() {
        System.out.println("Motor Auto stopped");

    }


    @Override
    void speedUp() {
        System.out.println("Motorcycle speedUp");

    }

    @Override
    void speedDown() {
        System.out.println("Motorcycle speedDown");

    }

    @Override
    public void speedSwitchingUp() {
        System.out.println("Motorcycle speedSwitchingUp");

    }

    @Override
    public void speedSwitchingDown() {
        System.out.println("Motorcycle speedSwitchingDown");

    }
}
