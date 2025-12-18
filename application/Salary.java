package application;

import java.util.*;
import entities.Employee;

public class Salary {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Employee employee = new Employee();

        System.out.printf("> Name: ");
        employee.nome = entrada.nextLine();
        System.out.printf("> Gross Salary: ");
        employee.salarioB = entrada.nextDouble();
        System.out.printf("> Tax: ");
        employee.imposto = entrada.nextDouble();

        System.out.println("\n>> Employee: " + employee);

        System.out.printf("> With percentage to increase salary? ");
        double porcentagem = entrada.nextDouble();
        employee.aumentarSalario(porcentagem);
        System.out.println(">> Update data: " + employee);
    }
}
