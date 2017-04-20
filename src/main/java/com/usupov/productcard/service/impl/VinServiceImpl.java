package com.usupov.productcard.service.impl;

import com.usupov.productcard.model.Vin;
import com.usupov.productcard.service.VinService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("VinService")
public class VinServiceImpl implements VinService {

    private static Map<String, Vin> vins = new HashMap<String, Vin>();

    static {

        vins.put(
            "3VWBB61C4WM050210",
            new Vin(
                "Hyundai Coupe II (GK)",
                "2.0 AT (150 л.с) бензин, задний привод, хэтчбек 5 дв."
            )
        );

        vins.put(
            "11111111111111111",
            new Vin(
                "Hyundai Coupe II (GK)",
                "2.0 AT (150 л.с) бензин, задний привод, хэтчбек 5 дв."
            )
        );

        vins.put(
            "22222222222222222",
            new Vin(
                "ИЖ 2717",
                "1.6 МТ (73 л.с.) бензин, задний привод, фургон"
            )
        );

        vins.put(
            "33333333333333333",
            new Vin(
                "Mitsubishi Outlander III",
                "2.0 AT (146 л.с) бензин, передний привод, внедорожник 5 дв."
            )
        );

        vins.put(
            "4444444444444444",
            new Vin(
                "Ford Focus III, 2012",
                "1.6 AMT (125 л.с) бензин, передний привод, хэтчбек 5 дв."
            )
        );

    }

    @Override
    public Vin getCar(String vin) {

        if (!vin.isEmpty() && vins.containsKey(vin))
            return vins.get(vin);

        return null;

    }

}
