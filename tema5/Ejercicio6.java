
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la nota: ");
        double nota = teclado.nextDouble();

        if (nota >= 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        teclado.close();
    }
}
