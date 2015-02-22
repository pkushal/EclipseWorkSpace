package Practise;

import java.util.Arrays;

public class NextPermutation {
	public static void main(String[] args) {
		int[] nums = { 4,2,0,2,3,2,0};
		display(nums);
		System.out.println("Expected: [4,2,0,3,0,2,2]");
		NextPermutation n = new NextPermutation();
		n.nextPermutation(nums);
		display(nums);
	}

	private static void display(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();
	}

	public void nextPermutation(int[] num) {
		int len = num.length;
		swap(num, len - 1, len - 2);
	}

	public int[] swap(int[] nums, int i, int j) {
		if (i == 0) {
			Arrays.sort(nums);
			return nums;
		}
		if (nums[i] > nums[j] ) {
			int temp = nums[j];
			nums[j] = nums[i];
			nums[i] = temp;
			return sort(nums, j + 1);
		} else {
			if (j - 1 >= 0) {
				swap(nums, i, j - 1);
			} else {
				swap(nums, i - 1, i - 2);
			}
		}
		return nums;
	}

	public int[] sort(int[] nums, int j) {
		if (j == nums.length - 1)
			return nums;
		int minIndex = Integer.MAX_VALUE;
		int comp = Integer.MAX_VALUE;
		for (int i = j; i < nums.length; i++) {
			if (nums[i] < comp) {
				minIndex = i;
				comp = nums[minIndex];
			}
		}
		int temp = nums[j];
		nums[j] = nums[minIndex];
		nums[minIndex] = temp;
		if (j + 1 <= nums.length - 1) {
			sort(nums, j + 1);
		}

		return nums;
	}
}
