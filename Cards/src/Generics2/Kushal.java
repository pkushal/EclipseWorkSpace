package Generics2;

public class Kushal implements Summable<Kushal> {

	Integer a;
	Integer b;

	public Kushal(Integer a) {
		this.a = a;
	}

	@Override
	public Kushal sum(Kushal e, Kushal f) {
		return new Kushal(e.a + f.a);
	}

	public String toString() {
		return String.valueOf(a);
	}

}
