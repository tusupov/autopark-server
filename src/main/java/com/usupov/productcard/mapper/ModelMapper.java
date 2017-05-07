package com.usupov.productcard.mapper;

import com.usupov.productcard.model.Model;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ModelMapper implements RowMapper<Model> {

    @Override
    public Model mapRow(ResultSet resultSet, int i) throws SQLException {

        Model model = new Model();
        model.setId(resultSet.getLong("ID"));
        model.setBrandId(resultSet.getLong("BRAND_ID"));
        model.setName(resultSet.getString("NAME"));
        model.setCode(resultSet.getString("CODE"));
        model.setYearFrom(resultSet.getInt("YEAR_FROM"));
        model.setYearTo(resultSet.getInt("YEAR_TO"));
        model.setProduction(resultSet.getString("PRODUCTION"));

        return model;

    }

}
