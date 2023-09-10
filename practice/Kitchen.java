package practice;
import java.util.*;
import java.util.stream.*;
public class Kitchen{

	public static void main(String...args){


		List<Dish> dishes = new ArrayList<>();

		dishes.add(new Dish(200,"Banana"));
		dishes.add(new Dish(100,"Mushrooms"));
		dishes.add(new Dish(300,"Chiken"));
		dishes.add(new Dish(150,"Beef"));
		dishes.add(new Dish(400, "Ice cream"));
		dishes.add(new Dish(250,"Pizza"));
		dishes.add(new Dish(132,"Rabbit"));

		List<Dish> lowCalories = new ArrayList<>();
		for(Dish dish : dishes){
			if (dish.getCalories() < 200) {
				lowCalories.add(dish);
			}
		}

		Collections.sort(lowCalories,new Comparator<Dish>(){
			public int compare(Dish d1,Dish d2){
				return Integer.compare(d1.getCalories(),d2.getCalories());
			}
		});

		List<String> dishesNames = new ArrayList<>();

		for(Dish dish: lowCalories){
			dishesNames.add(dish.getName());
		}
		System.out.println(dishesNames);

		List<String> anotherDishesNames = dishes.parallelStream()
			.filter(d -> d.getCalories() < 200)
			.sorted(Comparator.comparing(Dish::getCalories))
			.map(Dish::getName)
			.collect(Collectors.toList());
		System.out.println(anotherDishesNames);

	}
}