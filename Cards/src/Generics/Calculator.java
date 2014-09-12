package Generics;

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
		// if(first.getClass() == Integer.class)
		// {
		// Integer f = (Integer)first;
		// Integer s = (Integer)second;
		// return (T)(new Integer(f + s));
		// }else return null;
		return first.sum(second); // because it knows that Type T have access to
									// method called sum becuse Type T
									// implements Summable which has method
									// called sum
	}
}
