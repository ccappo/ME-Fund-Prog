/*
 *  Maestria en Electrónica - Énfasis TIC
 *  Fundamentos de Programación 2024
 * Ejemplo de uso de parámetros
 * Imprimir el cuadrado de un parámetro entero que se lee desde la linea de comandos
 */
public class Clase3_Ejemplo1a {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		System.out.printf("El cuadrado de %d es %.0f",n,Math.pow(n,2));

	}

}