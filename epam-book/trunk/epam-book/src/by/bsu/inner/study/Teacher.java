package by.bsu.inner.study;

/**
 * Created by A.Aplevich on 17.03.2015.
 */
public class Teacher extends AbstractTeacher {
    public Teacher(int id) {
        super(id);
    }

    @Override
    public boolean excludeStudent(String name) {
        return false;
    }
}
