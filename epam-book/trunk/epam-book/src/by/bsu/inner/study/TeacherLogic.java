package by.bsu.inner.study;

/**
 * Created by A.Aplevich on 17.03.2015.
 */
public class TeacherLogic {
    public void excludeProcess(int rectorId, String nameStudent) {
        AbstractTeacher teacher = TeacherCreator.createTeacher(rectorId);

        System.out.println("Студент: " + nameStudent + " отчислен:" + teacher.excludeStudent(nameStudent));
    }
}
