package lesson28.carShowroom.service;

import lesson28.carShowroom.dto.Response;
import lesson28.carShowroom.entity.Car;
import lesson28.carShowroom.repository.CarDealer;
import lesson28.carShowroom.service.util.UserInput;

import java.util.*;
import java.util.function.Supplier;

public class CarServices {

    private final CarDealer database;

    public CarServices(CarDealer database) {
        this.database = database;
    }

    public Supplier<Car> createCarSupplier() {
        return () -> {
            String carBrand = UserInput.getText("Введите марку авто");
            String carModel = UserInput.getText("Введите модель авто");
            int yearOfIssue = UserInput.getInt("Введите год авто");
            double price = UserInput.getDouble("Введите цену авто");
            int rating = UserInput.getInt("Введите рейтинг от 1 до 5");
            return new Car(carBrand,carModel,yearOfIssue,price,rating);
        };
    }

    public Car createCar(){
        Supplier<Car> carSupplier = createCarSupplier();
        return carSupplier.get();
    };

    public Response<Car> add(String vin, Car car){
        Car newCar = database.addCar(vin, car);
        return new Response<>(newCar, "Ok");
    };

    public Response<Car> findByVin(String vin){
        Optional<Car> carOptional = database.findCarByVinNumber(vin);
        if (carOptional.isPresent()) {
            return new Response<>(carOptional.get(),"Ok");
        } else {
            return new Response<>(null, "Car not found");
        }
    };

    public Response<Map<String,Car>> findByBrand(String brand){
        Map<String, Car> carByBrand = database.findCarByBrand(brand);
        if (!carByBrand.isEmpty()) {
            return new Response<>(carByBrand,"Ok");
        } else {
            return new Response<>(null, "Car not found");
        }};
    public Response<Map<String,Car>> findByModel(String model){
        Map<String, Car> carByModel = database.findCarByModel(model);
        if (!carByModel.isEmpty()) {
            return new Response<>(carByModel,"Ok");
        } else {
            return new Response<>(null, "Car not found");
        }};

    public Response<Boolean> editePrice(String vin, double price){
        boolean updateResult = database.editPrice(vin, price);
        if (updateResult) {
            return new Response<>(true, "Ok");
        } else {
            return new Response<>(false, "Update fail");
        }
    };

    public Response<Boolean> delete(String vin){

        boolean deleteResult = database.deleteByVinNumber(vin);

        if (deleteResult) {
            return new Response<>(true, "Ok");
        } else {
            return new Response<>(false, "Delete fail");
        }
    };


    public Response<Map<String,Car>> findAll(){

        Map<String,Car> findAllList = database.findAll();

        if (findAllList.isEmpty()) {
            return new Response<>(findAllList, "Database is empty");
        } else {
            return new Response<>(findAllList, "Ok");
        }
    }
    public Response<Boolean> editeRating(String vin, int rating){
        boolean updateResult = database.editRating(vin, rating);
        if (updateResult) {
            return new Response<>(true, "Ok");
        } else {
            return new Response<>(false, "Update fail");
        }
    };
    public Response<Map<String,Car>> findByYearOfIssue(int yearOfIssue){
        Map<String, Car> carByYearOfIssue = database.findCarByYearOfIssue(yearOfIssue);
        if (!carByYearOfIssue.isEmpty()) {
            return new Response<>(carByYearOfIssue,"Ok");
        } else {
            return new Response<>(null, "Car not found");
        }};
    public LinkedHashMap<String,Car> sortingByRating(){
        List<Map.Entry<String, Car>> sortedList = new ArrayList<>(database.getCars().entrySet());
        sortedList.sort(new Comparator<Map.Entry<String, Car>>() {
            @Override
            public int compare(Map.Entry<String, Car> o1, Map.Entry<String, Car> o2) {
                return o1.getValue().getRating() - o2.getValue().getRating();
            }
        });
        LinkedHashMap<String,Car> sortedCars = new LinkedHashMap<>();
        for (Map.Entry<String, Car> entry : sortedList) {
            sortedCars.put(entry.getKey(), entry.getValue());
        }
        return sortedCars;


    }

}
