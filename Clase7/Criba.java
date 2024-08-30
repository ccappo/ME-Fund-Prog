/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 7 - Ejercicio de repaso (Uso de HashMap)
* 
*  
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 
 */
public class Criba {
  /**
   * Retorna true si n es primo o false en caso contrario 
   * 
   * @param n 
   */
  public static boolean esPrimo( int n ) {
	  boolean esprimo = true;
	  for ( int f = 2; f <= n/2; f++) 
		  if ( n % f == 0) { 
			  esprimo = false;
			  break;
		  }
	  return esprimo;
  }
  public static void main ( String [] args) {
	  // funciona pero el orden no es importante
	  //HashMap<Integer, Integer> primos_cnt = new HashMap<>();
	  
	  // aqui interesa el orden y podemos usar esta estructura Map
	  SortedMap<Integer,Integer> primos_cnt = new TreeMap<Integer, Integer>();
	  SortedMap<Integer,ArrayList<Integer>> primos_det = new TreeMap<>();
			  
	  int [] primos = new int[50];
	  int cnt_primos = 0;
	  
	  for ( int k = 2; k < 50 ; k++)
		  if ( esPrimo(k) ) 
			  primos[cnt_primos++] = k;
		  
	  for ( String s : args) {
		  for ( int k=0 ; k < cnt_primos;k++) {
			  int n = Integer.parseInt(s);
			  if ( n % primos[k] == 0) {
				 Integer i = primos_cnt.get(primos[k]);
				 ArrayList<Integer> al = primos_det.get(primos[k]);
				 if ( i == null ) {
					primos_cnt.put(primos[k], 1);
					al = new ArrayList<Integer>();
					al.add(n);
					primos_det.put(primos[k], al);
				 } 
				else {
					primos_cnt.put(primos[k], i+1);
					al.add(n);
				}
			  }
		  }
		  
	  }
	  System.out.println(primos_cnt);
	  System.out.println(primos_det);
	  
  }
}
