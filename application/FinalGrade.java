package application;

import java.util.*;
import entities.Student;

public class FinalGrade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Student student = new Student();

        System.out.printf("> Enter student name: ");
        student.name = entrada.nextLine();
        System.out.printf("> Enter the first grade: ");
        student.grade1 = entrada.nextDouble();
        System.out.printf("> Enter the second grade: ");
        student.grade2 = entrada.nextDouble();
        System.out.printf("> Enter the third grade: ");
        student.grade3 = entrada.nextDouble();

        System.out.println(student);
    }
}
