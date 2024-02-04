package lesson28.carShowroom.ui;


import lesson28.carShowroom.dto.Response;
import lesson28.carShowroom.entity.Car;
import lesson28.carShowroom.service.CarServices;


public class AddCarMenu implements MenuCommand {

    private final CarServices service;

    public AddCarMenu(CarServices service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        Car newCar = service.createCar();

        Response<Car> response = service.add(newCar);
        if (response.getMessage().equals("Ok")) {
            System.out.println(response.getData());
        } else {
            System.out.println(response.getMessage());
        }
    }

    @Override
    public String getMenuName() {
        return "Add new car";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
