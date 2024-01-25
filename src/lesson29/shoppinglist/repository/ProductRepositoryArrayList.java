package lesson29.shoppinglist.repository;

import lesson29.shoppinglist.dto.ProductDto;
import lesson29.shoppinglist.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ProductRepositoryArrayList implements ProductRepository{

    private List<Product> database;

    private Integer idCounter;

    public ProductRepositoryArrayList() {
        this.database = new ArrayList<>();
        this.idCounter = 0;
    }

    @Override
    public Integer addProduct(ProductDto productDto) {
        idCounter++;
        database.add(new Product(idCounter, productDto.getProductName(), productDto.getPrice(), productDto.getDescription()));
        return idCounter;
    }

    @Override
    public List<Product> findAll() {
        return database;
    }

    @Override
    public Product findById(Integer id) {

        for (Product currentProduct : database) {
            if (currentProduct.getId().equals(id)) {
                return currentProduct;
            }
        }

        return null;
    }

    @Override
    public Product removeById(Integer id) {
        ListIterator<Product> productListIterator = database.listIterator();
        while (productListIterator.hasNext()) {
            Product tempProduct = productListIterator.next();
            if (tempProduct.getId().equals(id)) {
                productListIterator.remove();
                return tempProduct;

            }

        }
        return null;

    }
}
