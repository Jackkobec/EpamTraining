package com.jss.flow_control.task2;

import java.util.List;

/**
 * Flow_control. Task2
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 03.11.2016.
 */
public class Task2consoleTest {
    public static void main(String[] args) {
        InputNumbersOperations inputNumbersOperations = new InputNumbersOperations();
        List<Integer> list = inputNumbersOperations.inputData();
        System.out.println("InputNumbersOperations tests.");
        System.out.println("Entered numbers: ");
        System.out.println(list);

        System.out.println("Max element: ");
        System.out.println(inputNumbersOperations.findMaxEl(list));

        System.out.println("Max element alt method: ");
        System.out.println(inputNumbersOperations.findMaxElLoop(list));

        System.out.println("Min element: ");
        System.out.println(inputNumbersOperations.findMinEl(list));

        System.out.println("Min element alt method: ");
        System.out.println(inputNumbersOperations.findMinElLoop(list));

        System.out.println("AverageOfAllEl: ");
        System.out.println(inputNumbersOperations.findAverageOfAllElLoop(list));

        System.out.println("AverageOfAllEl alt method: ");
        System.out.println(inputNumbersOperations.findAverageOfAllEl(list));

    }
}
