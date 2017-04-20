package com.usupov.productcard.service.impl;

import com.usupov.productcard.model.Car;
import com.usupov.productcard.service.CarService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service("CarService")
public class CarServiceImpl implements CarService {

    private static List<Car> cars;

    static {

        cars = new ArrayList<Car>();

        cars.add(
            new Car(
                "Ford Focus III, 2012",
                "http://auto-database.com/image/ford-focus-iii-2012-pics-232413.jpg",
                "1.6 AMT (125 л.с) бензин, передний привод, хэтчбек 5 дв."
            )
        );

        cars.add(
            new Car(
                "Hyundai Coupe II (GK)",
                "http://img-fotki.yandex.ru/get/5001/alenavs.0/0_41b20_4f5be03b_L.jpg",
                "2.0 AT (150 л.с) бензин, задний привод, хэтчбек 5 дв."
            )
        );

        cars.add(
            new Car(
                "ИЖ 2717",
                "http://carspravka.ru/images/auto/9f382d0d1a912ef853785508461f4127.jpg",
                "1.6 МТ (73 л.с.) бензин, задний привод, фургон"
            )
        );

        cars.add(
            new Car(
                "Mitsubishi Outlander III",
                "http://automobilio.info/auto/Mitsubishi-Outlander-III.jpg",
                "2.0 AT (146 л.с) бензин, передний привод, внедорожник 5 дв."
            )
        );

        cars.add(
            new Car(
                "Ford Focus III, 2012",
                "http://auto-database.com/image/ford-focus-iii-2012-pics-232413.jpg",
                "1.6 AMT (125 л.с) бензин, передний привод, хэтчбек 5 дв."
            )
        );

        cars.add(
            new Car(
                "Hyundai Coupe II (GK)",
                "http://img-fotki.yandex.ru/get/5001/alenavs.0/0_41b20_4f5be03b_L.jpg",
                "2.0 AT (150 л.с) бензин, задний привод, хэтчбек 5 дв."
            )
        );

        cars.add(
            new Car(
                "ИЖ 2717",
                "http://carspravka.ru/images/auto/9f382d0d1a912ef853785508461f4127.jpg",
                "1.6 МТ (73 л.с.) бензин, задний привод, фургон"
            )
        );

        cars.add(
            new Car(
                "Mitsubishi Outlander III",
                "http://automobilio.info/auto/Mitsubishi-Outlander-III.jpg",
                "2.0 AT (146 л.с) бензин, передний привод, внедорожник 5 дв."
            )
        );

    }

    /**
     * Get all cars list
     * @return
     */
    public List<Car> getAll() {

        cars.sort(new Comparator<Car>() {

            @Override
            public int compare(Car car1, Car car2) {
                if (car1.getId() > car2.getId()) return -1;
                if (car1.getId() < car2.getId()) return 1;
                return 0;
            }

        });

        return cars;

    }

    /**
     * Get car by id
     * @param id
     * @return
     */
    public Car getById(long id) {

        return cars.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .get();

    }

    /**
     * Get car by vin code
     * @param vin
     * @return
     */
    public Car getByVin(String vin) {

        return cars.stream()
                .filter(c -> c.getVin().equals(vin))
                .findFirst()
                .get();

    }

    /**
     * Add new Car
     * @param car
     */
    public void add(Car car) {
        cars.add(car);
    }

    /**
     * Delete car by id
     * @param id
     */
    public void deleteById(long id) {
        cars.removeIf(c -> c.getId() == id);
    }

}
