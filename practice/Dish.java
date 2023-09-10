package practice;

public class Dish{

	private Integer calories;
	private String name;

	public Dish(Integer calories,String name){
		this.calories = calories;
		this.name = name;
	}

	public Integer getCalories(){
		return calories;
	}
	public String getName(){
		return name;
	}



}