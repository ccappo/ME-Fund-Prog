/*
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 2 - Ejercicio Ejemplo 2.
*  Leer una variable entera e imprimir su cuadrado
*/
import java.util.Scanner;

public class Clase2_Ejercicio2 {
    public static void main(String [] args) {
        int n ;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.printf("El cuadrado es %d\n", n*n);

        sc.close();
        
    }
}