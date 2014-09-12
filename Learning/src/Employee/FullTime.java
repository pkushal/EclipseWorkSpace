package Employee;

public class FullTime extends Employee {

	public FullTime(String n, int i) { // yes le suru ma empty constructor
										// Employee class ma khojcha, tyo
										// chaina, so Employee ma jastai gari
										// define garnu parcha
		super(n, i);  //Superclass ko constructor call gareko
	}

	

	@Override
	public double cutOff() {
		if (this.remainingDays() <= 0) {
			salary = salary - ((this.remainingDays()) * -25);
		}
		return salary;

	}

}
