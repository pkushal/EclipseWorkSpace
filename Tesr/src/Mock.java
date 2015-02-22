import java.util.Arrays;

public class Mock {
	public static void main(String[] args) {
		System.out.println(isAnagram("   Ku          sfffal", "k us h a l  "));
	}

	public static boolean isAnagram(String s1, String s2) {
		char[] first = s1.trim().toLowerCase().replaceAll("\\s+", "")
				.toCharArray();
		char[] second = s2.trim().toLowerCase().replaceAll("\\s+", "")
				.toCharArray();
		Arrays.sort(first);
		Arrays.sort(second);
		if (first.length != second.length) {
			return false;
		} else {
			for (int i = 0; i < first.length; i++) {
				if (first[i] != second[i]) {
					return false;
				}
			}
		}
		return true;
	}
}