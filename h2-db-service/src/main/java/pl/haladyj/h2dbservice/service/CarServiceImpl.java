package pl.haladyj.h2dbservice.service;

import org.springframework.stereotype.Service;
import pl.haladyj.h2dbservice.model.Car;
import pl.haladyj.h2dbservice.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car getCarById(Long id) {
        Car car = new Car();
        car = carRepository.findById(id).get();
        return car;
    }

    @Override
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        carRepository.findAll().forEach(result -> cars.add(result));
        return cars;
    }

}
