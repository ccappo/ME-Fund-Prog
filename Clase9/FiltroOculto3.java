/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 9 - Ejemplo de un filtro para Archivos
*  
*  Opcion 3: Pasandole la función filtro 
*
*/
import java.io.*;

public class FiltroOculto3 {
	public static void main(String[] args) {
		
        File directorio = new File("d:\\");
        
        File [] filtrados = directorio.listFiles(File::isHidden);
        
        for ( File f : filtrados) 
        	System.out.println(f.getName());
    }
}

