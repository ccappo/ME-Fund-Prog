/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Ejemplo de conjunto de clases
*
*  Define la clase Articulo con los datos de : codigo, descripcion y precio  
*/
package empresa;

public class Articulo
{
    private
       String codigo;
       String descripcion;
       long   precio;
    public
       Articulo ( String c, String d, long p)
       {
          codigo = c;
          descripcion = d;
          precio = p;
       }
       public void setPrecio ( long p )
       {
         precio = p;
       }
       public long getPrecio ( )
       {
         return (precio);
       }
       public void setCodigo ( String c )
       {
         codigo = c;
       }
       public String getCodigo ( )
       {
         return (codigo);
       }
       public void setDescripcion ( String s )
       {
         descripcion = s;
       }
       public String getDescripcion (  )
       {
         return ( descripcion );
       }
}

