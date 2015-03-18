package by.bsu.shapes.action;

import by.bsu.shapes.entity.AbstractShape;

/**
 * Created by A.Aplevich on 18.03.2015.
 */
public interface IShapeAction extends ILineGroupAction {
    double computeSquare(AbstractShape shape);
}
