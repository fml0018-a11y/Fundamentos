import java.util.Scanner;

public class Tema3Ejercicio15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println(nombre + " tiene " + edad + " años");
        sc.close();
    }
}
