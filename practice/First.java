package practice;
import java.util.*;

public class First{
	public static void main(String...args){

		List<Apple> list = new ArrayList<>();
		list.add(new Apple(142));
		list.add(new Apple(224));
		list.add(new Apple(321));
		list.add(new Apple(182));
		list.add(new Apple(132));
		list.add(new Apple(312));
		list.add(new Apple(192));

		// Collections.sort(list, new Comparator<Apple>(){
		// 	public int compare(Apple a1,Apple a2){
		// 		return a1.getWeight().compareTo(a2.getWeight());
		// 	}
		// });
		list.sort(comparing(Apple::getWeight));
		System.out.println(list);

	}
}
