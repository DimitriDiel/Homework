package lesson26.product;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Catalog {

    public List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
        System.out.println("Продукт добавлен в каталог: ");
        System.out.println(products);
    }

    public List<Product> searchProduct(Product product){
        List<Product> result = new ArrayList<>();

        ListIterator<Product> productListIterator = products.listIterator();
        while (productListIterator.hasNext()){
            Product tempProduct = productListIterator.next();
            if (tempProduct.equals(product)){
                result.add(tempProduct);
                return result;
            }
        }
        return result;
    }

    public void removeProduct(Product product){

        ListIterator<Product> productListIterator = products.listIterator();
        while (productListIterator.hasNext()){
            Product tempProduct = productListIterator.next();
            if (tempProduct.equals(product)){
                products.remove(product);
            }
        }
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "products=" + products +
                '}';
    }
}
