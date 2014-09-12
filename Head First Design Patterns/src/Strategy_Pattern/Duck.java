package Strategy_Pattern;

public abstract class Duck {
	FlyBehavior flybehavior;
	QuackBehavior quackbehavior;

	public Duck() {

	}

	public void performFly() {
		flybehavior.fly();
	}

	public void performQuack() {
		quackbehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks can fly !!");
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flybehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackbehavior = qb;
	}
}
