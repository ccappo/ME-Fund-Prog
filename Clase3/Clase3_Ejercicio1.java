/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 2 - Ejercicio Ejemplo 1
*
*  Resolver la ecuación cuadrática teniendo en cuenta solo el caso
*  de b^2 - 4ac > 0. No validamos esta situación 
*  
*/
import java.util.Scanner;

public class Clase3_Ejercicio1 {
    public static void main (String [] args ) {

        Scanner sc = new Scanner(System.in);

        /* coeficientes */
        double a, b, c;
        /* valores de las raices */
        double x1, x2;

        System.out.print("Solución para la ecuación cuadrática");
        System.out.print("------------------------------------");
        System.out.print("Ingrese el valor de a :");
        a = sc.nextDouble();

        System.out.print("Ingrese el valor de b :");
        b = sc.nextDouble();

        System.out.print("Ingrese el valor de c :");
        c = sc.nextDouble();

        x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);

        System.out.printf("Las soluciones son x1 =%f y x2=%f \n",x1,x2);

        sc.close();

    }
}