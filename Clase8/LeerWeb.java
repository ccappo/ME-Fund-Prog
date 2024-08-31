/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 8 - Ejemplo de lectura desde la web
*
*  
*  
*/
import java.io.IOException;
import java.net.*;
import java.util.Scanner;
/**
 * 
 */
public class LeerWeb {

	/**
	 * @param args recibo la URL 
	 */
	public static void main(String[] args) {
		if ( args.length != 1) {
			System.out.println("Uso: java LeerWeb <url>");
		    System.exit(1);
	    }
		int cnt_car = 0;
		int cnt_lineas = 0;
		try {
			URI uri = new URI(args[0]);
			URL url = uri.toURL();
			//URL url = new URL(args[0]); // debe usar URI a partir de la version 20
			Scanner entrada = new Scanner(url.openStream());
			while ( entrada.hasNext() ) {
				String linea = entrada.nextLine();
				cnt_lineas += 1;
				cnt_car += linea.length();  
			}
			
			System.out.printf("La url %s contiene %d lineas y %d caracteres", url, cnt_lineas, cnt_car);
			
			entrada.close();
			
		} catch ( MalformedURLException ex) {
			System.out.println("URL invalido");
		} catch ( IOException ex) {
			System.out.println("Problema de entrada/salida");
		} catch (URISyntaxException e) {
			System.out.println("URL invalido");
		}
		
		 
	}

}
