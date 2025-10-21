package encapsulation;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Student {

    private static final Logger LOGGER = Logger.getLogger(Student.class.getName());

    private final String name;
    private int grade;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (isValidGrade(grade)) {
            updateGrade(grade);
        } else {
            logInvalidGrade(grade);
        }
    }

    private boolean isValidGrade(int grade) {
        return grade >= 0 && grade <= 100;
    }

    private void updateGrade(int grade) {
        this.grade = grade;
        LOGGER.log(Level.INFO, "Grade successfully set to {0}", grade);
    }

    private void logInvalidGrade(int attemptedGrade) {
        LOGGER.log(Level.WARNING,
                "Error: Grade must be between 0 and 100 (attempted: {0})",
                attemptedGrade);
    }
}
