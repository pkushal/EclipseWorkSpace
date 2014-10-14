package Practise;

public class InsertPosition {
	public static void main(String[] args) {
		InsertPosition i = new InsertPosition();
		int[] A = {1,3,5,6};
		System.out.println(i.searchInsert(A, 0));
	}

	public int searchInsert(int[] A, int target) {
		return binarySearchSinceThisIsASortedArray(A, 0, A.length - 1, target);
	}

	public int binarySearchSinceThisIsASortedArray(int[] A, int start,
			int stop, int target) {
		int mid = 0;
		while (stop > start && start >= 0) {
			mid = start + (stop - start) / 2;
			System.out.println("Start: " + start + " stop: " + stop + " mid: "
					+ mid);
			if (A[mid] == target)
				return mid;
			else if (target > A[mid]) {
				start = mid + 1;
			} else {
				System.out.println("arejlafsj");
				stop = mid;
			}
		}
		System.out.println("Finally,out of the while loop, Start: " + start
				+ " stop: " + stop);
		if (start == stop) {
			if (A[start] == target) {
				System.out.println("target found");
				return start;
			} else if (target > A[start]) {
				System.out.println("Yes target is greater than the A[start]");
				return start + 1;
			} else {
				System.out.println("wala");
				return start;
			}
		}
		System.out.println("This should not be displayed");
		return start;
	}
}
