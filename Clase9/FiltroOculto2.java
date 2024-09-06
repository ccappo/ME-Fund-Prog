/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 9 - Ejemplo de un filtro para Archivos
*  
*  Opcion 2: Creando una clase anómina
*
*/
import java.io.*;

public class FiltroOculto2 {
	public static void main(String[] args) {
		
        File directorio = new File("d:\\");
        
        File [] filtrados = directorio.listFiles(new FileFilter() {
        	public boolean accept(File dir) {
       		 return dir.isHidden();
       	    };
        });
        
        for ( File f : filtrados) 
        	System.out.println(f.getName());
    }
}

