package MergeSort;

public class MergeSortBottomUp {
	private static int[] values = { 2, 4, 23, 84, 1, 65, 34, 76, 84, 33, 98, 3,
			2, 7, 45, 16 };

	public static void main(String[] args) {
		display(values);
		sort(values);
		display(values);
	}

	public static void sort(int[] values) {
		int[] aux = new int[values.length];
		/**
		 * the variable sz increases as 1,2,4,8,16,32...
		 * In this bottom up approach we pass through an array and merge the sub array of size 1 and then repeat the process for size of 2, 4, 8...
		 */
		for (int sz = 1; sz < values.length; sz=sz+sz) {
			for (int j = 0; j < values.length-sz; j=j+sz+sz) {
				merge(values, aux, j, j+sz-1, Math.min(j+sz+sz-1, values.length-1)); // simple raicha ekchoti copy ma lekhera socha na
			}
		}

	}

	/**
	 * the merge method does the normal merging of the sorted arrays. 
	 * @param values: It can be treated as two sorted sub array that needs to be sorted 
	 * @param aux
	 * @param lo
	 * @param mid
	 * @param hi
	 */

	public static void merge(int[] values, int[] aux, int lo, int mid, int hi) {
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
