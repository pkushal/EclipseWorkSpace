package Student;


public class Electrical extends Student{
	
	public Electrical(){
		super();
	}
	
	public Electrical(String n, int a, int s){
		name = n;
		age = a;
		startDate = s;
	}
	
	@Override
	public void setStartDate() {
		this.startDate = 6;
	}
	
//	public static void main(String[] args) {
//		
//		Student kushal = new Electrical();
//		kushal.getName();
//		kushal.getAge();
//		
//		System.out.println();
//		Electrical kpp = new Electrical("Kushal", 26, 7);
//		
//		kpp.getName();
//		kpp.getAge();
//		kpp.getStartDate();
//		kpp.changeName("Mr. Kushal");
//		kpp.setAge(25);
//		System.out.println();
//		kpp.getName();
//		kpp.getAge();
//		kpp.getStartDate();
//		System.out.println();
//		notice(kpp);
//		notice(kushal);
//		
//		
//	}

		

}
