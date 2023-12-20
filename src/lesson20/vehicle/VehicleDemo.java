package lesson20.vehicle;

public class VehicleDemo {
    public static void main(String[] args) {


        Auto auto = new Auto("Bmw");
        Bike bike = new Bike("Stark");
        Motorcycle motorcycle = new Motorcycle("Yamaha");
        Truck truck = new Truck("MAN");
        Scooter scooter = new Scooter("Scooter1");


        Vehicle[] vehicles = {auto, bike, motorcycle, truck, scooter};

        Motor[] motors = {auto,motorcycle,truck};

        SpeedSwitching[] speedSwitchings = {auto,bike,motorcycle,truck};


        for (int i = 0; i < vehicles.length; i++) {

            vehicles[i].speedUp();
            vehicles[i].speedDown();
        }

        System.out.println("=========================");

        for (int i = 0; i < motors.length; i++) {
            motors[i].motorStart();
            motors[i].motorStop();

        }

        System.out.println("=========================");

        for (int i = 0; i < speedSwitchings.length; i++) {
            speedSwitchings[i].speedSwitchingUp();
            speedSwitchings[i].speedSwitchingDown();
        }

    }

}
