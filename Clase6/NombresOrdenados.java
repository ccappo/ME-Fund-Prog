/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 6 - Ejemplo de uso de ArrayList
*/

import java.util.*;

/**
 * 
 */
public class NombresOrdenados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
