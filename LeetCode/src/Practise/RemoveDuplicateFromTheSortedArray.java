package Practise;

public class RemoveDuplicateFromTheSortedArray {
	public static void main(String[] args) {
		int[] A = { 1, 1, 2,2,2, 4,4, 5, 5, 5, 6, 7,9,9 };
		RemoveDuplicateFromTheSortedArray r = new RemoveDuplicateFromTheSortedArray();
		System.out.println("The new length of the array is : "
				+ r.removeDuplicates(A));
	}

	public int removeDuplicates(int[] A) {
		
		if(A.length==0){
			return 0;
		}
		
		int swap = 0;
		int presentValue = A[0];
		
		for (int i = 1; i < A.length; i++) {
			System.out.println("for i= " + i);
			if (presentValue != A[i]) {
				swap++;
				A[swap] = A[i];
				presentValue=A[swap];
			} 
		}

		return swap;
	}
}
