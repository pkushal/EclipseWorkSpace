package BinaryHeap;

/**
 * Sorting using the binary heap represented using array
 * 
 * @author Kushal
 * 
 */
public class HeapSort {
	private static int[] val = { 3, 7, 9, 10, 2, 6, 1, 5, 8, 4 };
	public static int N;

	public static void main(String[] args) {
		heapSort(val);
	}

	public static void heapSort(int[] val) {
		display(val, 0);
		buildHeapFirstPass(val);
		System.out.println("Heap sorted array: ");
		display(val, 0);
		System.out.println("Second Pass array: ");
		secondPass(val);
		display(val, 0);
	}

	public static void buildHeapFirstPass(int[] val) {
		N = val.length;
		for (int k = (N / 2) - 1; k >= 0; k--) {
			sink(k, val);
		}
	}

	public static void secondPass(int[] heap) {
		N = N - 1;
		while (N >= 0) {
			exch(val, 0, N); // swap gare pachi N ko size pani restrict gareko
								// jasto
			N = N - 1;
			sink(0, val);
		}
	}

	public static void sink(int k, int[] val) {
		while ((2 * k) + 1 <= N) {
			int j;
			if (k == 0) {
				j = 1;
			} else {

				j = (2 * k);
			}
			if (j < N && less(val, j, j + 1)) {
				j++; // choosing the larger child here defines for the right
						// child(2k+1)
			}
			if (!less(val, k, j))
				break; // checking if the larger of the child is greater than
						// the parent k
			exch(val, k, j);
			k = j;
		}
	}

	public static boolean less(int[] val, int a, int b) {
		if (val[a] <= val[b])
			return true;
		else
			return false;
	}

	public static void exch(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void display(int[] a, int k) {
		for (int i = k; i < a.length; i++) {
			System.out.print(a[i] + ":" + " \t");
		}
		System.out.println("");
	}

}
