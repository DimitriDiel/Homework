package lesson33.task9;

import java.util.*;
import java.util.stream.Collectors;

public class OrdersApp {

    public static void main(String[] args) {


        List<Order> orders = new ArrayList<>();

        orders.add(new Order(1,"январь",15.50,"Ok"));
        orders.add(new Order(2,"февраль",11.10,"Ok"));
        orders.add(new Order(2,"январь",20.60,"Ok"));
        orders.add(new Order(2,"февраль",26.40,"Ok"));


        Map<String, Double> groupedOrders = orders.stream()
                .collect(Collectors.groupingBy(Order::getDate, Collectors.summingDouble(Order::getSumOrder)));

        System.out.println(groupedOrders);


        }

}

