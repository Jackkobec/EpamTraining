package com.jss.flow_control.task3;

/**
 * Flow_control. Task2
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 03.11.2016.
 */
public class DepositPercentCalculator {

    /**
     * calculateYearsWhile
     *
     * @param endSum
     * @param startSum
     * @param depositPercent
     * @return
     * @throws IncorrectInputDataException
     */
    public int calculateYearsWhile(double endSum, double startSum, double depositPercent) throws IncorrectInputDataException {
        if (startSum == 0 || endSum == 0 || depositPercent == 0) {
            throw new IncorrectInputDataException("Переданные данные неверны.");
        }
        double percentPart = depositPercent / 100;
        int years = 0;
        double temp = startSum;
        while (temp <= endSum) {
            temp += temp * percentPart;
            years++;
        }
        return years;
    }

    /**
     * calculateYearsFor
     *
     * @param endSum
     * @param startSum
     * @param depositPercent
     * @return
     * @throws IncorrectInputDataException
     */
    public int calculateYearsFor(double endSum, double startSum, double depositPercent) throws IncorrectInputDataException {
        if (startSum == 0 || endSum == 0 || depositPercent == 0) {
            throw new IncorrectInputDataException("Переданные данные неверны.");
        }
        double percentPart = depositPercent / 100;
        int years = 0;

        for (double temp = startSum; temp < endSum; temp += temp * percentPart) {
            years++;
        }
        return years;
    }

    /**
     * calculateYearsWhileInfinity
     *
     * @param endSum
     * @param startSum
     * @param depositPercent
     * @return
     * @throws IncorrectInputDataException
     */
    public int calculateYearsWhileInfinity(double endSum, double startSum, double depositPercent) throws IncorrectInputDataException {
        if (startSum == 0 || endSum == 0 || depositPercent == 0) {
            throw new IncorrectInputDataException("Переданные данные неверны.");
        }
        double percentPart = depositPercent / 100;
        int years = 0;
        double temp = startSum;
        while (true) {
            if (temp >= endSum) {
                break;
            }
            temp += temp * percentPart;
            years++;
        }
        return years;
    }

    /**
     * calculateYearsForInfinity
     *
     * @param endSum
     * @param startSum
     * @param depositPercent
     * @return
     * @throws IncorrectInputDataException
     */
    public int calculateYearsForInfinity(double endSum, double startSum, double depositPercent) throws IncorrectInputDataException {
        if (startSum == 0 || endSum == 0 || depositPercent == 0) {
            throw new IncorrectInputDataException("Переданные данные неверны.");
        }
        double percentPart = depositPercent / 100;
        int years = 0;
        double temp = startSum;
        for (; ; ) {
            if (temp >= endSum) {
                break;
            }
            temp += temp * percentPart;
            years++;
        }
        return years;
    }

    /**
     * calculateYearsForInfinityWithLabel
     *
     * @param endSum
     * @param startSum
     * @param depositPercent
     * @return
     * @throws IncorrectInputDataException
     */
    public int calculateYearsForInfinityWithLabel(double endSum, double startSum, double depositPercent) throws IncorrectInputDataException {
        if (startSum == 0 || endSum == 0 || depositPercent == 0) {
            throw new IncorrectInputDataException("Переданные данные неверны.");
        }
        double percentPart = depositPercent / 100;
        int years = 0;
        double temp = startSum;
        OUTER_LABEL:
        for (; ; ) {
            if (temp >= endSum) {
                break OUTER_LABEL;
            }
            temp += temp * percentPart;
            years++;
        }

        return years;
    }

    /**
     * IncorrectInputDataException
     */
    public class IncorrectInputDataException extends Throwable {
        public IncorrectInputDataException(String s) {
            super(s);
        }
    }
}
