/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 7 - Ejemplo de clase  
*
*  Modela la CtaBancaria con un saldo inicial y operaciones de
*  extraccion y deposito.
*  
*  Incluye una clase de Excepcion Propia
*  
*/

public class CtaBancaria {
	   
	   private String titular;
	   private String numero;
	   
	   private long saldo ;
	   private long saldo_inicial;
	   private int cnt_deposito;
	   private int cnt_extraccion;
	   
	   /* Constructor con las inicializaciones adecuadas*/ 
	   public CtaBancaria ( String tit, String nro, long saldoinicial) {
		  this.titular = tit; 
		  this.numero  = nro;
		  this.saldo   = saldoinicial;
		  this.saldo_inicial = saldoinicial;
		  cnt_deposito = 0;
		  cnt_extraccion = 0;
		  if ( this.saldo < 0 )
			  throw new IllegalArgumentException("Monto de saldo debe ser mayor a cero");
	   }   
	   
	   public String getTitular () {
	      return titular;
	   }   
	   
	   public String getNumero () {
	      return numero;
	   }
	   
	   public long getSaldoInicial() {
		      return saldo_inicial;
		}
	   
	   public long getSaldo() {
	      return saldo;
	   }
	   
	   /* Operacion de deposito por monto
	    * En caso de que el monto sea negativo se
	    * genera una excepción.
	    * Se incrementa el saldo y el contador de depositos
	    */
	   public void deposito ( long monto ) throws Exception {  
	      if ( monto <= 0 )
	         throw new Exception("Monto de deposito debe ser mayor a cero!!");
	      saldo += monto;		
	      cnt_deposito +=1;
	   
	   }
	   
	   /* Operacion de extraccion por monto
	    * En caso de que el monto sea negativo o no tenga saldo se
	    * genera una excepción.
	    * Se disminuye el saldo y se incrementa el contador de extracciones.
	    */
	   public void extraccion ( long  monto ) throws Exception {
	      if ( monto <= 0 ) // monto negativo o cero
		      throw new IllegalArgumentException("Monto de extraccion debe ser mayor a cero!!");
			  
	      if ( saldo - monto  < 0 ) // saldo insuficiente
	          throw new ErrorCtaBancaria("No tiene suficiente saldo para la operacion!!");	 
	      
	      saldo -= monto;
	      cnt_extraccion += 1;
	   }
	   
	   /*
	    * Se imprime un resumen de la cuenta.
	    * 
	    */
	   public void imprimirResumen() {
	      System.out.printf("\n\nResumen de la cuenta %s del titular %s\n", numero, titular);
		  System.out.printf(" --------------------------------------\n");
		  System.out.printf(" Saldo Inicial : %,d  \n", getSaldoInicial()) ;
		  System.out.printf(" ------------------\n");
		  if ( cnt_extraccion > 0 || cnt_deposito > 0 ) {
		     System.out.printf(" Cant. de depositos    : %d \n", cnt_deposito);
		     System.out.printf(" Cant. de extracciones : %d \n", cnt_extraccion);
		  } else  
			 System.out.printf(" Esta cuenta no tuvo movimientos!! \n");
		  System.out.printf(" ------------------\n");
		  System.out.printf("Saldo final: %,d\n", getSaldo());
		  System.out.printf("---------Fin del resumen-------------- \n");	 
	   }
	   
	   /*
	    * Ejemplo sencillo de uso
	    */

		public static void main(String[] args) throws Exception {
			CtaBancaria ct1 = new CtaBancaria("Juan Perez", "00001-999", 1500000);
			CtaBancaria ct2 = new CtaBancaria("Maria Benitez", "00002-777", 800000);

			ct1.deposito(100000);
			ct1.deposito(150000);
			ct1.deposito(130000);
			ct1.deposito(500000);

			ct1.extraccion(120000);
			ct1.extraccion(1500000);
			ct1.extraccion(1800000);

			ct1.imprimirResumen();
			ct2.imprimirResumen();

		}	
}

class ErrorCtaBancaria extends Exception {
	ErrorCtaBancaria (String msg) {
		super(msg);
	}
}
