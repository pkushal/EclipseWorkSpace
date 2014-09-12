package Practise;

public class ThreeWayPartitioning {
	static int[] arr = { 1, 2, 0, 0, 2, 1, 2, 2, 1, 0 };

	public static void main(String[] args) {
		ThreeWayPartitioning t = new ThreeWayPartitioning();
		t.display(arr);
		t.sort(arr);
	}

	public void sort(int[] arr) {
		int lastZero = -1;
		int firstTwo = arr.length;

		for (int i = 0; i < firstTwo;) {

			if (arr[i] == 1) {
				i++;
			} else if (arr[i] == 0) {
				lastZero++;
				swapUtility(lastZero, i, arr);
			} else {// two encounter gareko condition
				firstTwo--;
				/**
				 * while condition check garnu pardaina...recursively affai
				 * check huncha while (arr[firstTwo] == 2) { firstTwo--; }
				 */

				swapUtility(i, firstTwo, arr);
			}
			display(arr);

		}

	}

	public void swapUtility(int a, int b, int[] arr) {
		if (a == b)
			return;
		arr[a] = arr[a] ^ arr[b];
		arr[b] = arr[a] ^ arr[b];
		arr[a] = arr[a] ^ arr[b];
	}

	public void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\t" + arr[i]);
		}
		System.out.println();
	}
}
