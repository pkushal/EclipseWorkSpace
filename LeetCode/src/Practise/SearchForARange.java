package Practise;

public class SearchForARange {
	public class Solution {
		public int[] searchRange(int[] A, int target) {
			int[] range = new int[2];
			range[0] = searchLeft(A, 0, A.length - 1, target);
			range[1] = searchRight(A, 0, A.length - 1, target);
			return range;
		}

		int searchLeft(int[] A, int start, int end, int target) {
			while (start <= end) {
				int mid = start + (end - start) / 2;
				if (A[mid] == target) {
					if (mid == 0)
						return 0;
					if (A[mid] - 1 == target) {
						end = mid - 1;
					} else {
						return mid;
					}
				} else {
					if (A[mid] > target) {
						end = mid - 1;
					} else {
						start = mid + 1;
					}
				}
			}
			return -1;
		}

		int searchRight(int[] A, int start, int end, int target) {
			while (start <= end) {
				int mid = start + (end - start) / 2;
				if (A[mid] == target) {

					if (end == A.length - 1)
						return A.length - 1;

					if (A[mid] + 1 == target) {
						start = mid + 1;
					} else {
						return mid;
					}
				} else {
					if (A[mid] > target) {
						end = mid - 1;
					} else {
						start = mid + 1;
					}
				}
			}
			return -1;

		}
	}
}
