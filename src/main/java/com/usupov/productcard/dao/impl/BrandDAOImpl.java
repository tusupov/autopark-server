package com.usupov.productcard.dao.impl;

import com.usupov.productcard.dao.BrandDAO;
import com.usupov.productcard.mapper.BrandMapper;
import com.usupov.productcard.model.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("BrandDAO")
public class BrandDAOImpl implements BrandDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Brand> getList() {

        String SQL = "SELECT * FROM `pa_brands`";
        List<Brand> brandList = jdbcTemplate.query(SQL, new BrandMapper());

        return brandList;

    }

}
