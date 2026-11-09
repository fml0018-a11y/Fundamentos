package tema4.java;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer numero");
        String text1 = sc.nextLine();
        System.out.print("Ahora el segundo numero");
        String text2 = sc.nextLine();

        int num1 = Integer.parseInt(text1);
        int num2 = Integer.parseInt(text2);

        int suma = num1 + num2;
        System.out.println("La suma es " + suma);
        System.out.println("Sin convertir: " + text1 +" "+ text2);
        
    }
}
