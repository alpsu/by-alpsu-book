package by.bsu.console;

import java.io.IOException;

/**
 * Created by A.Aplevich on 02.03.2015.
 */
public class ReadCharRunner {
    public static void main(String[] args) {
        int x;
        try {
            x = System.in.read();
            char c = (char) x;
            System.out.println("Код символа: " + c + " = " + x);
        } catch (IOException e) {
            System.err.println("Ошибка ввода " + e);
        }
    }
}
