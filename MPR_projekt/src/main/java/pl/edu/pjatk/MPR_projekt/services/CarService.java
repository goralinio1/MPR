package pl.edu.pjatk.MPR_projekt.services;

import org.springframework.stereotype.Component;
import pl.edu.pjatk.MPR_projekt.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    List<Car> carsList = new ArrayList<>();

    public CarService() {
        this.carsList.add(new Car("Opel", "red"));
        this.carsList.add(new Car("BMW", "black"));
        this.carsList.add(new Car("Honda", "green"));
    }

    public List<Car> getCarsList() {
        return this.carsList;
    }

    public void add(Car car) {
        this.carsList.add(car);
    }

    public Car get(Integer id) {
        return this.carsList.get(id);
    }
}
