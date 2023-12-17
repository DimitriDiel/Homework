package lesson18.cars;

abstract class Car {

    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    abstract void speedUp();
}
