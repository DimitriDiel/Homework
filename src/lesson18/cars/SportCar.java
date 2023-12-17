package lesson18.cars;

public class SportCar extends Car{


    public SportCar(String model) {
        super(model);
    }

    @Override
    public void speedUp(){
        System.out.println("Скорость SportCar увеличена");

    }
}
