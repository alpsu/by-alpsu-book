package by.bsu.args;

/**
 * Created by A.Aplevich on 02.03.2015.
 */
public class PrintArguments {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.printf("Аргумент-> %s%n", str);
        }
    }
}
