public class LCM {
	private static int a = 12;
	private static int b = 48;
	private static int c = 120;
	private static int lcm = 1;

	public static void main(String[] args) {
		System.out.println("The LCM of " + a+ ", " + b+ " and " + c + " is : "+findLcm(a, b, c));
	}

	public static int findLcm(int a, int b, int c) {
		int min;
		if (a <= b)
			min = a;
		else
			min = b;
		if (min > c)
			min = c;

		for (int i = 2; i <= min; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				lcm = i;
				findLcm(a / i, b / i, c / i);
			
				
			}
		}

		return lcm;
	}
}
