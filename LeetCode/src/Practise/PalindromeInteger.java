package Practise;

public class PalindromeInteger {
	public static void main(String[] args) {
		PalindromeInteger pi = new PalindromeInteger();
		System.out.println("Palindrome : " + pi.isPalindrome(-2147447412));
		System.out.println((int)'1');
	}

	public boolean isPalindrome(int x) {
		int len = findLength(x);
		int front = (int) Math.pow(10, len);
		if (x < 0)
			front *= -1;
		int back = 10;
		if (x < 0)
			back *= -1;
		while (!(Math.abs(back) > Math.abs(front))) {
			System.out.println("front: " + (x / front) % 10 + " back: "
					+ (x % back) / (back / 10));
			if ((x / front) % 10 != (x % back) / (back / 10)) {
				return false;
			} else {
				front /= 10;
				back *= 10;
			}
		}
		return true;
	}

	public int findLength(int x) {
		if (x < 0) {
			int count = 0;
			while (true) {
				if (!(x > -10)) {
					x /= 10;
					count++;
				} else
					break;
			}
			return count;
		} else {
			return (int) Math.log10(x);
		}
	}
}
