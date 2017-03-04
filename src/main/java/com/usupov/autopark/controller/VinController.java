package com.usupov.autopark.controller;

import com.usupov.autopark.config.CarRestURIConstants;
import com.usupov.autopark.config.VinRestURIConstants;
import com.usupov.autopark.model.Vin;
import com.usupov.autopark.service.VinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = CarRestURIConstants.API)
public class VinController {

    @Autowired
    private VinService vinService;

    @RequestMapping(value = VinRestURIConstants.GET_CAR, method = RequestMethod.GET)
    public ResponseEntity<?> getCar(@PathVariable("vin") String vin) {

        vin = vin.toUpperCase();
        Vin vinCar = vinService.getCar(vin);

        if (vinCar == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<Vin>(vinCar, HttpStatus.OK);

    }

}
