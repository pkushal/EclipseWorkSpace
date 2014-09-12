package QuickSort;

public class QuickSort {
	private static int[] values = { 44, 75, 23, 43, 55, 12, 64, 77, 33 , 453};

	public static void main(String[] args) {
		display(values);
		quickSort(values, 0, values.length - 1);
		display(values);
	}

	/**
	 * The quickSort method has a recursive definition when the sub array length
	 * equals to one or less
	 * 
	 * @param values
	 * @param lo
	 * @param hi
	 */
	public static void quickSort(int[] values, int lo, int hi) {
		if (hi <= lo)
			return;
		int j = partition(values, lo, hi); // j is the position not the value
		quickSort(values, lo, j - 1);
		quickSort(values, j + 1, hi);
	}

	public static int partition(int[] values, int lo, int hi) {
		int i = lo+1;
		int j = hi;
		while (true) {
			while (less(values[i], values[lo])) {
				if (i == hi)
					break;
				else {
					i++;
				}
			}
			while (less(values[lo], values[j])) {
				if (j == lo)
					break;
				else j=j-1;
			}
			if (i >= j) {
				break;
			}
			// Swap
			exchange(values, i, j);
		}
		exchange(values, lo, j);
		return j;
	}

	private static void exchange(int[] values, int i, int j) {
		int temp = values[i];
		values[i] = values[j];
		values[j] = temp;

	}

	public static boolean less(int v1, int v2) {
		if (v1 < v2) {
			return true;
		} else
			return false;
	}

	public static void display(int[] val) {
		for (int i = 0; i < val.length; i++) {
			System.out.print(val[i] + " : ");
		}
		System.out.println();
	}
}