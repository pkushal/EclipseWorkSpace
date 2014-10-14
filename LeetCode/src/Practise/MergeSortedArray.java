package Practise;

public class MergeSortedArray {
	public static void main(String[] args) {
		int[] A = { 1, 3, 5, 7, 100, 100, 100, 100 };
		int[] B = { 2, 4, 6, 8 };
		MergeSortedArray m = new MergeSortedArray();
		m.merge(A, 8, B, 4);
	}

	public void merge(int A[], int m, int B[], int n) {
		// I will have two utility methods.
		// The first method will find where in array A, I will need to put the
		// element of B
		// The second method, called insert will insert the value at the given
		// index in A
		// Logic: take each element from B and find where it needs to in A and
		// insert in A.
		System.out.println("given sorted arrays A and B: ");
		display(A);
		display(B);
		for (int i = 0; i < n; i++) {
			A = insert(A, findIndex(A, B[i]), B[i]);
		}
		System.out.println("Merged sorted array: ");
		display(A);
	}

	// This method will return the index position where each value of B should
	// go in A.
	public int findIndex(int[] A, int target) {
		return binarySearchSinceThisIsASortedArray(A, 0, A.length - 1, target);
	}

	public int binarySearchSinceThisIsASortedArray(int[] A, int start,
			int stop, int target) {
		int mid = 0;
		while (stop > start && start >= 0) {
			mid = start + (stop - start) / 2;
			if (A[mid] == target)
				return mid;
			else if (target > A[mid]) {
				start = mid + 1;
			} else {
				stop = mid;
			}
		}
		if (start == stop) {
			if (A[start] == target) {
				return start;
			} else if (target > A[start]) {
				return start + 1;
			} else {
				return start;
			}
		}
		return start;
	}

	// This method will the insert the given value at the particular index in A
	public int[] insert(int[] A, int index, int value) {
		int presentIndex = A.length - 1;
		if (index > presentIndex) {
			A[presentIndex + 1] = value;
		} else {
			for (int i = index; i < presentIndex + 1; i++) {
				A[index + 1] = A[index];
			}
			A[index] = value;
		}

		return A;
	}

	// Just a display method
	public void display(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print("\t" + A[i]);
		}
		System.out.println();
		System.out.println("----------------------------------------------");
	}

}
