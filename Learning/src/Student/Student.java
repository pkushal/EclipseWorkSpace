package Student;
public abstract class Student {

	protected String name;
	protected int age;
	protected int startDate;

	public Student() {

		name = "Name is just a Name";          //donot give the data type here
		age = 0;
		startDate = 0;
	}

//	public Student(String names, int ages, int starts) {
//
//		this.name = names;
//		this.age = ages;
//		this.startDate = starts;
//	}
	
	public abstract void setStartDate ();

	public void changeName(String newName) {
		this.name = newName;
	}

	public void getName() {
		System.out.println(this.name);
		
	}
	
	public void setAge(int newAge){
		this.age = newAge;
	}
	
	public void getAge() {
		System.out.println(this.age);
	
	}
	
	public void getStartDate(){
		System.out.println(this.startDate);
	}
	
	public void notice (Student nah){
		nah.getName();
		
	}
	

	
}
