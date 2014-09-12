public class MainTest {
	static int[] arr = { 0, 0, 0 };

	public static void main(String[] args) {
		MainTest main = new MainTest();
		// System.out.println(main.isHollow(arr));
		// System.out.println(main.isConsecutiveFactored(1 * 3 * 5 * 7 * 11 *
		// 13* 14));
		System.out.println(main.isTwinPrime(7));

	}

	int isTwinPrime(int n) {
		// Considering 0 and 1 as not Prime numbers
		if (n < 2) {
			return 0;
		}
		boolean nminus2 = true, nplus2 = true;
		
		int maxLimit = (int) Math.sqrt((double) (n + 2)) + 1;
		
		for (int i = 2; i < maxLimit; i++) {
			if (n % i == 0) {
				return 0;
			}
			if ((n - 2) % i == 0) {
				nminus2 = false;
			}
			if ((n + 2) % i == 0) {
				nplus2 = false;
			}
		}
		if (nminus2 == true || nplus2 == true) {
			return 1;
		} else {
			return 0;
		}
	}

	int isConsecutiveFactored(int n) {
		if (n < 1) {
			return 0;
		}
		int maxLimit = (int) Math.sqrt((double) n) + 1;
		for (int i = 2; i < maxLimit; i++) {
			if (n % (i * (i + 1)) == 0) {
				return 1;
			}
		}
		return 0;
	}

	int isHollow(int[] a) {
		int lengthOfArray = a.length;
		int before = 0;
		int after = 0;
		int zeros = 0;
		if (lengthOfArray < 3) {
			return 0;
		}

		int i = 0;

		while (i < lengthOfArray && a[i] != 0) {
			before++;
			i++;
		}
		while (i < lengthOfArray && a[i] == 0) {
			zeros++;
			i++;
		}
		while (i < lengthOfArray && a[i] != 0) {
			after++;
			i++;
		}
		if (after == before && zeros > 2 && i == lengthOfArray) {
			return 1;
		} else
			return 0;

	}
}
