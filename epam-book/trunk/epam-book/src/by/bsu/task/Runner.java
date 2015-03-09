package by.bsu.task;

import by.bsu.task.action.Multiplicator;
import by.bsu.task.creator.MatrixCreator;
import by.bsu.task.entity.Matrix;
import by.bsu.task.exceptions.MatrixException;

/**
 * Created by A.Aplevich on 06.03.2015.
 */
public class Runner {
    public static void main(String[] args) {
        try {
            Matrix p = new Matrix(2, 3);
            MatrixCreator.fillRandomized(p, 2, 8);
            System.out.println("Matrix first is: " + p);
            Matrix q = new Matrix(3, 4);
            MatrixCreator.fillRandomized(q, 2, 7);
            System.out.println("Matrix second is: " + q);
            Multiplicator mul = new Multiplicator();
            System.out.println("Matricies product is " + mul.multiply(p, q));
        } catch (MatrixException e) {
            System.err.println("Error of creating matrix " + e);
        }
    }
}

