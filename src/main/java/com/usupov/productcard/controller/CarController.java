package com.usupov.productcard.controller;

import com.usupov.productcard.config.CarRestURIConstants;
import com.usupov.productcard.dao.CarDAO;
import com.usupov.productcard.model.Car;
import com.usupov.productcard.service.FileService;
import com.usupov.productcard.service.VinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = CarRestURIConstants.API)
public class CarController {

    @Autowired
    private CarDAO carDAO;

    @Autowired
    private FileService fileService;

    @RequestMapping(value = CarRestURIConstants.GET_ALL, method = RequestMethod.GET)
    public ResponseEntity<List<Car>> getCarList() {

        List<Car> cars = carDAO.getAll();
        return new ResponseEntity<List<Car>>(cars, HttpStatus.OK);

    }

    @RequestMapping(value = CarRestURIConstants.GET_BY_ID, method = RequestMethod.GET)
    public ResponseEntity<?> getCarByID(@PathVariable("id") int id) {

        Car car = carDAO.getById(id);

        if (car == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<Car>(car, HttpStatus.OK);

    }

    @RequestMapping(value = CarRestURIConstants.GET_BY_VIN, method = RequestMethod.GET)
    public ResponseEntity<?> getCarByVin(@PathVariable("vin") String vin) {

        Car car = carDAO.getByVin(vin);

        if (car == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<Car>(car, HttpStatus.OK);

    }

    @RequestMapping(value = CarRestURIConstants.GET_BY_CATALOG, method = RequestMethod.GET)
    public ResponseEntity<?> getCarByCatalog(@PathVariable("brandId") long brandId, @PathVariable("modelId") long modelId, @PathVariable("yearId") long yearId) {

        Car car = carDAO.getByCatalog(brandId, modelId, yearId);

        if (car == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<Car>(car, HttpStatus.OK);

    }

    @RequestMapping(value = CarRestURIConstants.CREATE, headers = ("content-type=multipart/*"), method = RequestMethod.POST)
    public ResponseEntity<?> createCar(
            @RequestParam("brandId") long brandId,
            @RequestParam("modelId") long modelId,
            @RequestParam("yearId") long yearId,
            @RequestParam(value = "vin", required = false) String vin,
            @RequestParam(value = "file", required = false) MultipartFile file
    ) throws IOException {

        Car car = carDAO.getByCatalog(brandId, modelId, yearId);
        if (car == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        car.setVin(vin);

        long carId = carDAO.add(car);
        if (carId <= 0)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        car.setId(carId);

        String imageFullPath = fileService.saveCarImage(file, car.getId());
        car.setImageUrl(imageFullPath);

        return new ResponseEntity<Car>(car, HttpStatus.OK);

    }

    @RequestMapping(value = CarRestURIConstants.DELETE, method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCarById(@PathVariable("id") long id) {

        if (carDAO.delete(id) > 0)
            return new ResponseEntity<>(HttpStatus.OK);

        return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);

    }

}
