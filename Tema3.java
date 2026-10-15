import java.util.Scanner;

public class Tema3 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in); 
        System.out.println("Dime tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
        sc.close();

    }
}
