/* 
	*  Maestria en Electrónica - Énfasis TIC
	*  Fundamentos de Programación 2024
	*
	*  Clase 7 - Ejemplo de captura de Excepcion
	*
	*  
	*/

import java.util.*;
/**
 * 
 */
public class ScannerExcepcion {
	public static int leer_int ( )   
	{    
		Scanner sc = new Scanner (System.in);
        
		int n = 0;       
        while ( true ) {
        	  try {
        		  n = sc.nextInt();
        		  break ;                 
        	  }
              catch ( InputMismatchException e ) {
                  System.out.print("Valor invalido!, intente de nuevo");
                  sc.next(); //consumimos la cadena invalida
              }
        }
        sc.close();
        return n;
   }

   public static void main ( String [] args ) {
	   int n = leer_int();
	   System.out.println("El valor leido fue " + n);
   }
}
