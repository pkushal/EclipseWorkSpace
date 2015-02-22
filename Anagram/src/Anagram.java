import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("   Ku          shal", "k us h a l  "));
	}

	public static boolean isAnagram(String s1, String s2) {
		String first = s1.trim().toLowerCase().replaceAll("\\s+", "");
		String second = s2.trim().toLowerCase().replaceAll("\\s+", "");
		System.out.println("first: " + first + " and second: " + second);
		int array[];
		if (first.length() == second.length()) {
			array = new int[256];
		} else {
			return false;
		}
		for (int i = 0; i < first.length(); i++) {
			array[(int) first.charAt(i)] = 1;
		}
		for (int i = 0; i < second.length(); i++) {
			if (array[(int) second.charAt(i)] != 1) {
				return false;
			}
		}
		return true;
	}

}