package com.usupov.autopark.model;

import java.util.concurrent.atomic.AtomicLong;

public class Category {

    private static AtomicLong counter = new AtomicLong();

    private long id;
    private String name;
    private Category child;

    public Category(String name) {
        this.id   = counter.incrementAndGet();
        this.name = name;
    }

    public Category(String name, Category child) {
        this.id    = counter.incrementAndGet();
        this.name  = name;
        this.child = child;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getChild() {
        return child;
    }
}
