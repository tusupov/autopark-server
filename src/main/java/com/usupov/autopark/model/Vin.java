package com.usupov.autopark.model;

import java.util.concurrent.atomic.AtomicLong;

public class Vin {

    private String name;
    private String description;

    public Vin(String name, String description) {
        this.name        = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
