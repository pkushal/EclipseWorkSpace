package BinaryHeap;

public class BinaryHeap {
	private static int[] val = { 3, 7, 9, 10, 2, 6, 1, 5, 8, 4 };
	public static int N;
	public static int[] heap;

	public static void main(String[] args) {
		display(val, 0);
		createBinaryHeap(val);
		display(heap, 1);
		System.out.println(" Now doing one Max delete operation ..");
		delete();
	}

	public static void createBinaryHeap(int[] val) {
		N = 0;
		heap = new int[val.length + 1];
		// heap ma value haleko
		for (int i = 0; i < val.length; i++) {
			insert(val[i]);
		}
	}

	public static void insert(int k) {
		heap[++N] = k;
		swim(N);
	}

	public static void swim(int k) {
		// less(k/2,k) ko meaning root(k/2) is less than the child (k) is true
		while (k > 1 && less(k / 2, k)) {
			exch(heap, k, k / 2);
			k = k / 2;
		}
	}

	public static void delete() {
		int max = heap[1];
		exch(heap, 1, N--);
		sink(1);
		// heap[N+1]= null; // to prevent loitering
		heap[N + 1] = -1;
		System.out.println("Maximum in the heap " + max
				+ " is deleted. New heap looks like: ");
		display(heap, 1);
	}

	public static void sink(int k) {
		while (2 * k <= N) {
			int j = 2 * k;
			if (j < N && less(j, j + 1)) {
				j++; // choosing the larger child here defines for the right
						// child(2k+1)
			}
			if (!less(k, j))
				break; // checking if the larger of the child is greater than
						// the parent k
			exch(heap, k, j);
			k = j;
		}
	}

	public static boolean less(int a, int b) {
		if (heap[a] <= heap[b])
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
