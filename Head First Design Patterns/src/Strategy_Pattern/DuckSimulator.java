package Strategy_Pattern;

public class DuckSimulator {
	public static void main(String[] args) {
		Duck model = new MallardDuck();
		model.performFly();
		model.performQuack();
		// Now setting the behavoir of the Mallard duck dynamically
		System.out.println("Dynamically changed Mallard duck");
		model.setFlyBehavior(new FlyNoWay());
		model.setQuackBehavior(new Squeak());
		model.performFly();
		model.performQuack();
	}
}
