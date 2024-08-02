/*
*   Ejercicio 3.
*   Leer la base y altura de un triángulo e imprimir su superficie
*/
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String [] args) {
        int base, altura ;
        double superficie; 

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de la base:");
        base = sc.nextInt();
        System.out.print("Ingrese el valor de la altura:");
        altura = sc.nextInt();
        
        superficie = (base * altura) / 2.0;

        System.out.printf("La superficie es %.3f\n", superficie);

        sc.close();
        
    }
}