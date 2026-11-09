import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad = sc.nextInt();

        if (edad >= 0 && edad <= 11) {
            System.out.println("Niño");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Adolescente");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Adulto");
        } else if (edad >= 65) {
            System.out.println("Mayor");
        } else {
            System.out.println("Edad no valida");
        }

        sc.close();
    }
}