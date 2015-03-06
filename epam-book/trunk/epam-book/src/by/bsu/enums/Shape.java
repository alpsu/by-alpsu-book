package by.bsu.enums;

/**
 * Created by A.Aplevich on 06.03.2015.
 */
public enum Shape {
    RECTANGLE, TRIANGLE, CIRCLE;

    public double defineSquare(double... x) {
        switch (this) {
            case RECTANGLE:
                return x[0] * x[1];
            case TRIANGLE:
                return x[0] * x[1] / 2;
            case CIRCLE:
                return Math.pow(x[0], 2) * Math.PI;
            default:
                throw new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
        }
    }
}
