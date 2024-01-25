package lesson29.shoppinglist.ui;

import lesson29.shoppinglist.dto.ProductDto;
import lesson29.shoppinglist.dto.ResponseForClientAddProduct;
import lesson29.shoppinglist.dto.ResponseForClientFindAllProducts;
import lesson29.shoppinglist.service.ProductService;

import java.util.Scanner;

public class FindAllProductMenu implements MenuCommand{

    private final ProductService service;

    public FindAllProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        ResponseForClientFindAllProducts findAllResult = service.findAll();
        System.out.println(findAllResult);

    }

    @Override
    public String getMenuName() {
        return "Find all products";
    }
}
