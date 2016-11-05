package com.jss.flow_control.task2;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Flow_control. Task2
 *
 * @author Evgeniy Kobec
 *         Created by Jack on 03.11.2016.
 */
public class InputNumbersOperations {
    final static String CHECK_PATTERN = "[k0-9]";

    /**
     * inputData
     *
     * @return
     */
    public List<Integer> inputData() {

        List<Integer> input = new ArrayList<>();
        System.out.println("Введите числа и нажмите k: ");
        String in = "";

        while (!in.equalsIgnoreCase("k")) {
            Scanner sc = new Scanner(System.in);
            in = sc.nextLine();

            if (!checkInput(in)) {
                System.out.println("Incorrect number. Try again.");
            } else if (!in.equalsIgnoreCase("k")) {
                input.add(Integer.parseInt(in));
            }
        }
        return input;
    }

    /**
     * validation
     *
     * @param str
     * @return
     */
    private boolean checkInput(String str) {
        Pattern p = Pattern.compile(CHECK_PATTERN);
        return p.matcher(str).matches();
    }

    /**
     * findMaxEl java8
     *
     * @param list
     * @return
     */
    public int findMaxEl(List<Integer> list) {
        return list.stream().max((el1, el2) -> el1.compareTo(el2)).get();
    }

    /**
     * findMinEl java 8
     *
     * @param list
     * @return
     */
    public int findMinEl(List<Integer> list) {
        return list.stream().min((el1, el2) -> el1.compareTo(el2)).get();
    }

    /**
     * findMaxElLoop loop tactic
     *
     * @param list
     * @return
     */
    public int findMaxElLoop(List<Integer> list) {
        int max = 0;
        if (list.size() == 1)
            return list.get(0);
        for (Integer el : list) {
            if (el > max) {
                max = el;
            }
        }
        return max;
    }

    /**
     * findMinElLoop loop tactic
     *
     * @param list
     * @return
     */
    public int findMinElLoop(List<Integer> list) {
        int min;
        if (list.size() == 1) {
            return list.get(0);
        }
        min = list.get(0);
        for (Integer el : list) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

    /**
     * findAverageOfAllElLoop
     *
     * @param list
     * @return
     */
    public double findAverageOfAllElLoop(List<Integer> list) {
        int sum = 0;
        if (list.size() == 1) {
            return list.get(0);
        } else {
//            for (Integer el : list) {
//                sum += el;
//            }
            sum = list.stream().reduce((el1, el2) -> el1 + el2).get();
        }
        return sum / list.size();
    }

    /**
     * findAverageOfAllEl java 8
     *
     * @param list
     * @return
     */
    public double findAverageOfAllEl(List<Integer> list) {

        /**
         * Так пишем когда не знаем, что приходит на вход, если Integer, то el -> el ничего не делаем с элементом
         */
        return list.stream().collect(Collectors.averagingInt(el -> el));
        /**
         *  Если на вход придет например лист String
         *  return list.stream().collect(Collectors.averagingInt(el -> Integer.parseInt(el)));
         */

        /**
         * Это вариант через
         * return list.stream().collect(Collectors.averagingInt((p) -> p - 0)); //huck of the Exception in the stream
         */
        //return list.stream().collect(Collectors.averagingInt(Integer::intValue)); //huck of the Exception in the stream
        //return list.stream().mapToInt(list::get).average().getAsDouble(); //Exception IndexOutOfBoundsException
        //return list.stream().collect(Collectors.averagingInt(list::get)).doubleValue(); //Exception IndexOutOfBoundsException
    }
}