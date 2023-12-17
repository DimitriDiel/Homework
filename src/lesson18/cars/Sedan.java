package lesson18.cars;

public class Sedan extends Car{


    public Sedan(String model) {
        super(model);
    }

    @Override
    public void speedUp(){
        System.out.println("Скорость Sedan увеличена");

    }
}
