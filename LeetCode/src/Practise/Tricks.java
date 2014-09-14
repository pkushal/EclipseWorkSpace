package Practise;

import java.util.ArrayList;
import java.util.List;

public class Tricks {

	public static void main(String[] args) {
		Tricks t = new Tricks();
		// t.reverse(10000007);
		int[] val = {4,3,6,3,6,5};
		t.removeElement(val, 5);
	}

	public int reverse(int x) {

		boolean sign = false;
		List<Integer> arr = new ArrayList<>();

		if (x < 0) {
			sign = true;
			System.out.println(sign);
		}
		x = Math.abs(x);
		while (x >= 10) {
			arr.add(x % 10);
			x = x / 10;
		}
		arr.add(x);

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

		int length = arr.size();
		int revOrder = 0;

		for (int j = length - 1; j > 0; j--) {
			revOrder += arr.get(length - 1 - j) * Math.pow(10, j);
		}
		revOrder = revOrder + arr.get(length - 1);
		if (sign) {
			revOrder = revOrder * -1;
			System.out.println(revOrder);
			return revOrder;
		} else {
			System.out.println(revOrder);
			return revOrder;
		}
	}

	public int removeElement(int[] A, int elem) {
		disp(A);
		int count = 0;
		int stop = A.length - 1;
		if(stop==0 && A[0]==elem){
			return 0;
		}

		for (int i = 0; i < stop; i++) {
			if (A[i] == elem) {
				count++;
				while (A[stop] == elem && stop > i) {
					stop--;
				}
				int temp = A[i];
				A[i] = A[stop];
				A[stop] = temp;
				disp(A);
			}
		}
		if (count == 0) {
			System.out.println(stop + 1);
			return stop + 1;
		}
		System.out.println(stop);
		return stop;
	}

	private void disp(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print("\t" + A[i]);
		}
		System.out.println();
	}
}
