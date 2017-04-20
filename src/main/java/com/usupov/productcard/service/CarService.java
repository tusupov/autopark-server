package com.usupov.productcard.service;

import com.usupov.productcard.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getAll();

    Car getById(long id);

    Car getByVin(String vin);

    void add(Car car);

    void deleteById(long id);

}
