package com.jss.lessons.lesson4.twist_work;

import java.util.List;

/**
 * Created by Jack on 04.11.2016.
 */
public interface ICarUtils {

    List<Car> getCarsByBrand(String brend, List<Car> cars);

    List<Car> getCarsByModelAndTermOfUse(String brend, int termOfUse, List<Car> cars);

    List<Car> getCarsByDateCreationAndMinPrice(int dateCreation, double minPrice, List<Car> cars);
}
