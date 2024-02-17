package lesson33.task9;

import java.util.Calendar;
import java.util.Date;


public class Order {

    private  int id;
    private String date;
    private Double sumOrder;
    private String status;

    public Order(int id, String date, Double sumOrder, String status) {
        this.id = id;
        this.date = date;
        this.sumOrder = sumOrder;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public Double getSumOrder() {
        return sumOrder;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", sumOrder=" + sumOrder +
                ", status='" + status + '\'' +
                '}';
    }
}
