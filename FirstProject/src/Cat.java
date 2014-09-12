
public class Cat extends Animal{

	public Cat(int h, int w) {
		super(h, w);
	}
	
	public void sound(){
		System.out.println("Meowwwww");
	}
	
	
	public String toString(){
		return super.toString() + "\n . I am a cat";
	}
}
