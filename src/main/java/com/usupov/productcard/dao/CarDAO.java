package com.usupov.productcard.dao;

import com.usupov.productcard.model.Car;
import com.usupov.productcard.model.Year;

import java.util.List;

public interface CarDAO {

    List<Car> getAll();

    Car getById(long id);

    Car getByCatalog(long brandId, long modelId, long yearId);

    Car getByVin(String vin);

    void add(Car car);

    int delete(long id);

}
