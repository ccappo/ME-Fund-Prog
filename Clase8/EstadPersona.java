/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 8 - Inicio del ejercicio 2
*
*  
*  
*/

import java.io.*;
import java.util.Scanner;

/**
 * 
 */
public class EstadPersona {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		File archivo = new File("datospersona.txt");
		
		if ( !archivo.exists()) {
			System.out.println("Archivo no existe");
		    System.exit(1);
 	    }
		
		Scanner entrada = new Scanner(archivo);
		
		while ( entrada.hasNext() ) {
			String linea = entrada.nextLine();
			String [] campos = linea.split(",");
			String ced = campos[0];
			String ape = campos[1];
			String nom = campos[2];
			String ddmm = campos[3];
			String sexo = campos[4];
			System.out.printf("%s %s %s %s %s\n",ced,ape,nom,ddmm,sexo);
		}    
        entrada.close();
	}

}
