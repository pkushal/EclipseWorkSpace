package Adaptor_Pattern;

/**
 * Here Target is DuckBehaviour and adaptor is Turkey adaptor and adaptee is
 * Turkey. All the method implemented are of Duck and inside it is mapped to the
 * Turkey
 * 
 * @author Kushal
 * 
 */
public class TurkeyAdaptor implements DuckBehaviour {
	TurkeyBehaviour turkey;

	public TurkeyAdaptor(TurkeyBehaviour turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gooble();

	}

	@Override
	public void fly() {
		turkey.fly();

	}
}
