package lesson18.cars;

public class Truck extends Car{


    public Truck(String model) {
        super(model);
    }

    @Override
    public void speedUp(){
        System.out.println("Скорость Truck увеличена");

    }
}
