/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 8 - Ejercicio 1
*
*  
*  
*/
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 */
public class ReemplazarCadena {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
        if ( args.length != 4) {
			System.out.println("Debe pasar cuatro parametros");
			System.out.println("Uso: java ReemplazarCadena <entrada> <salida> <cadena_buscar> <cadena_reemplazo>");
			System.exit(1); // termino el programa con error 1
		}
		
        // verificar que el archivo de entrada exista
        File fentrada = new File(args[0]) ;
        if ( !fentrada.exists() ) {
        	System.out.printf("Archivo de entrada %s no existe", args[0]);
            System.exit(2);
        }
        
        // verificar que el archivo de salida no exista o borrarlo si existe
        File fsalida = new File(args[1]) ;
        if ( fsalida.exists() ) {
        	System.out.printf("Archivo de salida %s ya existe", args[1]);
            System.exit(3);
        }
    	
        int cnt_lineas_cambiadas = 0;
        
        try (   
        		Scanner entrada = new Scanner(fentrada); // Scanner tambien es autoclosable!!
            	PrintWriter salida = new PrintWriter(fsalida)
        ) // definimos el cierre automático
        {
        	while ( entrada.hasNext()) {
        		String s1 = entrada.nextLine();
        		String s2 = s1.replaceAll(args[2], args[3]);
        		if ( ! s1.equals(s2 ))
        			cnt_lineas_cambiadas++;
        		salida.println(s2);
        	}
        }
        System.out.printf("%d Lineas cambiadas. Archivo %s generado", cnt_lineas_cambiadas, args[1]);
  
	}
}
