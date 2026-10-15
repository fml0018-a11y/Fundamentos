import java.util.Scanner;

public class Tema3Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double Cambio = 1.10;
        System.out.print("Euros: ");
        double euros = sc.nextDouble();
        double dolares = euros * Cambio;
        System.out.println("Dolares: " + dolares);
        sc.close();

    }
}
