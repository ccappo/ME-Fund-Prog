/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 3 -  Ejemplo 3
*
*  Dado un número enetor mayor o igual a cero imprimir la cantidad de dígitos que tiene
*  
*/

import java.util.Scanner;


public class Clase3_Ejemplo3 {
	public static void main(String [] args ) {
		
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int cnt_dig = 0;
        int n_orig = n;
        do {
            cnt_dig += 1;
            n = n/10;
        } while ( n > 0 );

        System.out.printf("La cantidad de dígitos de %d es %d",n_orig,cnt_dig); 
 
        sc.close();
	}
}