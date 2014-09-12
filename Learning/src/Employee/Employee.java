package Employee;

public abstract class Employee implements HolidayInterface { // "abstract" le
																// chai
																// HolidayInteface
																// ko sabai
																// methods
																// implement
																// garnu naparos
																// bhanera
																// gareko
	protected String name;
	protected int id;
	protected double salary;
	protected int holidays;

	public Employee(String n, int i) {
		this.name = n;
		this.id = i; // if ID number is greater than 100 full time else part
						// time employee
		this.salary = 0.0;
		this.holidays = 0;
		initialize(); // Constructor ma pani function call garna milcha

	}

	public int getFamilyMembersCount() { // HolidayMain ma yo function implement
											// hunna bcoz takeHoliday ma
											// HolidayInterface call bhayeko
											// cha, jun ma yo method chaina
		return 5;
	}

	private void initialize() {
		if (this.id >= 100) {
			this.salary = 5000.0;
			this.holidays = 4;
		} else {
			this.salary = 2000;
			this.holidays = 2;
		}
	}

	public String getName() {
		return name;
	}

	@Override
	public void endOfMonth() {

		System.out.println("Hey " + this.getName()
				+ " your end of the month Salary is " + this.cutOff());
	}
	
	@Override
	public int remainingDays() {
		return holidays;
	}

	@Override
	public void takeHoliday(int t) {
		holidays = holidays - t;
		this.cutOff();
	}

}
