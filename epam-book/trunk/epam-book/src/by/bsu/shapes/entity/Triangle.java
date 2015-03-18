package by.bsu.shapes.entity;

/**
 * Created by A.Aplevich on 18.03.2015.
 */
public class Triangle extends AbstractShape {
    private double b;
    private double angle;

    public Triangle(double a, double b, double angle) {
        super(a);
        this.b = b;
        this.angle = angle;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        double c = 1;
        return c;
    }

    public double getAngle() {
        return angle;
    }
}
