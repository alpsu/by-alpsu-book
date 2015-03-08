package by.bsu.dumb;

/**
 * Created by A.Aplevich on 08.03.2015.
 */
public class Dumber extends Dumb{
    int id = 9;
    Dumber() {
        System.out.println("конструктор класс Dumber ");
        id = this.getId();
        System.out.println(" id=" + id);
    }

    @Override
    int getId() {
        System.out.println("getId() класса Dumber");
        return id;
    }
}
