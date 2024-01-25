package lesson29.shoppinglist;

import lesson29.shoppinglist.repository.ProductRepository;
import lesson29.shoppinglist.repository.ProductRepositoryArrayList;
import lesson29.shoppinglist.service.ProductService;
import lesson29.shoppinglist.service.Validation;
import lesson29.shoppinglist.ui.*;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
    public static void main(String[] args) {
// создаем основные классы для работы сервиса

        ProductRepository repository = new ProductRepositoryArrayList();
        Validation validation = new Validation();
        ProductService service = new ProductService(repository, validation);


        // создаем классы для формирования пунктов меню

        AddProductMenu addProductMenu = new AddProductMenu(service);
        FindAllProductMenu findAllProductMenu = new FindAllProductMenu(service);
        ExitMenu exitMenu = new ExitMenu();

        List<MenuCommand> menuCommands = new ArrayList<>();
        menuCommands.add(addProductMenu);
        menuCommands.add(findAllProductMenu);
        menuCommands.add(exitMenu);

        UserMenu ui = new UserMenu(menuCommands);
        ui.startUserMenu();

    }
}
