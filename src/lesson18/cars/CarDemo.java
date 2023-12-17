package lesson18.cars;

public class CarDemo {
    public static void main(String[] args) {

        Sedan sedan1 = new Sedan("Mersedes");
        Sedan sedan2 = new Sedan("BMW");
        Sedan sedan3 = new Sedan("Audi");

        SportCar sportCar1 = new SportCar("Ferrari");
        SportCar sportCar2 = new SportCar("Porshe");
        SportCar sportCar3 = new SportCar("Mazerrati");

        Truck truck1 = new Truck("Man");
        Truck truck2 = new Truck("Kamaz");
        Truck truck3 = new Truck("Belax");

        Car[] cars = {sedan1,sedan2,sedan3,sportCar1,sportCar2,sportCar3,truck1,truck2,truck3};

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getModel());
            cars[i].speedUp();
        }

    }
}
