package pl.haladyj.h2dbservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.haladyj.h2dbservice.model.Car;
import pl.haladyj.h2dbservice.service.CarServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/db")
public class CarController {


    private final CarServiceImpl carService;

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/car/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id){
        Car car = carService.getCarById(id);
        return ResponseEntity.ok().body(car);
    }

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getAllCars(){
        List<Car> cars = carService.getAllCars();
        return ResponseEntity.ok().body(cars);
    }

}
