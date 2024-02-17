package lesson28.carShowroom.ui;

import lesson28.carShowroom.dto.Response;
import lesson28.carShowroom.entity.Car;
import lesson28.carShowroom.service.CarServices;
import lesson28.carShowroom.service.util.UserInput;

import java.util.Map;


public class FindCarByYearMenu implements MenuCommand {

    private final CarServices service;

    public FindCarByYearMenu(CarServices service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        int yearOfIssue = UserInput.getInt("Please enter car yearOfIssue: ");

        Response<Map<String, Car>> response = service.findByYearOfIssue(yearOfIssue);
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
