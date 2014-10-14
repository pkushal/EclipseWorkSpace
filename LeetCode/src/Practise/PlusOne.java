package Practise;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
	public static void main(String[] args) {
		int[] digits = { 9, 9, 9 };
		PlusOne p = new PlusOne();
		p.plusOne(digits);
		List<Integer> arr = new ArrayList<Integer>();

	}

	public int[] plusOne(int[] digits) {
		int value;
		int carry = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			value = digits[i] + carry;
			System.out.println("value: " + value);
			if (value > 9) {
				digits[i] = value % 10;
				carry = value / 10;
			} else {
				digits[i] = value;
				carry = 0;
			}
		}
		System.out.println("Carry " + carry);

		if (carry != 0) {
			int[] newDigits = new int[digits.length + 1];
			newDigits[0] = carry;
			for (int i = 1; i < newDigits.length; i++) {
				newDigits[i] = digits[i - 1];
			}

			for (int i = 0; i < newDigits.length; i++) {
				System.out.print("\t" + newDigits[i]);
			}
			System.out.println();
		}

		for (int i = 0; i < digits.length; i++) {
			System.out.print("\t" + digits[i]);
		}
		System.out.println();
		System.out.println("-----------------");

		return digits;
	}
}
