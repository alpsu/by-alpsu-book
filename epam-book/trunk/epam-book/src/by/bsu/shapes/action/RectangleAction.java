package by.bsu.shapes.action;

import by.bsu.shapes.entity.AbstractShape;
import by.bsu.shapes.entity.Rectangle;

/**
 * Created by A.Aplevich on 18.03.2015.
 */
public class RectangleAction implements IShapeAction {
    @Override
    public double computeSquare(AbstractShape shape) {
        double square = 0;
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            square = rectangle.getA() * rectangle.getB();
        } else {
            throw new IllegalArgumentException("Incompatible shape: " + shape.getClass());
        }
        return square;
    }

    @Override
    public double computePerimeter(AbstractShape shape) {
        double perimeter = 0;
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            perimeter = 2 * (rectangle.getB() + rectangle.getA());
        } else {
            throw new IllegalArgumentException("Incompatible shape: " + shape.getClass());
        }
        return perimeter;
    }
}
