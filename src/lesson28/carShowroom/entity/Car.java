package lesson28.carShowroom.entity;

import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private int yearOfIssue;
    private double price;
    private int rating;

    public Car(String brand, String model, int yearOfIssue, double price, int rating) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.price = price;
        this.rating = rating;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfIssue == car.yearOfIssue && Double.compare(price, car.price) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && rating == car.rating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfIssue, price, rating);
    }

}
