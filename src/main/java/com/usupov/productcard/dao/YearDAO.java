package com.usupov.productcard.dao;

import com.usupov.productcard.model.Year;

import java.util.List;

public interface YearDAO {

    public List<Year> getList(long brandId, long modelId);

}
