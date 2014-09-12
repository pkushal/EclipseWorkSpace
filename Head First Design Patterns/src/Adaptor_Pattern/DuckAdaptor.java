package Adaptor_Pattern;

/**
 * Here target is TurkeyBehaviour and adaptor is Duck adaptor and adaptee is
 * Duck Duck is wrapped in the Turkey behaviour.
 * 
 * @author Kushal
 * 
 */
public class DuckAdaptor implements TurkeyBehaviour {
	DuckBehaviour duck;

	public DuckAdaptor(DuckBehaviour duck) {
		this.duck = duck;
	}

	@Override
	public void gooble() {
		duck.quack();

	}

	@Override
	public void fly() {
		duck.fly();
	}

}
