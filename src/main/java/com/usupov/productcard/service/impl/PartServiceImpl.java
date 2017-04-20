package com.usupov.productcard.service.impl;

import com.usupov.productcard.model.Part;
import com.usupov.productcard.service.PartService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("PartService")
public class PartServiceImpl implements PartService {

    private static List<Part> parts;

    static {

        parts = new ArrayList<Part>();

    }

    public void add(Part part) {
        parts.add(part);
    }

    public long count(long carId, long categoryId) {

        return parts
                .stream()
                .filter(p -> p.getCarId() == carId && p.getCategoryId() == categoryId)
                .count();

    }

}
