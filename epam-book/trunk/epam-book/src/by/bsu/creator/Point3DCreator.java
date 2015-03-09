package by.bsu.creator;

import by.bsu.point.Point3D;

/**
 * Created by A.Aplevich on 09.03.2015.
 */
public class Point3DCreator extends Point2DCreator {
    @Override
    public Point3D createPoint() {
        System.out.println("Point3D");
        return new Point3D(3,7, 8);
    }
}
