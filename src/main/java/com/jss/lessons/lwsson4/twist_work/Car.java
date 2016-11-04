package com.jss.lessons.lwsson4.twist_work;

/**
 * Created by Jack on 04.11.2016.
 */
public class Car {

    private int id;
    private String brand;
    private String model;
    private int dateCreation;
    private String color;
    private double price;
    private String regNumber;

    public Car() {
    }

    public Car(int id, String brand, String model, int dateCreation, String color, double price, String regNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.dateCreation = dateCreation;
        this.color = color;
        this.price = price;
        this.regNumber = regNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(int dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return '\n' + "Car " +
                "id=" + id +
                ", model='" + model + '\n' +
                ", brand='" + brand + '\n' +
                ", dateCreation=" + dateCreation +
                ", color='" + color + '\n' +
                ", price=" + price +
                ", regNumber='" + regNumber + '\n';
    }
}
