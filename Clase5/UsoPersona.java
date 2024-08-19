/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 5 - Ejemplo de clase  
*
*  Definir la clase que usa Persona.
*  
*/
public class  UsoPersona {
    public static void main (String [] args ) {
        Persona per1 = new Persona ("1", "Juan", "Pérez");
        Persona per2 = new Persona ("2", "María", "López");
        per1.imprimirDatos();
        per2.imprimirDatos();
    }
}