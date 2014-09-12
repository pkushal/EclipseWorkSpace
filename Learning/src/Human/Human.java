package Human;
public class Human {
	private int age;
	private double weight;

	public Human() {
		this(24,154);
	}
	
	public Human(int a){
		this(a, 154);
	}
	
	public Human(int a, double w){
		age = a;
		weight = w;
		System.out.println("This is display from Human class Constructor");
		System.out.println("Your  age is " + age + " and weight is " + weight );
	}

	
	public void display() {
		System.out.println("This is display from display method of the Human class");
		}

}
