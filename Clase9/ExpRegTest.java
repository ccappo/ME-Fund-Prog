/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 9 - Ejemplo de uso del API de Expresiones Regulares
*
*
*  Tomado de https://docs.oracle.com/javase/tutorial/essential/regex/   
*/

/** Esta clase simplemente acepta una expresión regular (pattern)
 *  y un texto. 
 *  - La Clase Pattern acepta una cadena con la expresión regular.
 *    Si la expresión regular está bien construida (a través del método compile)
 *    entonces se construye una instancia de la clase Matcher con el texto donde buscar
 *    que retorna las ocurrencias del patrón en la cadena.
 * 
 *  Este código es sencillo y su objetivo es ejercitarse en la construccion
 *  de expresiones regulares y como funcionan.
 *  
 *  Atención: debe ejecutarse desde la linea de comandos, de lo contrario 
 *  indicará que no existe Consola.
 */
import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExpRegTest {

    public static void main(String[] args){
    	// La Clase Console permite interactuar con la linea de comandos
    	// Si el JVM no fue lanzado desde un shell de comandos (como cmd, bash u otro)
    	// entonces no se tiene una consola asociada.
    	
    	// Algunas ventajas:
    	//  - A readline() se le puede pasar un prompt
    	//  - Existe una forma de tomar datos sin echoing (sin mostrar lo que se escribe), utilizada
    	//    para introducir contraseña.
        Console console = System.console();
        if (console == null) {
            System.err.println("Sin consola.");
            System.exit(1);
        }
        while (true) {

        	// acepta el patrón y los compila (verifica que este bien construida)
            Pattern pattern = 
            Pattern.compile(console.readLine("%nIngrese su expresión regular: "));
             
            // si el patrón está bien construido se acepta el texto donde buscar
            Matcher matcher = 
            pattern.matcher(console.readLine("Ingrese la cadena donde buscar: "));

            // matcher.find() retorna true si encontró coincidencia
            // este código muestra todas las coincidencias.
            boolean found = false;
            while (matcher.find()) { // encuentra todos los patrones en la cadena 
                console.format("Texto encontrado" +
                    " \"%s\" empieza en " +
                    "el indice %d y finaliza en el indice %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found){
                console.format("No se encuentra.%n");
            }
        }
    }
}
