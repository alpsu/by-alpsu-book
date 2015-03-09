package by.bsu.point;

/**
 * Created by A.Aplevich on 09.03.2015.
 */
public class Point3D extends Point2D {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Point3D () {
        this(-1, -1, -1);
    }

    @Override
    public double length() {
        return Math.hypot(super.length(), z);
    }

    @Override
    public String toString() {
        return super.toString() + " z = " + z;
    }
}
