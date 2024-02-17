package lesson28.carShowroom.ui;


import lesson28.carShowroom.dto.Response;
import lesson28.carShowroom.service.CarServices;
import lesson28.carShowroom.service.util.UserInput;


public class EditRatingMenu implements MenuCommand {

    private final CarServices service;

    public EditRatingMenu(CarServices service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {


        String vinSearch = UserInput.getText("Please enter car VIN: ");
        int newRating = UserInput.getInt("Please enter new rating: ");

       Response<Boolean> response = service.editeRating(vinSearch,newRating);
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
