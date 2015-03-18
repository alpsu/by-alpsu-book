package by.bsu.enums;

/**
 * Created by A.Aplevich on 18.03.2015.
 */
public class EnumRunner {
    public static void main(String[] args) {
        int i = 4;
        for (ShapeTwo f : ShapeTwo.values()) {
            f.setShape(3, i--);
            System.out.println(f + " площадь= " + f.computeSquare());
        }
    }
}
