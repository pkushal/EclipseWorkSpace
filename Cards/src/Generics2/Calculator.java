package Generics2;

//public class Calculator<T> {
public class Calculator<T extends Summable<T>> { // Calculator le Summable
													// extend gareko hoina..Type
													// T bhanne le Summable
													// extend gareko ho
	private T first;
	private T second;

	public Calculator(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T sumit() {
	return second.sum(first, second);  // or first.sum(first,second);
	}
}
