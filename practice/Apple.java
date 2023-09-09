package practice;

public class Apple{
	private Integer weight;

	public Apple(Integer weight){
		this.weight = weight;
	}
	public Integer getWeight(){
		return weight;
	}

	@Override
	public String toString(){
		return "Weight: " + weight;
	}
}