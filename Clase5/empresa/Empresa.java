/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Ejemplo de conjunto de clases
*
*  Define la clase Empresa que contiene como datos su nombres y la lista de empleados,
*  que pueden ser vendedores y oficinistas.
*/
package empresa;

import java.time.*;

public class Empresa
{
   private
     String nombre;
     Empleado [] ListaEmpleado;

   public
     Empresa ( String nomb)
     {
       setNombre(nomb);
     }

     public void setNombre(String s)
     {
       nombre = s;
     }
     public Empleado [] getEmpleados()
     {
       return  ( ListaEmpleado );
     }

     public String getNombre()
     {
       return ( nombre );
     }

     public void agregar_empleado ( Empleado e )
     {
       int k;
       int len_e = ListaEmpleado == null ? 0 : ListaEmpleado.length;
       Empleado []  list_tmp  = new  Empleado [len_e];
       if ( len_e > 0 )
          for ( k = 0 ; k < len_e ; k++ )
             list_tmp[k] = ListaEmpleado[k];
       ListaEmpleado = new Empleado[len_e + 1];
       for ( k = 0 ; k < len_e ; k++ )
           ListaEmpleado[k] = list_tmp[k];
       ListaEmpleado[k] = e;
     }

     /* Para desarrollar */
     public void imprimir_planilla_sueldo ()
     {
          ;
     }
     
     
     public void imprimir_lista_empleado ()
     {
       System.out.println("Lista de Empleados");
       System.out.println("Empresa " + this.getNombre());
       System.out.println("\tNro   Nombre     Apellido   Tipo       Fec.Ingreso       Sueldo");
       System.out.println("\t----- ---------- ---------- ---------- ----------- ------------");
       for ( int k = 0 ; k <  ListaEmpleado.length ; k ++ ){
    	 System.out.printf("\t%4d  %-10s %-10s %-10s %5$td/%5$tm/%5$tY  %6$,12d\n",
         ListaEmpleado[k].getNroEmpleado() ,
         ListaEmpleado[k].getNombre() ,
         ListaEmpleado[k].getApellido() ,
         ListaEmpleado[k].getTipo() ,
         ListaEmpleado[k].getFechaIngreso(),
         ListaEmpleado[k].getSueldo());
      }
      System.out.println("\t----- ---------- ---------- ---------- ----------- ------------");
      System.out.printf("\tCantidad de empleados: %d\n", ListaEmpleado.length);
      System.out.println("Fin del listado");
     }
     
     public String toString () {
    	 return "Empresa: " + nombre + " Cnt. Empleados: " + (ListaEmpleado == null?0:ListaEmpleado.length); 
     }
     public static void main ( String [] args ) throws Exception {
         // Ejemplo de uso 
         Empresa emp = new Empresa("E-Start S.A.");
         
         // Articulos de ejemplo 
         Articulo a1 = new Articulo("01","TV Led 1",1200000);
         Articulo a2 = new Articulo("02","TV Led 2",1500000);
         Articulo a3 = new Articulo("03","TV Led 3",1800000);
         Articulo a4 = new Articulo("04","TV Led 4",2000000);
         Articulo a5 = new Articulo("05","PC Comun",2500000);
         Articulo a6 = new Articulo("06","PC Pro I",3900000);
         Articulo a7 = new Articulo("07","PC Pro II",4000000);
         Articulo a8 = new Articulo("08","PC Pro Plus",6000000);
         
         // Dos oficinistas
         Oficinista e1 = new Oficinista("Juan","Perez",LocalDate.of(1999,8,2),1,"Caja",LocalDate.of(2020,10,01),3000000);
         emp.agregar_empleado(e1);
         
         Oficinista e2 = new Oficinista("Maria","Benitez",LocalDate.of(2000,6,18),2,"Caja",LocalDate.now(),2500000);
         
         emp.agregar_empleado(e2);
         e2.setJefe(e1);
         
         
         Vendedor v1 = new Vendedor("José","Martinez",LocalDate.of(2000,06,18),2,"Ventas",LocalDate.now(),2.0);
         
         Venta v1_1 = new Venta(1, LocalDate.now());
         v1_1.setVenta(a1, 2);
         v1_1.setVenta(a2, 2);
         v1_1.setVenta(a3, 3);
         v1_1.setVenta(a8, 1,5500000);
         
         v1.setVenta(v1_1);
         
         v1_1 = new Venta(2, LocalDate.now());
         v1_1.setVenta(a1, 1);
         v1_1.setVenta(a2, 4);
         v1_1.setVenta(a3, 5);
         v1_1.setVenta(a8, 2,5200000);
         
         v1.setVenta(v1_1);
         
         // le damos un sueldo base al vendedor
         v1.setSueldo(1200000);
         
         emp.agregar_empleado(v1);
         
         emp.imprimir_lista_empleado();
     }
}
