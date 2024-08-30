/* 
	*  Maestria en Electrónica - Énfasis TIC
	*  Fundamentos de Programación 2024
	*
	*  Clase 7 - Ejemplo de uso de sort ArrayList
	*
	*  
	*/



import java.util.*;

/**
 * Recibo una serie de palabras por la linea de comandos 
 * e imprimo ordenado por la cantidad de caracters que tiene, de menor
 * a mayor.
 * 
 * Utiliza el método sort de ArrayList con un comparador especializado
 * 
 * 
 */
public class OrdenacionPorLongitud {

	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		if ( args.length > 0 ) { 
			
           al.addAll(Arrays.asList(args)); //agrega de una vez todos los elementos
           
           // imprimir el original.
           System.out.println(al);
           
           //Creamos una clase especifica para ordenar
           //al.sort(new ComparadorLongitud());
           
           // Creamos una clase anónima al vuelo 
           al.sort(new Comparator<String>() {
        	   public int compare (String s1 , String s2) {
        		   if ( s1.length() > s2.length())
        				return 1;
        			else if  (s1.length() < s2.length() )
        				return -1;
        			else
        				return 0;
        	   }
             }
           );
           
           System.out.println(al);
           
		}
		else
			System.out.println("No se tiene parametros");
	}

	
}

/**
 * Una clase que implementa un comparador específico
 * 
 */
class ComparadorLongitud implements Comparator<String> {
	public int compare(String s1, String s2) {
		if ( s1.length() > s2.length())
			return 1;
		else if  (s1.length() < s2.length() )
			return -1;
		else
			return 0;
	}
}
