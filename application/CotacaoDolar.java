import java.util.*;
import util.CurrencyConverter;

public class CotacaoDolar {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.printf("> What is the dollar price? ");
        double dollarPrice = entrada.nextDouble();

        System.out.printf("> How many dollars will be bought? ");
        double dollars = entrada.nextDouble();

        double reais = CurrencyConverter.dollarToReal(dollarPrice, dollars);

        System.out.println(">> Amount to be paid in reais = " + String.format("%.2f", reais));
    }
}
