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
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
                "WHERE `c`.`ID` = ?" +
                "LIMIT 1;";

        try {

            Car car = jdbcTemplate.queryForObject(SQL, new CarMapper(), id);
            car.setImageUrl(fileService.getCarImageUrl(car.getId()));

            return car;

        } catch (EmptyResultDataAccessException e) {

            return null;

        }

    }

    @Override
    public Car getByVin(String vin) {

        vin = vin.toUpperCase();

        String SQL = "SELECT " +
                "NULL as `ID`, " +
                "`b`.`ID` as `BRAND_ID`, " +
                "`b`.`NAME` as `BRAND_NAME`, " +
                "`m`.`ID` as `MODEL_ID`, " +
                "`m`.`NAME` as `MODEL_NAME`, " +
                "`y`.`ID` as `YEAR_ID`," +
                "`y`.`NAME` as `YEAR_NAME`," +
                "`v`.`VIN`" +
                "FROM `pa_vins` as `v` " +
                "INNER JOIN `pa_brands` as `b` ON `b`.`CODE` = `v`.`BRAND_CODE` " +
                "INNER JOIN `pa_models` as `m` ON `m`.`CODE` = `v`.`MODEL_CODE` AND `m`.`BRAND_ID` = `b`.`ID` " +
                "INNER JOIN `pa_years`  as `y` ON `y`.`NAME` = `v`.`YEAR` AND `y`.`MODEL_ID` = `m`.`ID`" +
                "WHERE UPPER(`v`.`VIN`) = ?;";

        try {

            Car car = jdbcTemplate.queryForObject(SQL, new CarMapper(), vin);
            return car;

        } catch (EmptyResultDataAccessException e) {}

        return null;

    }

    @Override
    public Car getByCatalog(long brandId, long modelId, long yearId) {

        String SQL = "SELECT " +
                "NULL as `ID`, " +
                "`b`.`ID` as `BRAND_ID`, " +
                "`b`.`NAME` as `BRAND_NAME`, " +
                "`m`.`ID` as `MODEL_ID`, " +
                "`m`.`NAME` as `MODEL_NAME`, " +
                "`y`.`ID` as `YEAR_ID`," +
                "`y`.`NAME` as `YEAR_NAME`, " +
                "NULL as `VIN` " +
                "FROM `pa_brands` as `b` " +
                "INNER JOIN `pa_models` as `m`" +
                "INNER JOIN `pa_years`  as `y`" +
                "WHERE `b`.`ID` = ? AND `m`.`ID` = ? AND `y`.`ID` = ?;";

        try {

            Car car = jdbcTemplate.queryForObject(SQL, new CarMapper(), brandId, modelId, yearId);
            return car;

        } catch (EmptyResultDataAccessException e) {}

        return null;

    }

    @Override
    public long add(Car car) {

        String SQL = "INSERT INTO `pa_user_cars` (`BRAND_ID`, `MODEL_ID`, `YEAR_ID`, `VIN`) " +
                "VALUES (?, ?, ?, ?);";

        try {

            KeyHolder keyHolder = new GeneratedKeyHolder();
            int row = jdbcTemplate.update(
                    new PreparedStatementCreator() {
                        public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                            PreparedStatement ps =
                                    connection.prepareStatement(SQL, new String[] {"ID"});
                            ps.setLong(1, car.getBrandId());
                            ps.setLong(2, car.getModelId());
                            ps.setLong(3, car.getYearId());
                            ps.setString(4, car.getVin());
                            return ps;
                        }
                    },
                    keyHolder);

            return row == 1 ? keyHolder.getKey().longValue() : 0;

        } catch (Exception e) {}

        return 0;
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
