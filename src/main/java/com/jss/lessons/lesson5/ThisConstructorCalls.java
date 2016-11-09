package com.jss.lessons.lesson5;

/**
 * Created by Jack on 09.11.2016.
 */
public class ThisConstructorCalls {

    private int a;
    private int b;
    private int c;

    private String name;
    private String address;

    //if new instance created without parameters - every will be with name "Jack" and address "Kiev"
    public ThisConstructorCalls() {

        this("Jack", "Kiev");
    }

    public ThisConstructorCalls(int c) {

        this(0,0,c);
    }

    public ThisConstructorCalls(int a, int c) {

        this(a, 0, c);
    }


//    public ThisConstructorCalls(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }

    public ThisConstructorCalls(String name) {

        this(name, null);
    }

    public ThisConstructorCalls(String name, String address) {

        this.name = name;
        this.address = address;
    }

    public ThisConstructorCalls(int a, int b, int c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }











    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
