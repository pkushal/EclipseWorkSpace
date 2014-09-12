public class LongestPalindrome {

	private static String subword;
	private static String word;

	public static void main(String[] args) {
		word = "ysask";
		System.out.println(recursion(word));

	}

	public static String recursion(String word) {
		String longest = "";
		String newword;
		int len = word.length();
		for (int i = 0; i <= len - 1; i++)
			for (int j = i; j < len; j++) {

				newword = word.substring(i, j + 1);

				if (newword.equals(reverse(newword))) {
						if (newword.length() > longest.length()) {
						longest = newword;
					}
				}
				
			}
		return longest;
	}

	// this gives the flipped version of the given word
	public static String reverse(String word) {

		if (word.length() == 1)
			return word;
		else {
			subword = word.substring(word.length() - 1)
					+ reverse(word.substring(0, word.length() - 1));
		}

		return subword;
	}
}
