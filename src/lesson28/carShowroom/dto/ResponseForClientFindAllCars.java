package lesson28.carShowroom.dto;

import lesson28.carShowroom.dto.error.ErrorDto;
import lesson28.carShowroom.entity.Car;

import java.util.List;
import java.util.Map;

public class ResponseForClientFindAllCars {

    private Map<String, Car> allCars;

    private List<ErrorDto> errorsDtoList;

    public ResponseForClientFindAllCars(Map<String, Car> allCars, List<ErrorDto> errorsDtoList) {
        this.allCars = allCars;
        this.errorsDtoList = errorsDtoList;
    }

    public Map<String, Car> getAllCars() {
        return allCars;
    }

    public List<ErrorDto> getErrorsDtoList() {
        return errorsDtoList;
    }

    @Override
    public String toString() {
        return "ResponseForClientFindAllCars{" +
                "allCars=" + allCars +
                ", errorsDtoList=" + errorsDtoList +
                '}';
    }
}
