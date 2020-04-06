package pl.haladyj.restclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.haladyj.restclient.model.Car;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class DriverController {

    private final RestTemplate restTemplate;

    public DriverController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/echoDriverFirstName/{name}")
    public String echoDriverFirstName(@PathVariable String name) {
        return "Welcome "  +name+ ". Have a nice day.";
    }

    @GetMapping("/cars")
    public List<Car> getAvailableCars() {

        List<Car> cars = restTemplate.getForObject("http://h2-db-service/db/cars", List.class);

        return cars;
    }
}
