/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 9 - Ejemplo de una función lambda 
*
*/

import java.util.function.Function;

public class LambdaEjemplo1 {
	public static void main(String[] args) {
	        // Función que convierte un número entero a su cuadrado
	        Function<Integer, Integer> cuadrado = x -> x * x;
	        System.out.println(cuadrado.apply(5)); // Imprime 25
	    }
}

