package lesson26.order;

public class Restaurant {

    public static void main(String[] args) {

        OrdersManager ordersManager = new OrdersManager();

        Order order1 = new Order(1,"Fish soup",1,6.5);
        Order order2 = new Order(2,"Greek salad",2,3.1);
        Order order3 = new Order(3,"Cheese sticks",3,2.4);
        Order order4 = new Order(4,"Schnitzel",2,9.5);


        ordersManager.addOrder(order1);
        ordersManager.addOrder(order2);
        ordersManager.addOrder(order3);
        ordersManager.addOrder(order4);

        System.out.println(ordersManager.orders);

        System.out.println(ordersManager.calculateOrder(order1));

        Order orderForSearch = new Order(3,"Cheese sticks",3,2.4);

        System.out.println(ordersManager.searchOrder(orderForSearch));

        ordersManager.removeOrder(orderForSearch);

        System.out.println(ordersManager.orders);


        System.out.println(ordersManager.calculateAllOrders(ordersManager.orders));


    }


}
