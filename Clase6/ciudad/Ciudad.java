/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 6 - Ejemplo de interface
*/
package ciudad;

import java.util.*;

public class Ciudad {
  private ArrayList<EmiteRuido> cosas;
  
  public Ciudad () {
      cosas = new ArrayList<EmiteRuido>();
  }

  public void agregar(EmiteRuido e) {
      cosas.add(e);
 }
 
 public void escucharRuidos() {
      for ( EmiteRuido e : cosas ) 
           e.hacerRuido(); 
 }
}