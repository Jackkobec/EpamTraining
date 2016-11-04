package com.jss.flow_control.task1;

/**
 * Flow_control. Task1
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 03.11.2016.
 */
public class Task1consoleTest {
    public static void main(String[] args) {

        NumberMatchFinder numberMatchFinder = new NumberMatchFinder();
        int number = 7747557;
        int digit = 7;

        System.out.println("numberMatchFinder test all methods");
        System.out.println("Expected: 4");
        System.out.println("Actual: " + numberMatchFinder.findNumberMatchCount(number, digit));
        System.out.println("======================");

        System.out.println("Expected: 4");
        System.out.println("Actual: " + numberMatchFinder.findNumberMatchCount2(number + "", digit + ""));
        System.out.println("======================");

        System.out.println("Expected: 4");
        System.out.println("Actual: " + numberMatchFinder.findNumberMatchCount3(number, digit));
        System.out.println("======================");
    }
}
