package com.usupov.productcard.service;

import com.usupov.productcard.model.Part;

public interface PartService {

    void add(Part part);

    long count(long carId, long categoryId);

}
