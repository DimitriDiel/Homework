package lesson26.product;

public class CatalogDemo {
    public static void main(String[] args) {

        Catalog catalog = new Catalog();

        Product product1 = new Product("Хлеб",5.5);
        Product product2 = new Product("Масло",9.2);
        Product product3 = new Product("Молоко",7.3);

        catalog.addProduct(product1);
        catalog.addProduct(product2);
        catalog.addProduct(product3);

        Product productForSearch = new Product("Масло",9.2);

        System.out.println(catalog.searchProduct(productForSearch));

        catalog.removeProduct(productForSearch);

        System.out.println(catalog);
    }
}
