/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 3 -  Ejemplo 2
*
*  leer una serie de números positivos e imprimir la cantidad leida y el promedio
*  la serie termina cuando el numero es negativo o cero.
*  
*/

import java.util.Scanner;


public class Clase3_Ejemplo2 {
	public static void main(String [] args ) {
		int n ;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int cnt = 0;
		int suma = 0;
		while ( n > 0 ){
			cnt += 1;
			suma += n;
			n= sc.nextInt();
		}
		sc.close();
		System.out.printf("La cantidad de leídos fue %d y el promedio fue %.3f",cnt,suma/(cnt*1.0)); 
	}
}