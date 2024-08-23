/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Ejemplo de conjunto de clases
*
*  Define la clase Empleado con los datos de : nro, dpto, fecha de ingreso, sueldo y un jefe (eventualmente)
*/
package empresa;

import java.time.*;

public abstract class Empleado extends Persona
{
	   protected long nroempleado;
       protected String dpto;
       protected LocalDate fecingreso;
       protected long sueldo;
       protected Empleado jefe;
       protected enum tipo {OFICINISTA,VENDEDOR,EMPLEADO};
   
       Empleado ()
       {
          nroempleado = 0;
          dpto        = "";
          sueldo      = 0;
          fecingreso  = LocalDate.now();
       }
       
       public Empleado ( String n, String a, LocalDate fecnac, long ne, String d, LocalDate fi )
       {
          super(n,a, fecnac);
          nroempleado = ne;
          dpto = d;
          fecingreso = fi;
       }
       
       public LocalDate getFechaIngreso() {
    	   return fecingreso;
       }
       
       public void setJefe ( Empleado j ) throws Exception
       {
         if ( j != null )
           if ( j.getNroEmpleado() == nroempleado )
              throw new Exception ( "El Empleado no puede ser su propio jefe");
           else
             jefe = j;
       }
       
       public Empleado getJefe ()
       {
         return ( jefe );
       }
       
       public void setSueldo(long s) {
           sueldo = s;
       }

       public long getSueldo() {
    	   return sueldo;
       };
       
       public abstract tipo getTipo ();
       
       public void setNroEmpleado ( long l)
       {
          nroempleado = l;
       }

       public long getNroEmpleado ( )
       {
         return ( nroempleado );
       }
       public void setDpto ( String d)
       {
          dpto = d;
       }
       public String getDpto ( )
       {
         return ( dpto );
       }
}

