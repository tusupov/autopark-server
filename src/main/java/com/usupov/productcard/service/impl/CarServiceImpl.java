package com.usupov.productcard.service.impl;

import com.usupov.productcard.model.Car;
import com.usupov.productcard.service.CarService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service("CarService")
public class CarServiceImpl implements CarService {

    private static List<Car> cars;

    /**
     * Get all cars list
     * @return
     */
    public List<Car> getAll() {

        cars.sort(new Comparator<Car>() {

            @Override
            public int compare(Car car1, Car car2) {
                if (car1.getId() > car2.getId()) return -1;
                if (car1.getId() < car2.getId()) return 1;
                return 0;
            }

        });

        return cars;

    }

    /**
     * Get car by id
     * @param id
     * @return
     */
    public Car getById(long id) {

        return cars.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .get();

    }

    /**
     * Get car by vin code
     * @param vin
     * @return
     */
    public Car getByVin(String vin) {

        return cars.stream()
                .filter(c -> c.getVin().equals(vin))
                .findFirst()
                .get();

    }

    /**
     * Add new Car
     * @param car
     */
    public void add(Car car) {
        cars.add(car);
    }

    /**
     * Delete car by id
     * @param id
     */
    public void deleteById(long id) {
        cars.removeIf(c -> c.getId() == id);
    }

}
