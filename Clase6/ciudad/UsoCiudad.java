/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 6 - Ejemplo de interface
*/
package ciudad;

public class UsoCiudad {
   public static void main( String [] args ) {
      Ciudad c = new Ciudad();
      EmiteRuido g = new Gato(); 
      Animal p = new Perro();
    		  
	  c.agregar(g);
      c.agregar(p);
      c.agregar(new Humano("Maria"));
      c.agregar(new Humano("Luis"));
      c.agregar(new Sirena());
      c.agregar(new Auto());
	  	   
      c.escucharRuidos();
  }
}