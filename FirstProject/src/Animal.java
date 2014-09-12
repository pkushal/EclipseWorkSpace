
public class Animal {
	
	private int height;
	private int weight;
	
	public Animal(int h, int w){
		height = h;
		weight = w;
	}
	
	protected void sound(){
		System.out.println("I make no sound");
	}
	
	public String toString(){
		return "I am an animal with height "+ height +"inches and weight " + weight +" lb";
	}
}
