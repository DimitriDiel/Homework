package lesson28.carShowroom;

import lesson28.carShowroom.repository.CarDealer;
import lesson28.carShowroom.service.CarServices;
import lesson28.carShowroom.ui.*;

import java.util.ArrayList;
import java.util.List;

public class CarShowroomApp {
    public static void main(String[] args) {
        CarDealer database = new CarDealer();
        CarServices service = new CarServices(database);

        AddCarMenu addClientMenu = new AddCarMenu(service);
        FindAllCarMenu findAllClientMenu = new FindAllCarMenu(service);
        FindCarByVinMenu findByIdClientMenu = new FindCarByVinMenu(service);
        FindCarByBrandMenu findClientByNameMenu = new FindCarByBrandMenu(service);
        DeleteCarMenu deleteClientMenu = new DeleteCarMenu(service);
        ExitMenu exitMenu = new ExitMenu();

        List<MenuCommand> menuCommands = new ArrayList<>();
        menuCommands.add(addClientMenu);
        menuCommands.add(findAllClientMenu);
        menuCommands.add(findByIdClientMenu);
        menuCommands.add(findClientByNameMenu);
        menuCommands.add(deleteClientMenu);
        menuCommands.add(exitMenu);

        UserMenu userMenu = new UserMenu(menuCommands);
        userMenu.startUserMenu();


    }
}
