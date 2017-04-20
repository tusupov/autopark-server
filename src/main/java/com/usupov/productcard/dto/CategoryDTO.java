package com.usupov.productcard.dto;

import java.util.List;

public class CategoryDTO {

    private long id;
    private String name;

    private int percent = 0;

    private List<CategoryDTO> child;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPercent() {
        return percent;
    }

    public List<CategoryDTO> getChild() {
        return child;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public void setChild(List<CategoryDTO> child) {
        this.child = child;
    }

}
