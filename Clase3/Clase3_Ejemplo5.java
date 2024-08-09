/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 3 -  Ejemplo 5
*
*  Dado un número entero mayor o igual a cero imprimir su factorial n! = 1*2*3..*n
*/

import java.util.Scanner;


public class Clase3_Ejemplo5 {
	public static void main(String [] args ) {
		
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fact = 1;
        for ( int k = 1; k <= n; k++ ) 
            fact += fact * k;   
        System.out.printf("%d! = %d\n",n, fact); 
 	}
}
