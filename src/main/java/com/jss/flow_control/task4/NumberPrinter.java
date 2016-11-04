package com.jss.flow_control.task4;

/**
 * Flow_control. Task4
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 04.11.2016.
 */
public class NumberPrinter {


    /**
     * printNumbersFromLeft
     * <p>
     * 1
     * 2 1
     * 3 2 1
     * 4 3 2 1
     * 5 4 3 2 1
     *
     * @param linesCount
     * @throws IncorrectCountOfLinesException
     */
    public void printNumbersFromLeft(int linesCount) throws IncorrectCountOfLinesException {
        if (linesCount == 0) {
            throw new IncorrectCountOfLinesException("Число строк не может быть равным 0");
        }
        for (int i = 0; i < linesCount; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    /**
     * printNumbersFromRight
     * <p>
               1
             2 1
           3 2 1
         4 3 2 1
       5 4 3 2 1
     *
     * @param linesCount
     * @exception IncorrectCountOfLinesException
     */
    public void printNumbersFromRight(int linesCount) throws IncorrectCountOfLinesException {
        if (linesCount == 0) {
            throw new IncorrectCountOfLinesException("Число строк не может быть равным 0");
        }
        for (int i = 1; i <= linesCount; i++) {
                for (int j = linesCount; j > 0; j--) {
                    System.out.print(j > i ? "  " : j + " ");
                }
                System.out.println();
            }
        }


    public class IncorrectCountOfLinesException extends Throwable {
        public IncorrectCountOfLinesException(String s) {
            super(s);
        }
    }
}
