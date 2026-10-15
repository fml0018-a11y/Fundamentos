import java.util.Scanner;

public class tema3Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("introduce el segundo numero: ");
        int num2 = sc.nextInt();

        int suma = num1 + num2;

        System.out.println("la suma es: " + suma);

        sc.close();


    }
}
