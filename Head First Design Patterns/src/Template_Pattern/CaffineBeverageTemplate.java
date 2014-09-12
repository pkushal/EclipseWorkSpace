package Template_Pattern;

public abstract class CaffineBeverageTemplate {
	/**
	 * The brew and addCondiment method has been made so general so that all the
	 * subclasses (Concrete Classes) could use it. 
	 * prepare() is considered as the template method. 
	 * Methods that need to be supplied by the subclass is defined abstract
	 */

	final void prepare() {
		boilWater();
		brew();
		pourInCup();
		addCondiment();
	}

	abstract void brew();
	abstract void addCondiment();
	/**
	 * The boilWater and pourInCup is the common methods that all the subclasses
	 * (Concrete Classes) will use. They are also defined as final because I
	 * donn want the subclasses to override it
	 */
	public final void boilWater() {
		System.out.println("Boiling Water...");
	}

	public final void pourInCup() {
		System.out.println("Pouring the beverage in cup...");
	}
}
