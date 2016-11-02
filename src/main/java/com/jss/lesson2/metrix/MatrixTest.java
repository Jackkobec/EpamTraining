package com.jss.lesson2.metrix;


import com.jss.exceptions.IncorrectMatrixException;

import static com.jss.lesson2.metrix.Summator.sum;


/**
 * Created by Jack on 01.11.2016.
 */
public class MatrixTest {
    public static void main(String[] args) throws IncorrectMatrixException {
        System.out.println(Matrix.toString(new MatrixFactory().createRandomized(2, 3).getA()));
        System.out.println(new MatrixFactory().createRandomized(2, 3).getA().length);
        System.out.println(new MatrixFactory().createRandomized(2, 3).getA()[0].length);

        System.out.println("======================");
        Matrix mx1 = new MatrixFactory().createRandomized(2, 3);
        Matrix mx2 = new MatrixFactory().createRandomized(2, 3);

        System.out.println(Matrix.toString(mx1.getA()));
        System.out.println(Matrix.toString(mx2.getA()));

        System.out.println("Sum of the m1 and m2: ");
        System.out.println(Matrix.toString(sum(mx1, mx2).getA()));


    }
}
