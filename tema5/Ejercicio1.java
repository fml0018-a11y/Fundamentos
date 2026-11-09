
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = teclado.nextInt();

        if (numero >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }

        teclado.close();
    }
}
