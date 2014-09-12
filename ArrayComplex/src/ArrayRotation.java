public class ArrayRotation {
	static int[] val = { 0, 1, 2, 3, 4, 5, 6, 7 };

	public static void main(String[] args) {
		System.out.println("The given array is: ");
		display();
		// rotate(3);
		rotateusinggcd(5);
		System.out
				.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		display();

	}

	public static void rotateusinggcd(int shift) {
		int gcd = gcd(val.length, shift);
		int pos;
		int temp;
		for (int i = 0; i < gcd; i++) {
			pos = i;
			temp = val[pos];
			for (int j = 0; j < val.length / gcd; j++) {
				pos = (pos + shift) % val.length;
				int swap = val[pos];
				val[pos] = temp;
				temp = swap;
			}
		}
	}

	public static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}
	}

	public static void display() {
		for (int i = 0; i < val.length; i++) {
			System.out.print(val[i] + "\t");
		}
		System.out
				.println("\n----------------------------------------------------------");
	}
}
