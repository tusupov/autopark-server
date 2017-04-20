package com.usupov.productcard.controller;


import com.usupov.productcard.config.BrandRestURIConstants;
import com.usupov.productcard.config.CarRestURIConstants;
import com.usupov.productcard.dao.BrandDAO;
import com.usupov.productcard.dao.impl.BrandDAOImpl;
import com.usupov.productcard.model.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = CarRestURIConstants.API)
public class BrandController {

    @Autowired
    private BrandDAO brandDAO;

    @RequestMapping(value = BrandRestURIConstants.GET_ALL, method = RequestMethod.GET)
    public ResponseEntity<List<Brand>> getCarList() {
        System.out.println(brandDAO.list());
        return null;
    }


}
