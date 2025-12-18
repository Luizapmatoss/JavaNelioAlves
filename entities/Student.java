package entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double FinalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        if (FinalGrade() < 60.0) {
            return 60.0 - FinalGrade();
        } else {
            return 0.0;
        }
    }

    public String toString() {
        if (FinalGrade() >= 60.0) {
            return "\nFINAL GRADE = "
                + String.format("%.2f", FinalGrade())
                + "\n>> PASS";
        }
        return "\nFINAL GRADE = "
            + String.format("%.2f", FinalGrade())
            + "\n>> FAILED"
            + "\n>> MISSING "
            + String.format("%.2f", missingPoints())
            + " POINTS";
    }
    
}
