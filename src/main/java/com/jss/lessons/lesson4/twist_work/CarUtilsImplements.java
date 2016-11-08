package com.jss.lessons.lesson4.twist_work;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Jack on 04.11.2016.
 */
public class CarUtilsImplements implements ICarUtils {

    @Override
    public List<Car> getCarsByBrand(String brend, List<Car> cars) {
        List<Car> res = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equals(brend)) {
                res.add(car);
            }
        }
        return res;
    }

    @Override
    public List<Car> getCarsByModelAndTermOfUse(String brend, int termOfUse, List<Car> cars) {
        List<Car> res = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equals(brend)) {
                Calendar calendar = Calendar.getInstance();
                int carTermOfUse = calendar.get(Calendar.YEAR) - car.getDateCreation();
                if (carTermOfUse > termOfUse) {
                    res.add(car);
                }
            }
        }
        return res;
    }

    @Override
    public List<Car> getCarsByDateCreationAndMinPrice(int dateCreation, double minPrice, List<Car> cars) {

        List<Car> res = new ArrayList<>();
        for (Car car : cars) {
            if (car.getDateCreation() == dateCreation && car.getPrice() > minPrice) {
                res.add(car);
            }
        }

        return res;
    }


}
