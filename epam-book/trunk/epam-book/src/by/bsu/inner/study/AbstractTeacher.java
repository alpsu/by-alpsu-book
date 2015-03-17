package by.bsu.inner.study;

/**
 * Created by A.Aplevich on 17.03.2015.
 */
public abstract class AbstractTeacher {
    private int id;

    public AbstractTeacher(int id) {
        this.id = id;
    }

    public abstract boolean excludeStudent(String name);
}
