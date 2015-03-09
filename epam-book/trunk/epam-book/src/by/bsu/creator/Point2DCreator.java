package by.bsu.creator;

import by.bsu.point.Point2D;

/**
 * Created by A.Aplevich on 09.03.2015.
 */
public class Point2DCreator extends Point1DCreator {
    @Override
    public Point2D createPoint() {
        System.out.println("Point2D");
        return new Point2D(2, 5);
    }
}
