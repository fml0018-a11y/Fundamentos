package tema4.java;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print(" Escribe la edad ");
        int edad = sc.nextInt();
        int edad = 19;

        boolean aprobadoTeorico = true;

        boolean puedeSacarCarnet = (edad<=18) && aprobadoTeorico;
        System.out.println(" Se puede sacar el carnet " + puedeSacarCarnet);

    }
}
