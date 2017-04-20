package com.usupov.productcard.model;

public class Brand {

    private long id;
    private String name, code;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String toString(){
        return "{ID=" + id + ",Name=" + name + ",Code=" + code + "}";
    }
}
