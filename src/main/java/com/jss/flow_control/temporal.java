package com.jss.flow_control;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Jack on 03.11.2016.
 */
public class temporal {
    public static void main(String[] args) {
        int n = 777;
        int k = 7;
        int count = 0;
        int del = 10;
        int result = 0;
        String sn = n + "";
        String sk = k + "";
        printRightOrientedPyramid(5);
        printLeftOrientedPyramid(5);
        // System.out.println(findNumberMatchCount(n, k));
        //System.out.println(findNumberMatchCount2(sn, sk));

        //printWithoutSpaces(7);
        //printWithoutSpacesAndContinue(4);
        // printWithout(5);
    }

//    public static double findAverageOfAllEl(List<Integer> list) {
//        Object is = list.toArray();
//        Arrays.asList(is).stream().mapToInt((obj) -> Integer.parseInt(obj)).average().getAsDouble();
//        return list.stream().mapToInt((obj) -> Integer.parseInt(obj)).average().getAsDouble();
//    }






    /**
     * Полностью работет
     * <p>
     * 0
     * 1 0
     * 2 1 0
     * 3 2 1 0
     * 4 3 2 1 0
     *
     * @param n
     */
    public static void printLeftOrientedPyramid(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /**
     * Полностью работет
     * <p>
             1
           2 1
         3 2 1
       4 3 2 1
     5 4 3 2 1
     *
     * @param n
     */
//    public static void printRightOrientedPyramid(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j > 0; j--) {
//                if (j == n && i == n) {
//                    System.out.print(j + " ");
//                } else {
//                    System.out.print(j > i ? "  " : j + " ");
//                }
//            }
//            System.out.println();
//        }
//    }
    public static void printRightOrientedPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                System.out.print(j > i ? "  " : j + " ");
            }
            System.out.println();
        }
    }

//    public static void printWithoutSpaces(int number) {
//        for (int i = 0; i <= number; i++) {
//            for (int j = number; j >= 0; j--) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void printWithout(int number) {
//        for (int i = 1; i <= number; i++) {
//            for (int j = i; j >0; j--) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//
//
//    public static void printWithoutSpacesAndContinue(int number) {
//        outer: for (int i = 0; i <= number; i++) {
//            for (int j = i; ; j--) {
//                if (j < 0) {
//                    System.out.println();
//                    continue outer;
//                }
//                System.out.print(j + " ");
//            }
//        }
//    }

//    /**
//     * Recursive decision
//     *
//     * @param input
//     * @param num
//     * @return
//     */
//    public int findNumberMatchCount(int input, int num) {
//        int count = 0;
//        if (input == 0) {
//            throw new NullPointerException("Передан 0");
//        }
//        if (input == num) {
//            return 1;
//        }
//        return (input % 10 == num ? ++count : count) + findNumberMatchCount(input / 10, num);
//    }
//
//    /**
//     * String usage decision
//     *
//     * @param str
//     * @param n
//     * @return
//     */
//    public int findNumberMatchCount2(String str, String n) {
//        int count = 0;
//        if (str.isEmpty()) {
//            return count;
//        }
//        return (str.substring(str.length() - 1).contains(n) ? ++count : count) + findNumberMatchCount2(str.substring(0, str.length() - 1), n);
//    }
//
//    /**
//     * Linear decision
//     *
//     * @param input
//     * @param num
//     * @return
//     */
//    public int findNumberMatchCount3(int input, int num) {
//        int count = 0;
//        if (input == 0) {
//            throw new NullPointerException("Передан 0");
//        }
//        if (input == num) {
//            return 1;
//        }
//        boolean flag = true;
//        int div = 10;
//        while (flag) {
//            if (input / div == 0) {
//                flag = false;
//            }
//            if ((input % div / (div / 10)) == num) {
//                count++;
//            }
//            div *= 10;
//        }
//        return count;
//    }


}
