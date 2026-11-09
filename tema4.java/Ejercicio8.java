

public class Ejercicio8 {
    public static void main(String[] args) {
        int edad = 20;
        boolean tieneDescuento = edad < 12 || edad > 65;
        System.out.println(tieneDescuento);
        System.out.println(!tieneDescuento);
    }
}
