package lesson29.shoppinglist.repository;

import lesson29.shoppinglist.dto.ProductDto;
import lesson29.shoppinglist.entity.Product;

import java.util.List;

public interface ProductRepository {

    Integer addProduct(ProductDto productDto);
    List<Product> findAll();
    Product findById(Integer id);
    Product removeById(Integer id);
}
