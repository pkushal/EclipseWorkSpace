package Adaptor_Pattern;

public class Turkey implements TurkeyBehaviour {
	public void gooble() {
		System.out.println("I am a turkey and I gobble..");
	}

	public void fly() {
		System.out.println("I am a turkey and I CANNOT fly");
	}
}
