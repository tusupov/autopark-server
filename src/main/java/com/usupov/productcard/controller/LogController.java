package com.usupov.productcard.controller;

import com.usupov.productcard.config.LogRestURIConstants;
import com.usupov.productcard.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Paths;

@RestController
@RequestMapping(value = LogRestURIConstants.API)
public class LogController {

    @Autowired
    private LogService logService;

    @RequestMapping(value = LogRestURIConstants.VIN, method = RequestMethod.POST)
    public void logVin(@RequestParam("vin") String vin) throws UnsupportedEncodingException {

        logService.add("vin", vin);

    }

    @RequestMapping(value = LogRestURIConstants.VIN, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getVinLog(HttpServletResponse response) {

        String txt = "";

        try {

            File file = new File(Paths.get("logs").resolve("vin.log").toString());
            BufferedReader bf = new BufferedReader(new FileReader(file));

            String line;
            while((line = bf.readLine()) != null)
                txt += line + "\r\n";

        } catch (Exception e) {}

        return txt;

    }

}
