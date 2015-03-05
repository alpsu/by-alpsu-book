package by.bsu.logic;

/**
 * Created by A.Aplevich on 05.03.2015.
 */
public class Department {
    {
        System.out.println("logic (1) id=" + this.id);
    }

    static {
        System.out.println("static logic");
    }

    private int id = 7;

    public Department(int id) {
        this.id = id;
        System.out.println("конструктор id=" + id);
    }

    public int getId() {
        return id;
    }

    {
        System.out.println("logic (2) id=" + id);
    }
}
