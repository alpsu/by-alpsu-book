package by.bsu.console;

import java.util.Scanner;

/**
 * Created by A.Aplevich on 02.03.2015.
 */
public class RunScanner {
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя и нажмите <Enter>");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Привет, " + name);
        scan.close();
    }
}
