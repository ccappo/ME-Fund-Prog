/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 5 - Ejemplo de clase  
*
*  Definir la clase Persona.
*  
*/
public class Persona {
    
    private String nombre ;
    private String apellido ; 
    private String cedula;
    
    /* Constructor de persona */
    Persona ( String nom, String ap, String ced ) { 
        this.nombre   = nom;     
        this.apellido = ap; 
        this.cedula   = ced;
    }
    
    public void imprimirDatos(){
         System.out.println("Cedula  : " + this.cedula   + 
                            "Apellido: " + this.apellido + 
                            "Nombre  : " + this.nombre );
    }
}
