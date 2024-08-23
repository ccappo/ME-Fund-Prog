/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Ejemplo de conjunto de clases
*
*  Define la clase Persona con los datos basicos: nombre, apellido, fecha de nac, estado civil, etc.
*  
*  No solo puede usarse para Empleados sino para los Clientes.
*/
package empresa;

import java.time.*;

public class Persona
{
   protected String nombre;
   protected String apellido;
   protected LocalDate fechanac;
   protected enum tipoestcivil {CASADO,SOLTERO,DIVORCIADO,VIUDO,SINDATO}; /*C: Casado S:soltero D: divorciado V:viudo N: sin dato */
   protected tipoestcivil estcivil;
   public
        Persona ()
        {
           nombre   = "";
           apellido = "";
           fechanac = LocalDate.now(); // fecha actual
           estcivil = tipoestcivil.SINDATO;
        }
        public Persona ( String n, String a, LocalDate fn )
        {
           nombre   = n;
           apellido = a;
           fechanac = fn;
        }
        
        public tipoestcivil getEstadoCivil() {
        	return estcivil;
        }
        
        public void setEstadoCivil(tipoestcivil ec) {
           estcivil = ec;
        }
        
        public void setNombre ( String n)
        {
          nombre = n;
        }
        public String getNombre ( )
        {
          return ( nombre );
        }
        public void setApellido ( String a)
        {
          apellido = a;
        }
        public String getApellido ( )
        {
          return ( apellido );
        }
}

