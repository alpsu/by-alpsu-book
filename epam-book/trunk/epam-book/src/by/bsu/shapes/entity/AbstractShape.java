package by.bsu.shapes.entity;

/**
 * Created by A.Aplevich on 18.03.2015.
 */
public abstract class AbstractShape {
    private double a;

    public AbstractShape(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }
}
