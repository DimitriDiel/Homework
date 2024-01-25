package lesson28.carShowroom.dto;

public class CarDto {

    private String brand;
    private String model;
    private int yearOfIssue;
    private double price;
    private Rating rating;

    public CarDto(String brand, String model, int yearOfIssue, double price, Rating rating) {
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
}
