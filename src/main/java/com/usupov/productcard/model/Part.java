package com.usupov.productcard.model;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Part {

    private static AtomicLong counter = new AtomicLong();

    private long id, carId, categoryId;
    private String brand, status, store, comment;
    private List<String> imageList;

    public Part(long carId, long categoryId, String brand, String status) {
        this.id         = counter.incrementAndGet();
        this.carId      = carId;
        this.categoryId = categoryId;
        this.brand      = brand;
        this.status     = status;
    }

    public long getId() {
        return id;
    }

    public long getCarId() {
        return carId;
    }

    public long getCategoryId() {
        return categoryId;
    }

}
