package com.usupov.productcard.service;

import com.usupov.productcard.dto.CategoryDTO;
import com.usupov.productcard.model.Category;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getTree(long carId);

    Category getById(long carId, long id);

}
