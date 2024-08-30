/* 
	*  Maestria en Electrónica - Énfasis TIC
	*  Fundamentos de Programación 2024
	*
	*  Clase 7 - Ejemplo de caso de generacion de Excepción
	*
	*  
	*/

/**
 *  Control de Division por cero 
 */
public class DivisionPorCeroConExcepcion {
		/**
		 * @param args
		 */
		public static void main(String[] args) {
		  try {
			System.out.println(3/0);
			System.out.println("Luego de la division.");
		  } catch (ArithmeticException exc) {
			System.out.println("División por cero");  
		  }
		  System.out.println("Luego de la excepción"); 
		}

	
}
