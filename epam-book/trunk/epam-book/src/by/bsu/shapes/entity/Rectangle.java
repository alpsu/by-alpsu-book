package by.bsu.shapes.entity;

/**
 * Created by A.Aplevich on 18.03.2015.
 */
public class Rectangle extends AbstractShape {
    private double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }
}
