/*
 * Also define a class Train in which there are the following functions. Note that there are no fields in the class Train.
 - int getTotalWeight(Passenger[] passengers) - returns the total weight of all the passengers in the input
 - int countChildren(Passenger[] passengers) - returns the number of children in the input passengers. A child is defined as age 12 or below
 - int countGender(Passenger[] passengers, boolean male) - returns the number of males if true else returns the number of females. A male has the gender 'M' and a female 'F'
 - Passenger[] addPassenger(Passenger[] passengers, Passenger passenger1) - returns a Passenger[] which contains all the passengers and also passenger1.
 */

public class Train {

	public int getTotalWeight(Passanger[] passangers) {
		int totalWeight = 0;
		for (Passanger pass : passangers) {
			totalWeight = totalWeight + pass.getWeight();
		}
		return totalWeight;
	}

	public int countChildren(Passanger[] passangers) {
		int count = 0;
		for (Passanger pass : passangers) {
			if (pass.getAge() < 12) {
				count++;
			}
		}
		return count;
	}

	public int countGender(Passanger[] passangers, boolean male) {
		int count = 0;
		for (Passanger pass : passangers) {
			if (pass.getGender() == 'm') {
				count++;
			}
		}
		if (male == true)
			return count;
		else
			return passangers.length - count;
	}

	public void showPassanger(Passanger[] passangers) {
		for (Passanger pass : passangers) {
			System.out.println(pass);
		}
	}
}
