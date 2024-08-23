/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 6 - Ejemplo de un método genérico sencillo
*/

import java.util.*;
import java.time.*;
/**
 *  Definir un método genérico que recibe un parametro de cualquier tipo y retorne el nombre de su clase.
 */
public class EjemploMetodoGenerico {

	public static <T> String nombreClase ( T a) {
		return a.getClass().getName();
	}
	
	public static void main(String[] args) {
        System.out.println(nombreClase("hola"));
        System.out.println(nombreClase(1));
        System.out.println(nombreClase(2.0));
        System.out.println(nombreClase(1.3f));
        System.out.println(nombreClase('C'));
        System.out.println(nombreClase(new ArrayList<String>() ));
        System.out.println(nombreClase(LocalDate.now()));
	}

}
