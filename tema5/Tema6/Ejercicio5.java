import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad = sc.nextInt();

        if (edad < 4) {
            System.out.println("Billete gratis");
        } else if (edad <= 12) {
            System.out.println("Precio: 0.50 euros");
        } else if (edad <= 64) {
            System.out.println("Precio: 1.20 euros");
        } else if (edad >= 65) {
            System.out.println("Billete gratis");
        } else {
            System.out.println("Edad no valida");
        }

        sc.close();
    }
}
