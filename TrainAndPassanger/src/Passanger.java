/*
 * Define a class Passenger having the fields name (String), age (int), gender (char : M/F), weight (int). Define 2 constructors for this class, one with parameters and 
 * one which has no parameters.
 */
public class Passanger {
	private String name;
	private char gender;
	private int weight;
	private int age;

	public Passanger(String name, char gender, int weight, int age) {
		this.name = name;
		this.gender = gender;
		this.weight = weight;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Passanger [name=" + name + ", gender=" + gender + ", weight="
				+ weight + ", age=" + age +"]";
	}

	public Passanger() {
		System.out.println("Default constructor created...");
	}
}
