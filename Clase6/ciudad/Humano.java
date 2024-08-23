/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 6 - Ejemplo de interface
*/
package ciudad;

public class Humano implements EmiteRuido {
   private String nombre;
   
   public Humano (String s) {
      nombre = s;
   }
   
   public void hacerRuido() {
     System.out.println("Hola, soy humano y mi nombre es " + nombre);
   }
}