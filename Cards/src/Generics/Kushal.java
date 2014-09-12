package Generics;

public class Kushal implements Summable<Kushal>{
	
	Integer a;
	
	public Kushal(Integer a){
		this.a = a;
	}
	
	public Integer getValue(){
		return a;
	}
	
	@Override
	public Kushal sum(Kushal e) {
		return new Kushal(a + e.getValue());
	}
	
	public String toString(){
		return String.valueOf(a);
	}

}
