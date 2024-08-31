/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 8 - Ejemplo de uso de Scanner
*
*  
*  
*/
 
import java.io.*;
import java.util.Scanner;
/**
 * 
 */
public class LecturaDatos {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
        File archivo = new File("primos.txt");
		 
		if ( ! archivo.exists() ) {
			System.out.println("Archivo NO existe!!");
			System.exit(1); // termino el programa con error 1
		}
		
		Scanner entrada = new Scanner(archivo);
		
		int cnt_lineas = 0;
		while ( entrada.hasNext()) {
			String linea = entrada.nextLine();
			System.out.println(linea);
			cnt_lineas++;
		}
		System.out.printf("Tiene %d lineas", cnt_lineas);
		entrada.close();
		
	}

}
