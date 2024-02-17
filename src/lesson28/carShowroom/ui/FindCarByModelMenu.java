package lesson28.carShowroom.ui;

import lesson28.carShowroom.dto.Response;
import lesson28.carShowroom.entity.Car;
import lesson28.carShowroom.service.CarServices;
import lesson28.carShowroom.service.util.UserInput;

import java.util.Map;


public class FindCarByModelMenu implements MenuCommand {

    private final CarServices service;

    public FindCarByModelMenu(CarServices service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        String modelSearch = UserInput.getText("Please enter car model: ");

        Response<Map<String, Car>> response = service.findByBrand(modelSearch);
        if (response.getMessage().equals("Ok")) {
            System.out.println(response.getData());
        } else {
            System.out.println(response.getMessage());
        }
    }

    @Override
    public String getMenuName() {
        return "Find car by model";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
