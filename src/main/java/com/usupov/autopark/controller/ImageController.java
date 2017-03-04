package com.usupov.autopark.controller;

import com.usupov.autopark.config.CarRestURIConstants;
import com.usupov.autopark.config.ImageRestURIConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.nio.file.Files;

@RestController
@RequestMapping(value = CarRestURIConstants.API)
public class ImageController {

    @RequestMapping(value = ImageRestURIConstants.GET_CAR, method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<?> getCarImage(@PathVariable("id") long id) {

        try {

            File serverFile = new File("upload/car/" + id + ".jpg");
            return new ResponseEntity<byte[]>(Files.readAllBytes(serverFile.toPath()), HttpStatus.OK);

        } catch (Exception e) {}

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

}
