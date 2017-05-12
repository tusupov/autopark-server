package com.usupov.productcard.config;

public class CarRestURIConstants {

    public static final String API = "/api";

    /**
     * Cars
     */
    public static final String GET_ALL        = "/cars";
    public static final String GET_BY_ID      = "/car/{id}";
    public static final String GET_BY_VIN     = "/car/vin/{vin}";
    public static final String GET_BY_CATALOG = "/car/brand/{brandId}/model/{modelId}/year/{yearId}";
    public static final String CREATE         = "/car/create";
    public static final String DELETE         = "/car/delete/{id}";

}
