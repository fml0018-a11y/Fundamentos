import java.util.Scanner;

public class Tema3Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("pon aqui el precio del producto: ");
        double precio1 = sc.nextDouble();

        final double descuento = 0.1;
        double finalprecio = precio1 *(1 - descuento);
        System.out.println("El precio final es: " + finalprecio);
        sc.close();

    }
}
