import java.util.Scanner;

public class tema3Ejemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad ");
        int edad = sc.nextInt();
        sc.nextLine();

            System.out.print("Dime tu inicial");
            char inicial = sc.nextLine().charAt(0);

        System.out.println("Hola " + nombre + " tiene " + edad +" años");
        System.out.println("Tu inicial es: " + inicial);
    }
}
