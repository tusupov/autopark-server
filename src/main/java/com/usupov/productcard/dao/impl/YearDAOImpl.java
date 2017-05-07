package com.usupov.productcard.dao.impl;

import com.usupov.productcard.dao.YearDAO;
import com.usupov.productcard.mapper.YearMapper;
import com.usupov.productcard.model.Year;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("YearDAO")
public class YearDAOImpl implements YearDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Year> getList(long brandId, long modelId) {

        String SQL = "SELECT * FROM `pa_years` WHERE `BRAND_ID`=" + brandId + " AND `MODEL_ID`=" + modelId;
        List<Year> yearList = jdbcTemplate.query(SQL, new YearMapper());

        return yearList;

    }

}
