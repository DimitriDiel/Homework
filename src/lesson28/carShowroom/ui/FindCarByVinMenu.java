package lesson28.carShowroom.ui;


import lesson28.carShowroom.dto.Response;
import lesson28.carShowroom.entity.Car;
import lesson28.carShowroom.service.CarServices;
import lesson28.carShowroom.service.util.UserInput;


public class FindCarByVinMenu implements MenuCommand {

    private final CarServices service;

    public FindCarByVinMenu(CarServices service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {


        String vinSearch = UserInput.getText("Please enter car VIN: ");

       Response<Car> response = service.findByVin(vinSearch);
        if (response.getMessage().equals("Ok")) {
            System.out.println(response.getData());
        } else {
            System.out.println(response.getMessage());
        }
    }

    @Override
    public String getMenuName() {
        return "Find car by VIN";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
