package com.jss.flow_control.task1;

/**
 * Find count matches of digits in the number
 * <p>
 *
 * Flow_control. Task1
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 03.11.2016.
 */

public class NumberMatchFinder {

    /**
     * Recursive decision
     *
     * @param input
     * @param digit
     * @return
     */
    public int findNumberMatchCount(int input, int digit) {
        int count = 0;
        if (input == 0) {
            throw new NullPointerException("Передан 0");
        }
        if (input == digit) {
            return 1;
        }
        return (input % 10 == digit ? ++count : count) + findNumberMatchCount(input / 10, digit);
    }

    /**
     * String usage decision
     *
     * @param str
     * @param n
     * @return
     */
    public int findNumberMatchCount2(String str, String n) {
        int count = 0;
        if (str.isEmpty()) {
            return count;
        }
        return (str.substring(str.length() - 1).contains(n) ? ++count : count) + findNumberMatchCount2(str.substring(0, str.length() - 1), n);
    }

    /**
     * Linear decision
     *
     * @param input
     * @param digit
     * @return
     */
    public int findNumberMatchCount3(int input, int digit) {
        int count = 0;
        if (input == 0) {
            throw new NullPointerException("Передан 0");
        }
        if (input == digit) {
            return 1;
        }
        boolean flag = true;
        int div = 10;
        while (flag) {
            if (input / div == 0) {
                flag = false;
            }
            if ((input % div / (div / 10)) == digit) {
                count++;
            }
            div *= 10;
        }
        return count;
    }

}
