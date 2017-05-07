package com.usupov.productcard.mapper;

import com.usupov.productcard.model.Car;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarMapper implements RowMapper<Car> {

    @Override
    public Car mapRow(ResultSet resultSet, int i) throws SQLException {

        System.out.println(i);
        System.out.println(resultSet);

        Car car = new Car();

        car.setId(resultSet.getLong("ID"));

        car.setBrandId(resultSet.getLong("BRAND_ID"));
        car.setModelId(resultSet.getLong("MODEL_ID"));
        car.setYearId(resultSet.getLong("YEAR_ID"));

        car.setBrandName(resultSet.getString("BRAND_NAME"));
        car.setModelName(resultSet.getString("MODEL_NAME"));
        car.setYearName(resultSet.getString("YEAR_NAME"));

        car.setVin(resultSet.getString("VIN"));

        return car;

    }

}
