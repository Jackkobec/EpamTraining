package com.jss.flow_control.task4;

/**
 * Flow_control. Task4
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 04.11.2016.
 */
public class Task4consoleTest {
    public static void main(String[] args) throws NumberPrinter.IncorrectCountOfLinesException {

        NumberPrinter numberPrinter = new NumberPrinter();

        System.out.println("NumberPrinter tests");
        numberPrinter.printNumbersFromLeft(5);

        System.out.println("=====================");
        numberPrinter.printNumbersFromRight(5);
    }
}
