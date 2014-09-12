package Employee;

public class HolidayMain {
	// Employee [] test;
	public static void main(String[] args) {
		// TODO make employees and take holidays, and calculate salary at the
		// end of the month

		Employee first = new FullTime("Ram", 95);

		Employee second = new PartTime("Shyam", 105);

		takeHoliday(first, 1);
		takeHoliday(first, 2);
		takeHoliday(second, 4);
		takeHoliday(second, 1);

		first.endOfMonth(); // expected salary is 4975.00
		second.endOfMonth();// expected salary is 2975.00

	}

//	public static void doSth() {
//
//	}

	public static void takeHoliday(HolidayInterface h, int days) { // input nai
																	// type of
																	// HolidayInterface
																	// cha, so
																	// getFamilyCount
																	// bhanne
																	// method
																	// chai call
																	// hunna.YO CHAI STATIC METHOD HO
		
		h.takeHoliday(days); // YO CHAI INSTANT METHOD HO....FULLTIME AND PART TIME BHITRA KO WALA
		//h.getFamilyMembersCount() yo chai implement hunna kina bhane, it is not the HolidayInteface type. 
	}

}
