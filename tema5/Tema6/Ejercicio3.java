import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu sueldo anual:");
        double sueldo = sc.nextDouble();

        if (sueldo <= 12000) {
            System.out.println("Retencion del 0 %");
        } else if (sueldo <= 25000) {
            System.out.println("Retencion del 10 %");
        } else if (sueldo <= 40000) {
            System.out.println("Retencion del 20 %");
        } else {
            System.out.println("Retencion del 30 %");
        }

        sc.close();
    }
}
