package by.bsu.creator;

import by.bsu.point.Point2D;

/**
 * Created by A.Aplevich on 09.03.2015.
 */
public class BuidRunner {
    public static void main(String[] args) {
        Point2DCreator br = new Point3DCreator();
        Point2D p = br.createPoint();
        //System.out.println(br.createPoint().x);
        //System.out.println(br.createPoint().y);
    }
}
