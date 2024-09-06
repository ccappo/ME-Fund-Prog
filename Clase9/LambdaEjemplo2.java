/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 9 - Ejemplo de varias funciones lambda y pasadas como parámetro.
*  
*
*/
import java.util.function.Function;

public class LambdaEjemplo2 {
	
	public static <T,R> void imprimirResultado( Function<T,R> f, T valor ) {
		System.out.println(f.apply(valor));
	}
	
	public static void main(String[] args) {
	        // Función que convierte un número entero a su cuadrado
	        Function<Integer, Integer> cuadrado = x -> x * x;
	        Function<Integer, Integer> cubo = x -> x * x *x;
	        
	        imprimirResultado(cuadrado, 10);
	        imprimirResultado(cubo, 10);
	        imprimirResultado((Function<Integer,Integer>) x->2*x, 10);
	        
	    }
}

