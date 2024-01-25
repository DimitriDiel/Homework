package lesson28.carShowroom.entity;

import lesson28.carShowroom.dto.Rating;

import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private int yearOfIssue;
    private double price;
    private Rating rating;

    public Car(String brand, String model, int yearOfIssue, double price, Rating rating) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.price = price;
        this.rating = rating;
    }

    public String getBrand() {
        return brand;
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

    public Rating getRating() {
        return rating;
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
