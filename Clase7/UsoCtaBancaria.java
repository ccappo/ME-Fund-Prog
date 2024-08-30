/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 7 - Ejemplo de un sencillo de un menu de opciones para operar con CtaBancaria
*    
*/
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

/**
 * Implementa un menu interactivo sencillo con operaciones de CtaBancaria
 * Mantiene una lista de cuentas creadas utilizando un Mapa(Clave, Valor)
 * Permite crear cuentas bancarias
 * Permite operar sobre una cuenta seleccionada
 * Permite mostrar el estado de una cuenta seleccionada
 * 
 * Utiliza manejo de excepciones 
 */
public class UsoCtaBancaria {
	
	private static Scanner sc ;                           // entrada de datos
	private static HashMap<String,CtaBancaria> cuentas;   // para guardar las cuentas creadas
	private static enum tipo_oper {EXTRACCION, DEPOSITO}  // para distinguir el tipo de operacion sobre la cuenta
	
	/**
	 * Muestra todas las cuentas bancarias ya creadas. Solo el nro. de cuenta
	 * y el titular.
	 */
	private static void mostrar_ctas() {
		System.out.println("Opcion mostrar cuentas");
		System.out.println("----------------------");
		if (cuentas.size() > 0) {
			System.out.println("      Nro.\t    Titular");
			System.out.println("----------\t ---------------");

			for (Map.Entry<String, CtaBancaria> ecta : cuentas.entrySet()) {
				CtaBancaria cta = ecta.getValue();
				System.out.printf("%10s\t %-15s\n", cta.getNumero(), cta.getTitular());
			}
		} else
			System.out.println("No hay cuentas creadas!");
	}
	
	/**
	 * Solicita una cuenta bancaria a seleccionar. Busca en 
	 * la lista de cuentas ya creadas.
	 * @return La cuenta bancaria seleccionada.
	 */
	private static CtaBancaria solicitar_cta() {
		CtaBancaria cta = null;
		String nrocta;
		while ( true ) {
			
			System.out.print("Ingrese cuenta (FIN para cancelar):");
			nrocta = sc.next();
			if ( nrocta.equals("FIN") ) // indica que no se ingreso nada
				break;
			
			if ( ! cuentas.containsKey(nrocta))
				System.out.println("No existe la cuenta");
			else {
				cta = cuentas.get(nrocta);
				break;
			}		
		}
 	
		return cta;
	}
	
	/**
	 * Crea una nueva cuenta bancaria. Solicita el nro., titular y saldo actual.
	 * Crea la cuenta si todavia no existe en la lista de cuentas.
	 */
	private static void crear_cuenta() {
		System.out.println("Opcion crear cuenta");
		System.out.println("-------------------");
        boolean creado = false;
		while (true) {
			System.out.print("Ingrese nro: ");
			String n = sc.next();
			sc.nextLine();
			System.out.print("Ingrese titular: ");
			String t = sc.nextLine();
			long saldo;
			try {
				System.out.print("Ingrese saldo inicial: ");
				saldo = sc.nextLong();
			} catch (InputMismatchException e) {
				System.out.print("Valor invalido");
				break;
			} catch ( IllegalArgumentException e) {
				System.out.print("Valor invalido: " + e.getMessage());
				break;
			}
			
			if (!cuentas.containsKey(n)) {
				cuentas.put(n, new CtaBancaria(t, n, saldo));
				creado = true;
				break;
			} else
				System.out.println("Cuenta ya Existe!!");
		}
		if ( creado )
		   System.out.println("Cuenta creada con éxito");
		else
		   System.out.println("Cuenta no creada");
	}
	
	/**
	 * Implementa las operaciones de extracción y depósito a la cuenta seleccionada.
	 * 
	 * @param oper Operacion a ser realizada (Extraccion o Depósito)
	 */
	private static void operacion(tipo_oper oper) {
		System.out.printf("Operación de %s con una cuenta\n",oper.name());
		System.out.println("----------------------------------------");
		if (cuentas.size() == 0) {
			System.out.println("No existen cuentas");
			return;
		}
		
		mostrar_ctas();
		CtaBancaria cta = solicitar_cta();
		if ( cta != null ) {
		   while ( true ) {
			  System.out.printf("Ingrese monto para %s (0 para cancelar):", oper.name());
			  try { 
			     int monto = sc.nextInt();
			     
			     if ( monto == 0) {
			    	System.out.println("Operacion cancelada"); 
			    	break;
			     }
			     
			     if ( oper == tipo_oper.EXTRACCION)
			        cta.extraccion(monto);
			     else
			    	cta.deposito(monto);
			     
			     System.out.println("Operacion exitosa");
			     break;
			     
			  } catch ( Exception e ) {
				 System.out.println(e.getMessage());
			  }
		   }
		   
		   System.out.printf("Cta: %s Saldo actual: %d ",cta.getNumero(),cta.getSaldo());
		} else	
			System.out.println("Operacion cancelada");
	}
	
	/**
	 * Muestra el detalle de la cuenta seleccionada
	 */
	private static void mostrar_cuenta() {
		if ( cuentas.size() == 0 ) {
		   System.out.println("No existen cuentas creadas");
		   return;
		}
		
		mostrar_ctas();
		CtaBancaria cta = solicitar_cta();
		if ( cta != null )
		   cta.imprimirResumen();
	}
	
	/**
	 * Simplemente borra la pantalla con un código particular que funciona
	 * para terminales de windows.
	 */
	public static void clear_screen() {
		System.out.print("\033[H\033[2J");//borra la pantalla en windows.
	}
	
	/**
	 * Emula el presionar cualquier tecla
	 */
	public static void key_press() {
        sc.nextLine();	
		System.out.println("\nPresione enter para continuar");
		sc.nextLine();
	}
	
	/**
	 * El programa principal que acepta una de las opciones.
	 */
	public static void main (String ... args ) {
		
	   int opc ;
	   sc = new Scanner(System.in);
	   
	   cuentas = new HashMap<>();

	   principal:   
	   while ( true  ) {
		  clear_screen();
		  System.out.println("Introduzca una opción:");
		  System.out.println("1) Crear una cuenta");
		  System.out.println("2) Extraccion de una cuenta");
		  System.out.println("3) Deposito de una cuenta");
		  System.out.println("4) Mostrar una cuenta");
		  System.out.println("5) Salir");
		  
		  // procesa alguna de las opciones
		  while ( true ) {
			 System.out.print("Introduzca opción:"); 
		     
		     try {
		        opc = sc.nextInt();
		        if ( opc <= 0 || opc > 5 ) {
		        	System.out.println("Opción debe estar entre 1 y 5");
		            continue;
		        }
		        break;
		     } catch (InputMismatchException e) {
		    	System.out.println("La opción no es número");
		     }  	
		   }
		   clear_screen();
		   switch ( opc ) {
		     case 1: // Crear una nueva cuenta
		    	  crear_cuenta();
		    	  key_press();
		    	  break;
		     case 2: // Operación de extracion de una cuenta
		    	  operacion(tipo_oper.EXTRACCION);
		    	  key_press();
		    	  break;
		     case 3: // Operación de Depósito a una cuenta
		    	  operacion(tipo_oper.DEPOSITO);
		    	  key_press();
		    	  break;
		     case 4: // Mostrar detalle de una cuenta
		    	  mostrar_cuenta();
		    	  key_press();
		    	  break;
		     case 5: // Salir del programa.
		    	  System.out.println("Gracias por utilizar este programa, hasta luego!!.");
		    	  break principal; // Fijarse que este break es para saltarse el while principal.
		   }
	   }
	   sc.close();
	}
	
  }
