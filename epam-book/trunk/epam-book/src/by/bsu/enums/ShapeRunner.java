package by.bsu.enums;

/**
 * Created by A.Aplevich on 06.03.2015.
 */
public class ShapeRunner {
    public static void main(String[] args) {
        double x = 2, y = 3;
        Shape sh;
        sh = Shape.RECTANGLE;
        System.out.printf("%10s = %5.2f%n", sh, sh.defineSquare(x, y));
        sh = Shape.TRIANGLE;
        System.out.printf("%10s = %5.2f%n", sh, sh.defineSquare(x, y));
        sh = Shape.CIRCLE;
        System.out.printf("%10s = %5.2f%n", sh, sh.defineSquare(x, y));
    }
}
