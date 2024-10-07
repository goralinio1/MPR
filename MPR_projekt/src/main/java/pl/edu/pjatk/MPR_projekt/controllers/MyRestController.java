package pl.edu.pjatk.MPR_projekt.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.pjatk.MPR_projekt.model.Car;
import pl.edu.pjatk.MPR_projekt.services.CarService;


import java.util.List;

@RestController
public class MyRestController {
    private CarService carService;

    @Autowired
    public MyRestController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("car/all") // <- endpoint
    public List<Car> getAll() {
        return this.carService.getCarsList();
    }

    @GetMapping("car/{id}") // <- endpoint
    public Car get(@PathVariable Integer id) {
        return this.carService.get(id);
    }

    @PostMapping("car")
    public void addCar(@RequestBody Car car) {
        this.carService.add(car);
    }

}
