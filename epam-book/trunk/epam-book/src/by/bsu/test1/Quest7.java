package by.bsu.test1;

/**
 * Created by A.Aplevich on 02.03.2015.
 */
class Book {
    private String book;

    public void setBook(String b) {
        book = b;
    }
}

public class Quest7 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBook("Java 7");
        Book book2 = new Book();
        book2.setBook("Java 7");

        if (book1.equals(book2)) {
            System.out.println("True");
        } else {

            System.out.println("False");
        }
    }
}
