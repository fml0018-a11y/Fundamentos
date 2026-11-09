
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 18 && edad <= 64) {
            System.out.println("Edad de trabajar");
        } else {
            System.out.println("Fuera de edad laboral");
        }

        sc.close();
    }
}
