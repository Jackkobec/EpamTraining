package com.jss.flow_control.task3;

/**
 * Flow_control. Task2Nested
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 03.11.2016.
 */
public class Task3consoleTest {
    public static void main(String[] args) throws DepositPercentCalculator.IncorrectInputDataException {

        DepositPercentCalculator depositPercentCalculator = new DepositPercentCalculator();

        System.out.println("DepositPercentCalculator tests:");
        System.out.println("Expected: 12");
        System.out.println("calculateYearsWhile:");
        System.out.println(depositPercentCalculator.calculateYearsWhile(77777, 7777, 22));
        System.out.println("=====================");

        System.out.println("Expected: 12");
        System.out.println("calculateYearsFor:");
        System.out.println(depositPercentCalculator.calculateYearsFor(77777, 7777, 22));
        System.out.println("=====================");

        System.out.println("Expected: 12");
        System.out.println("calculateYearsWhileInfinity:");
        System.out.println(depositPercentCalculator.calculateYearsWhileInfinity(77777, 7777, 22));
        System.out.println("=====================");

        System.out.println("Expected: 12");
        System.out.println("calculateYearsForInfinity:");
        System.out.println(depositPercentCalculator.calculateYearsForInfinity(77777, 7777, 22));
        System.out.println("=====================");

        System.out.println("Expected: 12");
        System.out.println("calculateYearsForInfinityWithLabel:");
        System.out.println(depositPercentCalculator.calculateYearsForInfinityWithLabel(77777, 7777, 22));
    }
}
