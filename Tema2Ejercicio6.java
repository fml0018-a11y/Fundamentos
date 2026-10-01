public class Tema2Ejercicio6 {
    public static void main(String[] args) {
        double baseImponible = 150.0;
        double iva = baseImponible * 0.21;
        double total = baseImponible + iva;

        System.out.println("baseImponible" + baseImponible);
        System.out.println("iva (21%):" + iva);
        System.out.println("Total:" + total);
    }   
}
