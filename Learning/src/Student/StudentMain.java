package Student;


public class StudentMain {
		
public static void main(String[] args) {
		
		Student kushal = new Electrical();
		kushal.getName();
		kushal.getAge();
		
		System.out.println();
		
		Electrical kpp = new Electrical("Kushal", 26, 7);
		
		kpp.getName();
		kpp.getAge();
		kpp.getStartDate();
		
		kpp.changeName("Mr. Kushal");
		kpp.setAge(25);
		
		System.out.println();
		
		kpp.getName();
		kpp.getAge();
		kpp.getStartDate();
		
		System.out.println();
		
		kpp.notice(kpp);
		kpp.notice(kushal);
		
		
	}


}
