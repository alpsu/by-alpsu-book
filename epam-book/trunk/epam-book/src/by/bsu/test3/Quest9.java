package by.bsu.test3;

/**
 * Created by A.Aplevich on 08.03.2015.
 */
enum Numbers {ONE, TWO, THREE, FOUR, FIVE}
public class Quest9 {
    public static void main(String[] args) {
        Numbers n1 = Numbers.ONE;
        Numbers n2 = Numbers.ONE;
        if (n1 == n2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(Numbers.FIVE.ordinal());
    }
}
