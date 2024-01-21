package lesson26.order;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class OrdersManager {

public List<Order> orders = new ArrayList<>();


    public void addOrder(Order order){
        orders.add(order);
        System.out.println("Заказ добавлен: ");
        System.out.println(orders);
    }

    public List<Order> searchOrder(Order order){
        List<Order> result = new ArrayList<>();

        ListIterator<Order> orderListIterator = orders.listIterator();
        while (orderListIterator.hasNext()){
            Order tempOrder = orderListIterator.next();
            if (tempOrder.equals(order)){
                result.add(tempOrder);
                return result;
            }
        }
        return result;
    }

    public void removeOrder(Order order){

        ListIterator<Order> orderListIterator = orders.listIterator();
        while (orderListIterator.hasNext()){
            Order tempOrder = orderListIterator.next();
            if (tempOrder.equals(order)){
                orders.remove(order);
            }
        }
    }

    public double calculateOrder(Order order){
        return order.getCostOfDish() * order.getNumberOfDish();
    }
    public double calculateAllOrders(List<Order> orders){
        double sumOfOrder = 0;
        ListIterator<Order> orderListIterator = orders.listIterator();
        while (orderListIterator.hasNext()){
            Order tempOrder = orderListIterator.next();
            sumOfOrder = sumOfOrder + calculateOrder(tempOrder);
        }
        return  sumOfOrder;

    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "OrdersManager{" +
                "orders=" + orders +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersManager that = (OrdersManager) o;
        return Objects.equals(orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }
}
