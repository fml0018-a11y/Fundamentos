import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero (1, 2 o 3):");
        int numero = sc.nextInt();
        
        switch (numero) {
            case 1:
                System.out.println("Para");
                break;
            
            case 2:
                System.out.println("Precaucion");
                break;

            case 3:
                System.out.println("Pasa");
                break;

                default:
                    System.out.println("Color no valido");
                    break;
                    
                 }   
                    
                    sc.close();


                
                    
            }
        }
