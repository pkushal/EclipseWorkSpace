package Strategy_Pattern;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackbehavior = new MuteQuack();
		flybehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I am a Mallard Duck !!");
	}
}
