/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 6 - Ejemplo de uso de ArrayList
*/

import java.util.*;

/**
 *  Lee una serie de nombres de la linea de comandos y los imprime de manera ordenada
 *  Hace uso de la utilidad de ordenacion de Collections
 */
public class NombresOrdenados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if ( args.length > 0 ) {
			
			ArrayList<String> lista = new ArrayList<>();
			
            for ( String s : args )
            	lista.add(s.toLowerCase());
            
            
            Collections.sort(lista);
            
            System.out.println(lista);
		}
		else
			System.out.println("Sin argumentos");
	}

}
