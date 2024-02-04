package lesson28.carShowroom.repository;
import lesson28.carShowroom.entity.Car;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CarDealer {

    private Map<String, Car> cars;

    public CarDealer(Map<String, Car> cars) {
        this.cars = new HashMap<>();
    }
    public Map<String, Car> getCars() {
        return cars;
    }
    public Car addCar(String vinNumber, Car newCar) {
        Car carForAdd = new Car(newCar.getBrand(), newCar.getModel(), newCar.getYearOfIssue(), newCar.getPrice(), newCar.getRating());
        cars.put(vinNumber, carForAdd);
        return carForAdd;
    }
    public Map<String, Car> findAll() {
        return cars;
    }
    public Optional<Car> findCarByVinNumber(String vinNumber) {
        if (cars.containsKey(vinNumber)) {
            return Optional.ofNullable(cars.get(vinNumber));
        }
        return Optional.empty();
    }
    public boolean deleteByVinNumber(String vinNumber) {
        if(findCarByVinNumber(vinNumber).isPresent()){
            cars.remove(vinNumber);
            return true;
        }
        return false;
    }
    public Map<String, Car> findCarByBrand(String brand){
        Map<String,Car> carsByBrand = new HashMap<>();
        for (Map.Entry<String,Car> entry : cars.entrySet()){
            if(entry.getValue().getBrand().equals(brand)){
                carsByBrand.put(entry.getKey(), entry.getValue());
            }
        }
        return carsByBrand;
    }
    public Map<String, Car> findCarByModel(String model){
        Map<String,Car> carsByModel = new HashMap<>();
        for (Map.Entry<String,Car> entry : cars.entrySet()){
            if(entry.getValue().getModel().equals(model)){
                carsByModel.put(entry.getKey(), entry.getValue());
            }
        }
        return carsByModel;
    }
    public Map<String, Car> findCarByYearOfIssue(int yearOfIssue){
        Map<String,Car> carsByYearOfIssue = new HashMap<>();
        for (Map.Entry<String,Car> entry : cars.entrySet()){
            if(entry.getValue().getYearOfIssue() == yearOfIssue){
                carsByYearOfIssue.put(entry.getKey(), entry.getValue());
            }
        }
        return carsByYearOfIssue;
    }
    public boolean editPrice(String vinNumber, Double newPrice){
        Optional<Car> carFromDatabaseOpt = findCarByVinNumber(vinNumber);
        if (carFromDatabaseOpt.isPresent()) {
            Car carUpdate  = carFromDatabaseOpt.get();
            carUpdate.setPrice(newPrice);
            return true;
        }
        return false;

    }
    public boolean editRating(String vinNumber, int newRating){
        Optional<Car> carFromDatabaseOpt = findCarByVinNumber(vinNumber);
        if (carFromDatabaseOpt.isPresent()) {
            Car carUpdate  = carFromDatabaseOpt.get();
            carUpdate.setRating(newRating);
            return true;
        }
        return false;

    }

}
