package Adaptor_Pattern;

public class Duck implements DuckBehaviour {
	public void quack() {
		System.out.println("I am a duck and I quack..");
	}

	public void fly() {
		System.out.println("I am a duck and I can fly...");
	}
}
