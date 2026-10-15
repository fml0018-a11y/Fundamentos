import java.util.Scanner;

public class tema3Ejercicio10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final double IVA = 0.21;

        System.out.print("Base imponible: ");
        double base = sc.nextDouble();

        double total = base * (1 + IVA);

        System.out.println("total factura: " + total +" euros");
        sc.close();
    }
}
