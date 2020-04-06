package pl.haladyj.h2dbservice.service;

import pl.haladyj.h2dbservice.model.Car;

import java.util.List;

public interface CarService {

    public Car getCarById(Long id);
    public List<Car> getAllCars();
}