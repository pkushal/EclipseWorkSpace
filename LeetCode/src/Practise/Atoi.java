package Practise;

public class Atoi {
	public static void main(String[] args) {
		System.out.println(atoi("-2147483648"));
	}

	public static int atoi(String str) {
		int len = str.length();
		if (len == 0)
			return 0;
		int value = 0;
		int decimalPlace = 1;
		int flaws = 0;
		int signIndex = 0;
		boolean space = false;
		for (int i = len - 1; i >= 0; i--) {
			if (str.charAt(i) == '-' || str.charAt(i) == '+') {
				signIndex = i;
				flaws++;
			}
			if (value > 0 && str.charAt(i) == ' ')
				space = true;
			if (str.charAt(i) != ' ' && flaws < 1) {
				int store = str.charAt(i) - '0';
				if (store > 9) {
					value = 0;
					decimalPlace = 1;
				} else if (space == true) {
					return 0;
				} else {
					value += store * decimalPlace;
					decimalPlace *= 10;
				}
			}
		}
		System.out.println("Value: " + value + " absolute: "
				+ Math.abs((double) value));
		if (Math.abs((double) value) > Integer.MAX_VALUE
				&& str.charAt(0) != '-') {
			return Integer.MAX_VALUE;
		}
		if (Math.abs((double) value) > Math.abs(Integer.MIN_VALUE)
				&& str.charAt(0) == '-') {
			return Integer.MIN_VALUE;
		}

		if (flaws > 1)
			return 0;
		if (flaws == 1) {
			if (str.charAt(signIndex) == '-') {
				return value * -1;
			} else {
				if (Math.abs((double) value) > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				} else
					return value;
			}
		} else
			return value;
	}
}

/*
 * public static double atoi(String str) { int len = str.length(); int[] value =
 * new int[2]; int index = 1; int decimalPlace = 1; boolean dot = false; int
 * secondPart = 1; int lowerLimit = (str.charAt(0) == '-') ? 1 : 0; for (int i =
 * len - 1; i >= lowerLimit; i--) { value[index] += (str.charAt(i) - '0') *
 * decimalPlace; decimalPlace *= 10; System.out.println("Index: " + index +
 * " value : " + value[index] + " and decimal for place: " + decimalPlace);
 * while (!dot) { if (str.charAt(i) != '.') { index = 0; dot = true; secondPart
 * = decimalPlace; decimalPlace = 1;
 * System.out.println("Dot bhettiyo hai : at index i= " + i +
 * " ani tyo secondpart ko value: " + secondPart); } } } if (dot) { // decimal
 * place cha raicha double ret = (value[0] + (value[1] / secondPart)); if
 * (lowerLimit == 1) { return ret * -1; } else { return ret; } } else { //
 * decimal place chaina if (lowerLimit == 1) { return (value[1] * -1); } else
 * return value[1]; } }
 */