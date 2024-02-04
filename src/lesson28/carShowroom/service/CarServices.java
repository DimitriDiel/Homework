package lesson28.carShowroom.service;

import lesson28.carShowroom.dto.Response;
import lesson28.carShowroom.entity.Car;
import lesson28.carShowroom.repository.CarDealer;
import lesson28.carShowroom.service.util.UserInput;

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class CarServices {

    private final CarDealer database;

    public CarServices(CarDealer database) {
        this.database = database;
    }

    public Supplier<Car> createCarSupplier() {
        return () -> {
            String clientName = UserInput.getText("Введите имя клиента");
            String descriptionName = UserInput.getText("Введите описание клиента");
            return new Car(clientName,descriptionName);
        };
    }

    public Car createClient(){
        Supplier<Car> carSupplier = createCarSupplier();
        return carSupplier.get();
    };

    public Response<Car> add(Car car){
        Car newClient = database.add(car);
        return new Response<>(newClient, "Ok");
    };

    public Response<Car> findById(int id){
        Optional<Car> clientOptional = database.findById(id);
        if (clientOptional.isPresent()) {
            return new Response<>(clientOptional.get(),"Ok");
        } else {
            return new Response<>(null, "Car not found");
        }
    };

    public Response<Car> findByName(String name){
        Optional<Car> clientOptional = database.findByName(name);
        return clientOptional.map(client -> new Response<>(client, "Ok")).orElseGet(() -> new Response<>(null, "Car not found"));
    };

    public Response<Boolean> update(Car car){
        boolean updateResult = database.update(client);
        if (updateResult) {
            return new Response<>(true, "Ok");
        } else {
            return new Response<>(false, "Update fail");
        }
    };

    public Response<Boolean> delete(int idForDelete){
        Optional<Car> clientOptional = database.findById(idForDelete);
        Car clientForDelete = clientOptional.get();
        boolean deleteResult = database.delete(clientForDelete);

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

}
