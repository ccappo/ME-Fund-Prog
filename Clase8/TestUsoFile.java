/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 8 - Ejemplo de uso de Byte Stream
*
*  
*/
import java.io.*;

/**
 * Solicitar un nombre de archivo por la linea de comandos
 * e imprimir sus características.
 */
public class TestUsoFile {
  public static void main( String [] args ) {
       if ( args.length != 1) {
    	   System.out.println("Ingrese el nombre del archivo");
           System.exit(1);
       }
       File archivo = new File(args[0]);
       
       System.out.println("Existe?" + archivo.exists());
       System.out.printf("Tiene %d bytes?", archivo.length());
       System.out.println("Puede leerse?" + archivo.canRead());
       System.out.println("Puede escribirse?" + archivo.canWrite());
       System.out.println("Es un directorio?" + archivo.isDirectory());
       System.out.println("Es un archivo?" + archivo.isFile());
       System.out.println("Es absoluto?" + archivo.isAbsolute());
       System.out.println("Esta oculto?" + archivo.isHidden());
       System.out.println("Camino absoluto: " + archivo.getAbsolutePath());
       System.out.println("Modificado en: " + new java.util.Date(archivo.lastModified()));
  }
}
