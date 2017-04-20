package com.usupov.productcard.controller;

import com.usupov.productcard.config.CarRestURIConstants;
import com.usupov.productcard.config.CategoryRestURIConstants;
import com.usupov.productcard.dto.CategoryDTO;
import com.usupov.productcard.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = CarRestURIConstants.API)
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = CategoryRestURIConstants.GET_TREE, method = RequestMethod.GET)
    public ResponseEntity<List<CategoryDTO>> getCategoryTree(@PathVariable("id") long carId) {

        List<CategoryDTO> categoryDTOTree = categoryService.getTree(carId);
        return new ResponseEntity<List<CategoryDTO>>(categoryDTOTree, HttpStatus.OK);

    }

}
