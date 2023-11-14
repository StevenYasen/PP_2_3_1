package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private Car[] cars = {
            new Car(1999, "Honda", 777),
            new Car(2008, "Hyindai", 1745),
            new Car(2020, "BMW", 300),
            new Car(1998, "Moskvich", 199),
            new Car(2000, "Zapor", 111)
    };


    @Override
    public List<Car> createCars(int n) {
        return Arrays.asList(Arrays.copyOf(cars, n));
    }

}
