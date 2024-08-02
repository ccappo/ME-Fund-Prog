/*
*   Ejercicio 2.
*   Leer una variable entera e imprimir su cuadrado
*/

public class Ejercicio2 {
    public static void main(String [] args) {
        int n ;

        Scanner sc = new Scanner(System.in);
        n = sc.readInt();

        System.out.printf("El cuadrado es %f\n", n*n);
    }
}