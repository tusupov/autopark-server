package com.usupov.productcard.dao.impl;

import com.usupov.productcard.dao.CarDAO;
import com.usupov.productcard.dao.YearDAO;
import com.usupov.productcard.mapper.CarMapper;
import com.usupov.productcard.mapper.YearMapper;
import com.usupov.productcard.model.Car;
import com.usupov.productcard.model.Year;
import com.usupov.productcard.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CarDAO")
@Configuration
public class CarDAOImpl implements CarDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private FileService fileService;

    @Override
    public List<Car> getAll() {

        String SQL = "SELECT " +
                        "`c`.*, " +
                        "`b`.`NAME` as `BRAND_NAME`, " +
                        "`m`.`NAME` as `MODEL_NAME`, " +
                        "`y`.`NAME` as `YEAR_NAME` " +
                     "FROM `pa_user_cars` as `c` " +
                     "INNER JOIN `pa_brands` as `b` ON `b`.`ID` = `c`.`BRAND_ID` " +
                     "INNER JOIN `pa_models` as `m` ON `m`.`ID` = `c`.`MODEL_ID` " +
                     "INNER JOIN `pa_years`  as `y` ON `y`.`ID` = `c`.`YEAR_ID` " +
                     "ORDER BY `ID`;";

        try {

            List<Car> carList = jdbcTemplate.query(SQL, new CarMapper());

            for (Car car: carList)
                car.setImageUrl(fileService.getCarImageUrl(car.getId()));

            return carList;

        } catch (EmptyResultDataAccessException e) {

            return null;

        }


    }

    @Override
    public Car getById(long id) {

        String SQL = "SELECT " +
                "`c`.*, " +
                "`b`.`NAME` as `BRAND_NAME`, " +
                "`m`.`NAME` as `MODEL_NAME`, " +
                "`y`.`NAME` as `YEAR_NAME` " +
                "FROM `pa_user_cars` as `c` " +
                "INNER JOIN `pa_brands` as `b` ON `b`.`ID` = `c`.`BRAND_ID` " +
                "INNER JOIN `pa_models` as `m` ON `m`.`ID` = `c`.`MODEL_ID` " +
                "INNER JOIN `pa_years`  as `y` ON `y`.`ID` = `c`.`YEAR_ID` " +
                "WHERE `c`.`ID` = " + id + " " +
                "LIMIT 1;";

        try {

            Car car = jdbcTemplate.queryForObject(SQL, new CarMapper());
            car.setImageUrl(fileService.getCarImageUrl(car.getId()));

            return car;

        } catch (EmptyResultDataAccessException e) {

            return null;

        }

    }

    @Override
    public Car getByVin(String vin) {
        return null;
    }

    @Override
    public Car getByCatalog(long brandId, long modelId, long yearId) {
        return null;
    }

    @Override
    public void add(Car car) {

    }

    @Override
    public int delete(long id) {

        String SQL = "DELETE FROM `pa_user_cars` WHERE `ID`=" + id + ";";

        try {

            return jdbcTemplate.update(SQL);

        } catch (EmptyResultDataAccessException e) {}

        return 0;

    }

}
