package by.bsu.transformation;

/**
 * Created by alpsu on 4.3.15.
 */
public class StringToInt {
    public static void main(String[] args) {
        String arg = "71";
        try {
            int value1 = Integer.parseInt(arg);
            int value2 = Integer.valueOf(arg);
            int value3 = Integer.decode(arg);
            int value4 = new Integer(arg);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат числа " + e);
        }
    }
}
