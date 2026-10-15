import java.util.Scanner;

public class tema3Ejercicio11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final double pi = 3.14149;

        System.out.println("Radio: ");
        double radio = sc.nextDouble();
        double area = pi*radio*radio;

        System.out.println("Area: "+ area );
        sc.close();

    }
}
