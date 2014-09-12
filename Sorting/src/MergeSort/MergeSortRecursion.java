package MergeSort;

public class MergeSortRecursion {
	private static int[] values = { 12, 4, 113, 2, 111, 1, 374, 3 };

	public static void main(String[] args) {
		display(values);
		sort(values);
		display(values);
	}

	public static void sort(int[] values) {
		int[] aux = new int[values.length];
		sort(values, aux, 0, values.length - 1);
	}

	public static void sort(int[] values, int[] aux, int lo, int hi) {
		int mid = lo + (hi - lo) / 2;
		if (hi <= lo)
			return;
		sort(values, aux, lo, mid);
		sort(values, aux, mid + 1, hi);
		merge(values, aux, lo, hi, mid);
	}

	public static void merge(int[] values, int[] aux, int lo, int hi, int mid) {

		for (int k = 0; k <= hi; k++) {
			aux[k] = values[k];
		}

		int i = lo;
		int j = mid + 1;

		for (int k = lo; k <= hi; k++) {

			if (i > mid) {
				values[k] = aux[j++];

			} else if (j > hi) {
				values[k] = aux[i++];

			} else if (aux[i] < aux[j]) {
				values[k] = aux[i++];

			} else if (aux[i] > aux[j]) {
				values[k] = aux[j++];

			} else if (aux[i] == aux[j]) {
				values[k] = aux[i++];

			}
		}
	}

	public static void display(int[] val) {
		for (int i = 0; i < val.length; i++) {
			System.out.print(val[i] + " : ");
		}
		System.out.println();
	}
}
