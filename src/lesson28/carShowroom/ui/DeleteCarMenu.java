package lesson28.carShowroom.ui;

import lesson28.carShowroom.dto.Response;
import lesson28.carShowroom.service.CarServices;
import lesson28.carShowroom.service.util.UserInput;

public class DeleteCarMenu implements MenuCommand {

    private final CarServices service;

    public DeleteCarMenu(CarServices service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        UserInput userInput = new UserInput();
        String vinSearch = UserInput.getText("Please enter car VIN: ");


        Response< Boolean> response = service.delete(vinSearch);
        if (response.getMessage().equals("Ok")) {
            System.out.println(response.getData());
        } else {
            System.out.println(response.getMessage());
        }
    }

    @Override
    public String getMenuName() {
        return "Delete car";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
