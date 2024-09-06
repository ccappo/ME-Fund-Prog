/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 9 -Uso de Stream
*  
*  Para ejemplo de Uso de Stream  (con Trader y Transaction)
*/

import java.util.*;
import java.util.stream.*;

public class UsoTraderTransaction {
	
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario","Milan");
		Trader alan = new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");
		List<Transaction> transactions = new ArrayList<>(Arrays.asList(
		new Transaction(brian, 2011, 300),
		new Transaction(raoul, 2012, 1000),
		new Transaction(raoul, 2011, 400),
		new Transaction(mario, 2012, 710),
		new Transaction(mario, 2012, 700),
		new Transaction(alan, 2012, 950)
		));
		
		/* Ejercicio 1 */
		List<Transaction> tr2011 =
				transactions.stream()
				.filter(transaction -> transaction.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.collect(Collectors.toList());
		System.out.println("Ejercicio 1");
		System.out.println(tr2011);
		
		/* Ejercicio 2 */
		List<String> cities =
				transactions.stream()
				.map(transaction -> transaction.getTrader().getCity())
				.distinct()
				.collect(Collectors.toList());
		System.out.println("\nEjercicio 2 - opc1");
		System.out.println(cities);
		
		Set<String> cities2 =
				transactions.stream()
				.map(transaction -> transaction.getTrader().getCity())
				.collect(Collectors.toSet());
		System.out.println("\nEjercicio 2 - opc 2");
		System.out.println(cities2);
		
		/* Ejercicio 3 */
		
		List<Trader> traders =
				transactions.stream()
				.map(Transaction::getTrader)
				.filter(trader -> trader.getCity().equals("Cambridge"))
				.distinct()
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
		System.out.println("\nEjercicio 3");
		System.out.println(traders);
		
		/* Ejercicio 4 */
		
		String traderStr =
				transactions.stream()
				.map(transaction -> transaction.getTrader().getName())
				.distinct()
				.sorted()
				.reduce("", (n1, n2) -> n1 + n2);
		System.out.println("\nEjercicio 4 - opc 1");
		System.out.println(traderStr);
		
		String traderStr2 =
				transactions.stream()
				.map(transaction -> transaction.getTrader().getName())
				.distinct()
				.sorted()
				.collect(Collectors.joining());
		System.out.println("\nEjercicio 4 - opc 2");
		System.out.println(traderStr2);
		
		/* Ejercicio 7*/
		//if ( transactions instanceof ArrayList )
		//    transactions.clear();
		
		Optional<Integer> highestValue =
				transactions.stream()
				.map(Transaction::getValue)
				.reduce(Integer::max);
		System.out.println("\nEjercicio 7 ");
		
		if ( highestValue.isPresent()) 
			System.out.println(highestValue);
		else
			System.out.println("No se encontró valor");
		
		
			
	}

}
