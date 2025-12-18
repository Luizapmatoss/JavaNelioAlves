import java.util.*;
import entities.Product;

public class Program {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.printf("> Enter product data: \n");

        System.out.printf("> Name: ");
        String name = entrada.nextLine();

        System.out.printf("> Price: ");
        double price = entrada.nextDouble();

        Product product = new Product(name, price);

        System.out.println(">> Product data: " + product);

        System.out.printf("\n> Enter the number of products to be added in stock: ");
        int quantity = entrada.nextInt();
        product.addProducts(quantity);

        System.out.println(">> Updated data: " + product);

        System.out.printf("\n> Enter the number of products to be removed from stock: ");
        quantity = entrada.nextInt();
        product.removeProducts(quantity);
        
        System.out.println(">> Updated data: " + product);
    }
}
