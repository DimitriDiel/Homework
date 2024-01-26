package lesson28.carShowroom.repository;
import lesson28.carShowroom.entity.Car;
import java.util.HashMap;
import java.util.Map;

public class CarDealer {

    private Map<String, Car> cars;

    public CarDealer(Map<String, Car> cars) {
        this.cars = new HashMap<>();
    }
    public Map<String, Car> getCars() {
        return cars;
    }
    public void addCar(String vinNumber, Car newCar) {
        cars.put(vinNumber, new Car(newCar.getBrand(), newCar.getModel(), newCar.getYearOfIssue(), newCar.getPrice(), newCar.getRating()));
    }
    public Map<String, Car> findAll() {
        return cars;
    }
    public Car findCarByVinNumber(String vinNumber) {
        if (cars.containsKey(vinNumber)) {
            return cars.get(vinNumber);
        }
        return null;
    }
    public boolean deleteByVinNumber(String vinNumber) {
        if(findCarByVinNumber(vinNumber) != null){
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

}