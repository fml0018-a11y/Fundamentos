
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la contraseña: ");
        String contraseña = teclado.nextLine();

        if (contraseña.equals("java123")) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

        teclado.close();
    }
}
