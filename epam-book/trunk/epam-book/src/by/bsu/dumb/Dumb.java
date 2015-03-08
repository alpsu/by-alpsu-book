package by.bsu.dumb;

/**
 * Created by A.Aplevich on 08.03.2015.
 */
public class Dumb extends Object {
    {
        this.id = 6;
    }

    int id;
    Dumb() {
        System.out.println("конструктор класса Dumb");
        id = this.getId();
        System.out.println(" id=" + id);
    }
    int getId() {
        System.out.println("getId() класса Dumb ");
        return id;
    }
}
