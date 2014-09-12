package complexNumbers;

public class Extraction {
	private static int real1 = 0;
	private static int real2 = 0;
	private static int imag1 = 0;
	private static int imag2 = 0;
	private static int middle = 0;
	private static int sign = 1;
	private static int start = 0;
	
	public static void open(){
		System.out.println();
		System.out.println("So, the complex numbers are " + ComplexMain.complex1 + " and " + ComplexMain.complex2);
		System.out.println();
		
		real1= Integer.parseInt(ComplexMain.complex1.substring(0, extract(ComplexMain.complex1)));
		int imagq =  Integer.parseInt(ComplexMain.complex1.substring(extract(ComplexMain.complex1)+1,ComplexMain.complex1.length()-1));
		imag1 = imagq*sign;
		real2 = Integer.parseInt(ComplexMain.complex2.substring(0, extract(ComplexMain.complex2)));
		int imagw =  Integer.parseInt(ComplexMain.complex2.substring(extract(ComplexMain.complex2)+1,ComplexMain.complex2.length()-1));
		imag2 = imagw*sign;
			
		if (imag1+imag2 <0 ){
			String sum = Integer.toString(real1 + real2)+ Integer.toString(imag1 + imag2)+ "j"; 
			System.out.println("Sum of " + ComplexMain.complex1 + " and " + ComplexMain.complex2 + " is "+ sum);
			
		}
		else{
			String sum = Integer.toString(real1 + real2)+"+"+ Integer.toString(imag1 + imag2)+ "j"; 
			System.out.println("The sum of " + ComplexMain.complex1 + " and " + ComplexMain.complex2 + " is "+ sum);
		}	
		
		if (imag1-imag2 <0){String diff = Integer.toString(real1 - real2)+ Integer.toString(imag1-imag2)+ "j"; 
		System.out.println("Difference of " + ComplexMain.complex1 + " and " + ComplexMain.complex2 + " is "+ diff);
		}
		else{String diff = Integer.toString(real1 - real2)+ "+"+Integer.toString(imag1-imag2)+ "j"; 
		System.out.println("The difference of " + ComplexMain.complex1 + " and " + ComplexMain.complex2 + " is "+ diff);
		}
		}
	

	public static int extract(String str){
			sign(str);
			for (int i = start; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '+'){
				middle = i;
				sign = 1;
				
				break;
			}
			else if (c=='-'){
				middle = i;
				sign = -1;
				break;
			}
		}
		return middle;	
	}
	
	public static void  sign(String str){
		if (str.charAt(0) == '-'){
			start = 1;
		}
		else{
			start = 0;
		}
	} 
}





