package Practise;

public class BinaryAdditionFromString {
	public static void main(String[] args) {
		BinaryAdditionFromString b = new BinaryAdditionFromString();
		b.addBinary("11", "1");
	}

	public String addBinary(String a, String b) {
		StringBuffer first = new StringBuffer(a);
		StringBuffer second = new StringBuffer(b);
		StringBuffer add = new StringBuffer();
		// making length of both the strings equal by zero padding
		while (first.length() != second.length()) {
			if (first.length() > second.length()) {
				second.insert(0, 0);
			} else {
				first.insert(0, 0);
			}
		}
		int len = first.length() - 1;
		int carry = 0;
		for (int i = len; i >= 0; i--) {
			int sum = addition(first.charAt(i)) + addition(second.charAt(i))
					+ carry;
			if (sum == 3) {
				carry = 1;
				add.insert(0, 1);
			} else if (sum == 2) {
				carry = 1;
				add.insert(0, 0);
			} else if (sum == 1) {
				carry = 0;
				add.insert(0, 1);
			} else {
				carry = 0;
				add.insert(0, 0);
			}
		}
		if (carry == 1) {
			add.insert(0, 1);
		}
		System.out.println(add.toString());
		return add.toString();
	}

	// for converting the character to integer
	int addition(char a) {
		switch (a) {
		case '0':
			return 0;
		case '1':
			return 1;
		default:
			return -1;
		}
	}
}
