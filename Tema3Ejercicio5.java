import java.util.Scanner;

public class Tema3Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la base de tu rectangulo");
        int base = sc.nextInt();

        System.out.println(" dime la altura de tu triangulo");
        int altura = sc.nextInt();

        int area = base * altura;
        System.out.println("El area es: " + (double)area/2);
        sc.close();

    }
}
