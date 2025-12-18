import java.util.*;
import util.Calculator;

public class MembrosEstaticos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        // Calculator calc = new Calculator(); pelo fato de os métodos do util não serem estáticos, é necessário crir um objeto da classe Calculator para acessá-las

        System.out.printf("> Enter radius: ");
        double radius = entrada.nextDouble();

        double c = Calculator.circunference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("\n>> Circunference: %.2f%n", c);
        System.out.printf("\n>> Volume: %.2f%n", v);
        System.out.printf("\n>> PI value: %.2f%n", Calculator.PI);
    }
}