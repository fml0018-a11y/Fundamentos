
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");
        }

        teclado.close();
    }
}
