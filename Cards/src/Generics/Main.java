package Generics;

public class Main {
	static Calculator<Kushal> c = new Calculator<>(new Kushal(4), new Kushal(5));
//	static Calculator<Integer> c = new Calculator<>(new Integer(4), new Integer(5));
	static Calculator<KushalString> c1 = new Calculator<>(new KushalString("4"), new KushalString("5"));
	
	public static void main(String[] args) {
		System.out.println(c.sumit());
		System.out.println(c1.sumit());
	}
}
