package lesson26.order;

import java.util.Objects;

public class Order {

    private int id;
    private String dishName;
    private int numberOfDish;
    private double costOfDish;

    public Order(int id, String dishName, int numberOfDish, double costOfDish) {
        this.id = id;
        this.dishName = dishName;
        this.numberOfDish = numberOfDish;
        this.costOfDish = costOfDish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getNumberOfDish() {
        return numberOfDish;
    }

    public void setNumberOfDish(int numberOfDish) {
        this.numberOfDish = numberOfDish;
    }

    public double getCostOfDish() {
        return costOfDish;
    }

    public void setCostOfDish(double costOfDish) {
        this.costOfDish = costOfDish;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dishName='" + dishName + '\'' +
                ", numberOfDish=" + numberOfDish +
                ", costOfDish=" + costOfDish +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && numberOfDish == order.numberOfDish && Double.compare(costOfDish, order.costOfDish) == 0 && Objects.equals(dishName, order.dishName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dishName, numberOfDish, costOfDish);
    }
}
