package by.bsu.inner.study;

/**
 * Created by A.Aplevich on 17.03.2015.
 */
public class Runner {
    public static void main(String[] args) {
        TeacherLogic tl = new TeacherLogic();
        tl.excludeProcess(777, "Олейников");
        tl.excludeProcess(6, "Олейников");
    }
}
