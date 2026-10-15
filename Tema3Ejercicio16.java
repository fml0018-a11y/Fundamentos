import java.util.Scanner;

public class Tema3Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.println("En 5 años tendras: " + (edad + 5));
        sc.close();
        

    }
}
