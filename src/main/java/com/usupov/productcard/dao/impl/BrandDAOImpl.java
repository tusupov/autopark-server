package com.usupov.productcard.dao.impl;

import com.usupov.productcard.dao.BrandDAO;
import com.usupov.productcard.mapper.BrandMapper;
import com.usupov.productcard.model.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class BrandDAOImpl implements BrandDAO {

    public List<Brand> list() {

        JdbcTemplate jdbcTemplate = new JdbcTemplate();


        String SQL = "SELECT * FROM `pa_brands`";
        List <Brand> brandList = jdbcTemplate.query(SQL, new BrandMapper());

        return brandList;

    }

}
