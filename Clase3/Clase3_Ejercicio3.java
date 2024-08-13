/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 3 - Ejercicio  3 del ejercitario final de clase
*
 * Enunciado:
 * Considere el siguiente juego. Generar un número aleatorio A entre 0 y 100. 
 * Leer un número N entre 0 y 100. Si el número N es distinto de A entonces volver a solicitar otro número y repetir el 
 * proceso de comparación. Si el número coincidió terminar el Proceso e imprimir “Ganó en # intentos”, 
 * donde intentos indica el número de veces que repitió el proceso.  
 * El proceso también puede terminarse introduciendo un número negativo o mayor a 100 
 * y en ese caso imprimir “No acertaste e hiciste # intentos”.

 */
import java.util.Scanner;

public class Clase3_Ejercicio3 {
     public static void main ( String [] args ) {
	    
		int A = (int)(Math.random()*101);
		int cnt_intentos = 0;
		
		boolean exito = false;
		
		int N ;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			 System.out.print("Adivina el nro magico entre 0 y 100, intento " + (cnt_intentos+1) + ":"); 
 		     N = sc.nextInt();
		     cnt_intentos++;
			 
			 if ( N == A ) {
			     exito = true;
			     break;
			 }
			 else 
			     if ( N < 0 || N > 100 ) // elige salir
				     break;

		} while ( true );
		
		if ( exito ) 
		   System.out.printf("El nro secreto es %d y Ganó en %d intentos", N, cnt_intentos);
		else
	       System.out.printf("El nro secreto es %d y NO acertaste. Hiciste %d intentos", A, cnt_intentos);	
	    
		sc.close();
	}
}