package com.usupov.productcard.controller;

import com.usupov.productcard.config.CarRestURIConstants;
import com.usupov.productcard.dao.CarDAO;
import com.usupov.productcard.model.Car;
import com.usupov.productcard.model.Vin;
import com.usupov.productcard.service.CarService;
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
    private VinService vinService;

    @Autowired
    private FileService fileService;

    @RequestMapping(value = CarRestURIConstants.GET_ALL, method = RequestMethod.GET)
    public ResponseEntity<List<Car>> getCarList() {

        List<Car> cars = carDAO.getAll();
        return new ResponseEntity<List<Car>>(cars, HttpStatus.OK);

    }

    @RequestMapping(value = CarRestURIConstants.GET_BY_ID, method = RequestMethod.GET)
    public ResponseEntity<Car> getCarByID(@PathVariable("id") int id) {

        Car car = carDAO.getById(id);

        if (car == null)
            return new ResponseEntity<Car>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<Car>(car, HttpStatus.OK);

    }

    @RequestMapping(value = CarRestURIConstants.CREATE, headers = ("content-type=multipart/*"), method = RequestMethod.POST)
    public ResponseEntity<?> addCarByVin(@RequestParam("vin") String vin, @RequestParam(value = "file", required = false) MultipartFile file) throws IOException {

//        Vin vinCar = vinService.getCar(vin);
//
//        if(vinCar == null)
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//
//        Car car = new Car(
//            vinCar.getName(),
//            null,
//            vinCar.getDescription(),
//            vin
//        );
//
//        String imageFullPath = fileService.save(file, car.getId());
//        car.setImageUri(imageFullPath);
//
//        carService.add(car);
//
//        return new ResponseEntity<Car>(car, HttpStatus.OK);

        return null;

    }

    @RequestMapping(value = CarRestURIConstants.DELETE, method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCarById(@PathVariable("id") long id) {

        if (carDAO.delete(id) > 0)
            return new ResponseEntity<>(HttpStatus.OK);

        return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);

    }

}
