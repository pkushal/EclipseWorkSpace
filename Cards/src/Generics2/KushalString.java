package Generics2;

public class KushalString implements Summable<KushalString>{
	String s;
	public KushalString(String s){
		this.s = s;
	}
	
	public String getValue(){return s;}
	@Override
	public KushalString sum(KushalString e) {
		return new KushalString(s +" + " + e.getValue());
	}
	
	public String toString(){
		return s;
	}

}
