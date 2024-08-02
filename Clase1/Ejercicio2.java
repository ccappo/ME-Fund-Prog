/*
*   Ejercicio 2.
*   Leer una variable entera e imprimir su cuadrado
*/
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String [] args) {
        int n ;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.printf("El cuadrado es %d\n", n*n);

        sc.close();
        
    }
}