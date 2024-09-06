
import java.util.*;

/* 
*  Maestria en Electrónica - Énfasis TIC
*  Fundamentos de Programación 2024
*
*  Clase 9 -Uso de Stream
*  
*  Ejemplo de Uso de procesamiento de Stream
*/

import static java.util.stream.Collectors.toList;

public class UsoDish {

	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(
				
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH),
				new Dish("salmon", false, 450, Dish.Type.FISH) );

		
		List<String> threeHighCaloricDishNames =
				menu.stream()
				.filter(dish -> dish.getCalories() > 300)
				.map(Dish::getName)
				.collect(toList());
				System.out.println(threeHighCaloricDishNames);
		
	}

}
