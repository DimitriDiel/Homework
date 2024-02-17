package lesson28.carShowroom.ui;

import lesson28.carShowroom.dto.Response;
import lesson28.carShowroom.entity.Car;
import lesson28.carShowroom.service.CarServices;
import lesson28.carShowroom.service.util.UserInput;

import java.util.LinkedHashMap;
import java.util.Map;


public class SortingByRatingMenu implements MenuCommand {

    private final CarServices service;

    public SortingByRatingMenu(CarServices service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {


        System.out.println(service.sortingByRating());

    }

    @Override
    public String getMenuName() {
        return "Sorting car by rating";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
