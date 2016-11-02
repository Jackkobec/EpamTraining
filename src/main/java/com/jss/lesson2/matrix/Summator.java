package com.jss.lesson2.matrix;


import com.jss.exceptions.IncorrectMatrixException;

/**
 * Created by Jack on 01.11.2016.
 */
public class Summator {

    public static Matrix sum(Matrix first, Matrix second) throws IncorrectMatrixException {
        //check size
        int n = first.getVerticalSize();
        int m = first.getHorizontalSize();

        if (n != second.getVerticalSize()
                || m != second.getHorizontalSize()) {
            throw new IncorrectMatrixException("Переданы матрицы разной длины!");
        }

        Matrix sumMatrix = new Matrix(n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumMatrix.setEl(i, j, first.getEl(i, j) + second.getEl(i, j));
            }
        }
        return sumMatrix;
    }
}
