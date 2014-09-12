public class GCD {
	public static void main(String[] args) {
		System.out.println(gcd(6, 4));
	}

	public static int gcd(int a, int b) {
		if (a % b == 0) {
			System.out.println("The greatest common divisor is : " + b);
			return b;
		} else {
			return gcd(b, a % b);
		}
	}
}
