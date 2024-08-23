/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Ejemplo de conjunto de clases
*
*  Define la clase Venta y la clase VentaDetalle.
*/
package empresa;

import java.time.*;

public class Venta
{
        private VentaDetalle [] artvendidos;
        private long  nroventa;
        private LocalDate  fecvta;
        
        Venta ( long nv, LocalDate f )
        {
            nroventa = nv;
            fecvta = f;
        }
        
        public void setVenta(Articulo a, int c) throws Exception {
           VentaDetalle vd = new VentaDetalle(a,c);
           agregar_venta(vd);
        }
        
        public void setVenta(Articulo a, int c, long precio) throws Exception {
           VentaDetalle vd = new VentaDetalle(a,c,precio);
           agregar_venta(vd);
        }
        
        private void agregar_venta ( VentaDetalle vd ) throws Exception {
           if ( artvendidos != null )	
             for ( VentaDetalle v : artvendidos ) 
                if ( v.getArticulo().getCodigo() == vd.getArticulo().getCodigo()) 
                    throw new Exception("Ya existe el articulo en la venta!");
           
           int k= 0;
           int len_vv = artvendidos == null ? 0 : artvendidos.length;
           VentaDetalle [] v_tmp = new VentaDetalle [ len_vv + 1];

           if ( len_vv > 0 )
           {
            /* Copiar al temporal */
             for ( k = 0 ; k <  artvendidos.length; k++ )
               v_tmp[k] = artvendidos[k];
           }  
           
           v_tmp[k] = vd; //agregamos  
           
           artvendidos = v_tmp; //reemplazamos con el nuevo
         
        }
        
        public LocalDate getFecha() {
        	return fecvta;
        }
        
        public long getNroVenta() {
        	return nroventa;
        }
        
        public long montoVendido ( )
        { 
          long total = 0;
          for ( VentaDetalle v : artvendidos )
              total += v.montoVendido();
          
          return ( total );
        }
}

class VentaDetalle {
      private Articulo artvendido;
      private int      cantidad;
      private long     precio;  
    
       VentaDetalle ( Articulo a, int c, long p )
       {
           artvendido = a;
           cantidad = c;
           precio = p;
       }
       VentaDetalle ( Articulo a, int c ) //precio por defecto
       {
           artvendido = a;
           cantidad = c;
           precio = artvendido.getPrecio();
        }
        
        public Articulo getArticulo() {
            return artvendido;
        }
        
        long montoVendido ( )
        {
          return ( precio * cantidad );
        }
        
        void setCantidad ( int c )
        {
          cantidad = c;
        }
        int getCantidad ()
        {
          return ( cantidad );
        }
}