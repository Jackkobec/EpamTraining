package com.jss.lesson2.metrix;

import com.jss.exceptions.IncorrectMatrixException;

import java.util.Arrays;

/**
 * Created by Jack on 01.11.2016.
 */
public class Matrix {

    private int[][] a;

    public Matrix(int n, int m) throws IncorrectMatrixException {
        if (n == 0 || m == 0) {
            throw new IncorrectMatrixException("Ошибка при создании матрицы. Нулевое количество строк или столбцов.");
        }
        this.a = new int[n][m];
    }

    public int[][] getA() {
        return a;
    }

    public int getHorizontalSize() {
        return a[0].length;
    }

    public int getVerticalSize() {
        return a.length;
    }

    public int getEl(int n, int m) {
        return a[n][m];
    }

    public int setEl(int n, int m, int el) {
        return a[n][m] = el;
    }


    public static String toString(int[][] matrix) {
        StringBuilder sb = new StringBuilder();

        for (int i[] : matrix) {      //move through all arrays
            Arrays.stream(i).forEach(el -> sb.append(el + "; "));
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}

