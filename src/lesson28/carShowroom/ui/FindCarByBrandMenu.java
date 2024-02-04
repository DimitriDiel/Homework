package lesson28.carShowroom.ui;

import lesson28.carShowroom.dto.Response;
import lesson28.carShowroom.entity.Car;
import lesson28.carShowroom.service.CarServices;
import lesson28.carShowroom.service.util.UserInput;


public class FindCarByBrandMenu implements MenuCommand {

    private final CarServices service;

    public FindCarByBrandMenu(CarServices service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        UserInput userInput = new UserInput();
        String nameSearch = userInput.uiText("Please enter car brand: ");

        Response<Car> response = service.findByName(nameSearch);
        if (response.getMessage().equals("Ok")) {
            System.out.println(response.getData());
        } else {
            System.out.println(response.getMessage());
        }
    }

    @Override
    public String getMenuName() {
        return "Find car by brand";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
