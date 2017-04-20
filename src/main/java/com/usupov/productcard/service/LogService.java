package com.usupov.productcard.service;

import java.io.UnsupportedEncodingException;

public interface LogService {

    void add(String filePrefix, String log) throws UnsupportedEncodingException;

}
