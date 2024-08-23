/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Ejemplo de conjunto de clases
*
*  Define la clase Vendedor con los datos de un empleado pero con comision y ventas asociadas
*/
package empresa;

import java.time.*;

public class Vendedor extends Empleado
{
   private double comision; // comision en % (2.0 es 2%) 
   private Venta [] ventasVendedor;
   
   public
      Vendedor ( String n, String a, LocalDate fecnac, long ne, String d, LocalDate fi, double c) throws Exception
      {
         super(n,a,fecnac,ne,d,fi);
         comision = c;
      }
   
      public Empleado.tipo getTipo ()
      {
         return tipo.VENDEDOR;
      }

      public long getSueldo() // solo gana si vende
      {
    	  
        long s = 0; 
        
        if ( ventasVendedor != null )
           for ( int k = 0 ;  k < ventasVendedor.length  ; k ++ )
               s += ventasVendedor[k].montoVendido();
        return ( super.getSueldo() + (long)(s * (comision/100)) ); // sumamos el sueldo base
      }

      public void setComision ( double c )
      {
        comision = c;
      }
      public double  getComision ( )
      {
        return (comision);
      }

      public void setVenta ( Venta v)
      {
         int k = 0;
         int len_vv = ventasVendedor == null ? 0 : ventasVendedor.length;
         Venta [] v_tmp = new Venta [ len_vv + 1 ];

         if ( len_vv > 0 )
         {
            /* Copiar al temporal */
            for ( k = 0 ; k <  ventasVendedor.length; k++ )
               v_tmp[k] = ventasVendedor[k];
         }
         v_tmp[k] = v;
         ventasVendedor  = v_tmp;
      }

      public Venta [] getVenta ( )
      {
         return ( ventasVendedor );
      }
}
