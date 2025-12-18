package application;

import java.util.*;
import entities.Rectangle;

public class Result {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Rectangle rectangle = new Rectangle();

        System.out.printf("> Enter rectangle width: ");
        double width = entrada.nextDouble();
        System.out.printf("> Enter rectangle height: ");
        double height = entrada.nextDouble();

        rectangle.width = width;
        rectangle.height = height;
        System.out.println(">> Resultado\n" + rectangle);
    }
}
