package com.jss.lessons.lesson4.twist_work;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack on 04.11.2016.
 */
public class TestCar {
    public static void main(String[] args) {

        Car car = new Car(1, "Lexus", "Lx1", 1970, "red", 20000, "AN1111");
        Car car2 = new Car(2, "Lexus", "Lx2", 1980, "red", 11111, "AN1111");
        Car car3 = new Car(3, "Toyota", "Lx1", 1984, "red", 22222, "AN1111");
        Car car4 = new Car(4, "Audi", "Lx3", 1991, "red", 55555, "AN1111");
        Car car5 = new Car(5, "Lexus", "Lx1", 1991, "red", 3333, "AN1111");
        Car car6 = new Car(6, "Toyota", "Lx4", 1991, "red", 4444, "AN1111");
        Car car7 = new Car(7, "Lexus", "Lx1", 2000, "red", 5555, "AN1111");

        List<Car> listOfCars = new ArrayList<>();
        listOfCars.add(car);
        listOfCars.add(car2);
        listOfCars.add(car3);
        listOfCars.add(car4);
        listOfCars.add(car5);
        listOfCars.add(car6);
        listOfCars.add(car7);

        ICarUtils cu = new CarUtilsImplements();
        System.out.println("Test getCarsByBrand");
        System.out.println(cu.getCarsByBrand("Lexus", listOfCars));
        System.out.println("======================");

        System.out.println("Test getCarsByModelAndTermOfUse");
        System.out.println(cu.getCarsByModelAndTermOfUse("Lx1", 30, listOfCars));
        System.out.println("======================");

        System.out.println("Test getCarsByDateCreationAndMinPrice");
        System.out.println(cu.getCarsByDateCreationAndMinPrice(1991, 20000, listOfCars));
    }
}
