package encapsulation;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentMain {
    private static final Logger LOGGER = Logger.getLogger(StudentMain.class.getName());
    public static void main(String[] args) {
        Student student = new Student("Tchiroma");
        student.setGrade(85);
        LOGGER.log(Level.INFO, "Current grade: {0}", student.getGrade());

        student.setGrade(110);
       LOGGER.log(Level.INFO, "Final grade: {0}", student.getGrade());
    }

}
