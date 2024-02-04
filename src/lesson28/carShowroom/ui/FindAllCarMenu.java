package lesson28.carShowroom.ui;


import lesson28.carShowroom.dto.Response;
import lesson28.carShowroom.entity.Car;
import lesson28.carShowroom.service.CarServices;

import java.util.Map;

public class FindAllCarMenu implements MenuCommand {

    private final CarServices service;

    public FindAllCarMenu(CarServices service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        Response<Map<String,Car>> response = service.findAll();
        if (response.getMessage().equals("Ok")) {
            System.out.println(response.getData());
        } else {
            System.out.println(response.getMessage());
        }

    }

    @Override
    public String getMenuName() {
        return "Find all cars";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
