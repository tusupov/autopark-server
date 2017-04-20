package com.usupov.productcard.mapper;

import com.usupov.productcard.model.Brand;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BrandMapper implements RowMapper<Brand> {

    @Override
    public Brand mapRow(ResultSet resultSet, int i) throws SQLException {

        Brand brand = new Brand();
        brand.setId(resultSet.getLong("ID"));
        brand.setName(resultSet.getString("NAME"));
        brand.setCode(resultSet.getString("CODE"));

        return brand;

    }

}
