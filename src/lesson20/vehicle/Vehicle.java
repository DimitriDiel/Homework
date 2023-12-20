package lesson20.vehicle;

abstract class Vehicle {

    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    abstract void speedUp();


    abstract void speedDown();




}
