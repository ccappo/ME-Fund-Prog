/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 9 - Ejemplo de un filtro para Archivos
*  
*  Opcion 1: Creando una clase que implementa el Filtro.
*
*/
import java.io.File;
import java.io.FileFilter;

public class FiltroOculto1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        File directorio = new File("d:\\");
        
        File [] filtrados = directorio.listFiles(new FiltroOculto());
        
        for ( File f : filtrados) 
        	System.out.println(f.getName());
    }
}

class FiltroOculto implements FileFilter {
	public boolean accept(File dir) {
		 return dir.isHidden();
	};
}
