package com.usupov.autopark.model;

import java.util.concurrent.atomic.AtomicLong;

public class Car {

    private static AtomicLong counter = new AtomicLong();
    private long id;
    private String name;
    private String imageUri;
    private String description;

    private String vin;

    public Car(String name, String imageUri, String description) {
        this.id          = counter.incrementAndGet();
        this.name        = name;
        this.imageUri    = imageUri;
        this.description = description;
    }

    public Car(String name, String imageUri, String description, String vin) {
        this.id          = counter.incrementAndGet();
        this.name        = name;
        this.imageUri    = imageUri;
        this.description = description;
        this.vin         = vin;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUri() {
        return imageUri;
    }

    public String getDescription() {
        return description;
    }

    public String getVin() {
        return vin;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

}
