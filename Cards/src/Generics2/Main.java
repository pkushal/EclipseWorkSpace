package Generics2;

public class Main {
	static Calculator<Kushal> c = new Calculator<>(new Kushal(4), new Kushal(5));

	public static void main(String[] args) {
		System.out.println(c.sumit());
	}
}
