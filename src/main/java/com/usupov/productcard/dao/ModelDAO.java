package com.usupov.productcard.dao;

import com.usupov.productcard.model.Model;

import java.util.List;

public interface ModelDAO {

    public List<Model> getList(long brandId);

}
