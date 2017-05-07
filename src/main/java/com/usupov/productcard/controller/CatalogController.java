package com.usupov.productcard.controller;


import com.usupov.productcard.config.CatalogRestURIConstants;
import com.usupov.productcard.config.CarRestURIConstants;
import com.usupov.productcard.dao.BrandDAO;
import com.usupov.productcard.dao.ModelDAO;
import com.usupov.productcard.dao.YearDAO;
import com.usupov.productcard.model.Brand;
import com.usupov.productcard.model.Model;
import com.usupov.productcard.model.Year;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = CarRestURIConstants.API)
public class CatalogController {

    @Autowired
    private BrandDAO brandDAO;

    @Autowired
    private ModelDAO modelDAO;

    @Autowired
    private YearDAO yearDAO;

    @RequestMapping(value = CatalogRestURIConstants.BRAND_GET_ALL, method = RequestMethod.GET)
    public ResponseEntity<List<Brand>> getBrandList() {

        List<Brand> brandList = brandDAO.getList();
        return new ResponseEntity<List<Brand>>(brandList, HttpStatus.OK);

    }

    @RequestMapping(value = CatalogRestURIConstants.MODEL_GET_ALL, method = RequestMethod.GET)
    public ResponseEntity<List<Model>> getModelList(@PathVariable("brandId") int brandId) {

        List<Model> modelList = modelDAO.getList(brandId);
        return new ResponseEntity<List<Model>>(modelList, HttpStatus.OK);

    }

    @RequestMapping(value = CatalogRestURIConstants.YEAR_GET_ALL, method = RequestMethod.GET)
    public ResponseEntity<List<Year>> getYearList(@PathVariable("brandId") int brandId, @PathVariable("modelId") int modelId) {

        List<Year> yearList = yearDAO.getList(brandId, modelId);
        return new ResponseEntity<List<Year>>(yearList, HttpStatus.OK);

    }

}
