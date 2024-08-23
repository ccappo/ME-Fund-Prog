/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Ejemplo de conjunto de clases
*
*  Define la clase Oficinista que es un empleado con sueldo fijo.
*/
package empresa;

import java.time.*;

public class Oficinista extends Empleado
{
   
    public
       Oficinista ( String n, String a, LocalDate fecnac, long ne, String d, LocalDate fi, long s ) throws Exception
       {
         super(n,a,fecnac,ne,d,fi);
         setSueldo(s);
       }

       public Empleado.tipo getTipo ()
       {
          return tipo.EMPLEADO;
       }
     
}
