/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 6 - Ejemplo de interface
*/
package ciudad;

public class Perro extends Animal {
	
  Perro () {
     tipoanimal = tipo.PERRO; 
  }
	
  public void hacerRuido() {
    System.out.println("GUAU-GUAU");
  }
}