package com.jss.lessons.lesson5;

/**
 * Created by Jack on 09.11.2016.
 */
public class LocalClass {

    private static String secondName = "Kobec";
    private int age;

    public void method() {
        String name = "Jack";

        //first local cass
        class Local {
            public void print() {
                System.out.println(name); //call field from method
                System.out.println(age);  // call field from external class
            }
        }
        //second previos_inner class
        class Local2 {
            public void print() {
                System.out.println(secondName); //call field from external class
            }

        }
    }
}
