/* 
	*  Maestria en Electrónica - Énfasis TIC
	*  Fundamentos de Programación 2024
	*
	*  Clase 7 - Ejemplo de captura de varias excepciones
	*
	*  
	*/

/**
 * 
 */
public class MultipleCatch {
   public static void main(String args[]) {
      try {
         int den = Integer.parseInt(args[0]);
         System.out.println(3/den);
      } catch (ArithmeticException exc) {
         System.out.println("Divisor fue 0");
      } catch (ArrayIndexOutOfBoundsException exc2) {
         System.out.println("Faltan argumentos");
      }
      System.out.println("Luego de la excepción");
   }
}
