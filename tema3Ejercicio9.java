import java.util.Scanner;
public class tema3Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad en pesetas: ");
        double pesetas = sc.nextDouble();

        final double Cambio = 186.386;

        double euros = pesetas / Cambio;
        System.out.println("Son "+ euros + " euros");
        sc.close();
    }
}
