package com.jss.lesson1;


/**
 * Created by Jack on 28.10.2016.
 */
public class TestHello {
    public static void main(String[] args) {
        new Hello().printHello();

        byte bt = (byte) 128; //out -128
        byte b = 7;

        b = (byte) (b + 1);
        System.out.println(b);
        Float f1 = new Float(10.71);
        float forCast = (float)f1;//cast referense to primitive

        int a = 7;
        Integer ib = a;
        Integer ic = a;
        System.out.println(a == ib);
        System.out.println(ib == ic);


    }
}
