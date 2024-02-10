package lesson33.task7;

import java.util.*;
import java.util.stream.Collectors;

public class Task7Variant2 {
    /*
    Дана коллекция Product - название, категория, цена, количество на складе.
   Найти среднюю цену продуктов каждой категории, у которых количество превышает заданное значение
   и отсортировать по убыванию цены
     */
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
        new Product("Product 1", "Catagory 1", 100, 50),
        new Product("Product 2", "Catagory 1", 500, 100),
        new Product("Product 3", "Catagory 2", 150, 15),
        new Product("Product 4", "Catagory 2", 250, 150),
        new Product("Product 5", "Catagory 3", 300, 200),
        new Product("Product 6", "Catagory 2", 50, 150),
        new Product("Product 7", "Catagory 3", 550, 170)
        );

        // зададим критерий для фильтрации по количеству
        int quantityCriteria = 70;

        /*
        Map<K, List<T>> collect = stream.collect(Collectors.groupingBy(classifier));

         */

        Map<String,Double> averagePriceByCategory = products.stream()
                // фильтрация продуктов, где количество на складе больше чем наш критерий
                .filter(p -> p.getQuantity() > quantityCriteria)
                // группировка по категории с одновременным расчетом средней цены
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)
                ));

        averagePriceByCategory.forEach((category, avgPrice) -> System.out.println("Category: " + category + ", Average price: " + avgPrice ));


        // сортировка

        List<Map.Entry<String, Double>> sortedEntries = new ArrayList<>(averagePriceByCategory.entrySet());
        sortedEntries.sort(Map.Entry.<String, Double>comparingByValue().reversed());

        System.out.println(sortedEntries);

        LinkedHashMap<String, Double> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String,Double> entry : sortedEntries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        sortedMap.forEach((category, avgPrice) -> System.out.println("Category: " + category + ", Average price: " + avgPrice ));


    }
}
