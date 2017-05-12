package com.usupov.productcard.controller;

import com.usupov.productcard.config.CarRestURIConstants;
import com.usupov.productcard.config.PartRestURIConstants;
import com.usupov.productcard.model.Part;
import com.usupov.productcard.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = CarRestURIConstants.API)
public class PartController {

    @Autowired
    private PartService partService;

    @RequestMapping(value = PartRestURIConstants.CREATE, headers = ("content-type=multipart/*"), method = RequestMethod.POST)
    public ResponseEntity<?> createPart(
            @PathVariable("carId") long carId,
            @PathVariable("categoryId") long categoryId,
            @RequestParam("brand") String brand,
            @RequestParam("status") String status,
            @RequestParam(value = "store", required = false) String store,
            @RequestParam(value = "comment", required = false) String comment,
            @RequestParam(value = "file", required = false) MultipartFile[] imageList
    ) {

        partService.add(
            new Part(
                carId,
                categoryId,
                brand,
                status
            )
        );

        return new ResponseEntity<>(HttpStatus.OK);

    }

}
