package com.usupov.productcard.model;

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
