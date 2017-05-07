package com.usupov.productcard.dao.impl;

import com.usupov.productcard.dao.BrandDAO;
import com.usupov.productcard.dao.ModelDAO;
import com.usupov.productcard.mapper.BrandMapper;
import com.usupov.productcard.mapper.ModelMapper;
import com.usupov.productcard.model.Brand;
import com.usupov.productcard.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ModelDAO")
public class ModelDAOImpl implements ModelDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Model> getList(long brandId) {

        String SQL = "SELECT * FROM `pa_models` WHERE `BRAND_ID`=" + brandId;
        List<Model> modelList = jdbcTemplate.query(SQL, new ModelMapper());

        return modelList;

    }
}
