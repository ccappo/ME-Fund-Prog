/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 4 -  UsoFactorial
*
*  Definir la funcion  factorial e imprimir el factorial de un parametro entero pasado por linea
*  de comandos.
*  
*/
public class Clase4_UsoFactorial {

	public static int factorial ( int n ) {
	      int fact = 1;
	      for ( int k = 1; k <= n ; k++ )
	          fact *= k;
	      return fact;
	}
	
	public static void main (String [] args ){
	      int n = Integer.parseInt(args[0]);
	      System.out.printf("El factorial de %d es %d\n",n,factorial(n)); 
	}


}