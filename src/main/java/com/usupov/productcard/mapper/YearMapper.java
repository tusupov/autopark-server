package com.usupov.productcard.mapper;

import com.usupov.productcard.model.Model;
import com.usupov.productcard.model.Year;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class YearMapper implements RowMapper<Year> {

    @Override
    public Year mapRow(ResultSet resultSet, int i) throws SQLException {

        Year year = new Year();
        year.setId(resultSet.getLong("ID"));
        year.setBrandId(resultSet.getLong("BRAND_ID"));
        year.setModelId(resultSet.getLong("MODEL_ID"));
        year.setName(resultSet.getString("NAME"));

        return year;

    }

}
