// given a integer, find the smallest and largest integer that can have same number of ones a the given integer in binary format
public class LargestAndSmallest {
	public static void main(String[] args) {
		findExtremes(170); // 1011 in binary
	}

	public static void findExtremes(int value) {
		int preserve = value;
		int count = 0;
		while (value != 0) { // value is 1011 in binary
			if ((value & 1) == 1) {
				value = (value >> 1);
				count += 1;
			} else {
				value = (value >> 1);
			}
		}
		System.out.println("Number of ones in " + preserve + " is " + count);
		int k = 0;
		int min = 0;
		while (k < count) {
			min = min + (int) Math.pow(2, k);
			k++;
		}
		System.out.println("The minmum value with "+ count +" ones is " + min);

		// Finding out if this is a 64 bit or 32 bit system
		int maxval = -1;
		int bit = 0;
		while (maxval != 0) {
			bit++;
			maxval = maxval >>> 1;

		}
		System.out.println("\nUmm...this is a " + bit + " system.");
		int max = 0;
		for (int l = bit - count - 1; l < bit - 1; l++) {
			max = max + (int) Math.pow(2, l);
		}
		System.out.println("\nSo the maximum value with "+ count +" ones in " + bit+" system is " + max );
	}
}
