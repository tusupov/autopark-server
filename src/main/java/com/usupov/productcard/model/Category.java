package com.usupov.productcard.model;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Category {

    private static AtomicLong counter = new AtomicLong();

    private long id;
    private String name;

    private long partCnt = 0;
    private long fillPartCnt = 0;
    private int percent = 0;

    private List<Category> child;

    public Category(String name) {
        this.id   = counter.incrementAndGet();
        this.name = name;
    }

    public Category(String name, long partCnt) {
        this.id      = counter.incrementAndGet();
        this.name    = name;
        this.partCnt = partCnt;
    }

    public Category(String name, List<Category> child) {
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

    public long getPartCnt() {
        return partCnt;
    }

    public long getFillPartCnt() {
        return fillPartCnt;
    }

    public int getPercent() {
        return percent;
    }

    public List<Category> getChild() {
        return child;
    }

    public void setPartCnt(long partCnt) {
        this.partCnt = partCnt;
    }

    public void setFillPartCnt(long fillPartCnt) {
        this.fillPartCnt = fillPartCnt;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public void setChild(List<Category> child) {
        this.child = child;
    }
}
