import java.util.Scanner;

public class tema3Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu numero: ");
        int numero = sc.nextInt();

        System.out.print("Tu numero es: " + numero);
        sc.close();
    }
}
