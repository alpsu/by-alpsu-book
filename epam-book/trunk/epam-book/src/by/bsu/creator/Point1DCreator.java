package by.bsu.creator;

import by.bsu.point.Point1D;

/**
 * Created by A.Aplevich on 09.03.2015.
 */
public class Point1DCreator {
    public Point1D createPoint() {
        System.out.println("Point1D");
        return new Point1D(1);
    }
}
