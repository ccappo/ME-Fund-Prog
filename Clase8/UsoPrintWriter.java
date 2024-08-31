/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 8 - Ejemplo de uso de PrintWriter
*
*  
*/
import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 
 */
public class UsoPrintWriter {

	  public static boolean esPrimo( int n ) {
		  boolean esprimo = true;
		  for ( int f = 2; f <= n/2; f++) 
			  if ( n % f == 0) { 
				  esprimo = false;
				  break;
			  }
		  return esprimo;
	  }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		File archivo = new File("primos.txt");
		
		if ( archivo.exists() ) {
			//Primera opcion: terminar el programa si existe
			//System.out.println("Archivo ya existe!!");
			//System.exit(1); // termino el programa con error 1
			
			//Segunda opcion: borrar si existe, via File.
			archivo.delete();
		}
		
		PrintWriter salida = new PrintWriter(archivo);
		
		salida.printf("Lista de Primos menores a 100\n");
		salida.println("Creado el " + LocalDate.now() + " " + LocalTime.now());
		int cnt_primos =0;
		for ( int k = 2; k < 100; k++) 
			if ( esPrimo(k)) {
			   salida.printf("%d\n", k);
			   cnt_primos++;
			}
		
		salida.printf("Existen %d primos",cnt_primos);
		
		salida.close(); // puede evitarse si se coloca dentro de un try {}
	
	}

}
