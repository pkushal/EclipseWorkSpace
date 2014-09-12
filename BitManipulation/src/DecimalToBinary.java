public class DecimalToBinary {
	private static StringBuffer ans= new StringBuffer();
	public static void main(String[] args) {

		System.out.println(toBinary(0.1));
	}

	public static String toBinary(double dec) {
		
		if (dec == .0) {
			return ans.toString();
		}

		double temp = dec * 2;
		ans.append((int) temp);  //http://cs.furman.edu/digitaldomain/more/ch6/dec_frac_to_bin.htm
		if (temp >= 1) {
			dec = temp - 1;
		} else {
			dec = temp;
		}
		
		toBinary(dec);

		return ans.toString();
	}
}
