package com.jss.lessons.lesson2.matrix;

import com.jss.exceptions.IncorrectMatrixException;

import java.util.Random;

/**
 * Created by Jack on 01.11.2016.
 */
public class MatrixFactory {


    public Matrix createRandomized(int n, int m) throws IncorrectMatrixException {

        Random rand = new Random();
        Matrix matrix = new Matrix(n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix.setEl(i, j, rand.nextInt(77));
            }

        }
        return matrix;
    }

}
