package lesson28.carShowroom.ui;


import lesson28.carShowroom.dto.Response;
import lesson28.carShowroom.service.CarServices;
import lesson28.carShowroom.service.util.UserInput;


public class EditPriceMenu implements MenuCommand {

    private final CarServices service;

    public EditPriceMenu(CarServices service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {


        String vinSearch = UserInput.getText("Please enter car VIN: ");
        Double newPrice = UserInput.getDouble("Please enter new price: ");

       Response<Boolean> response = service.editePrice(vinSearch,newPrice);
        if (response.getMessage().equals("Ok")) {
            System.out.println(response.getData());
        } else {
            System.out.println(response.getMessage());
        }
    }

    @Override
    public String getMenuName() {
        return "Edit price";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
