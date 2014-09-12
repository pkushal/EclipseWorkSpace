public class LongestPalindromeUsingRecursion {

	private static String word;
	private static String subword;
	private static String longest = "";

	public static void main(String[] args) {
		word = "kqweewqsasp";
		System.out.println("Final found: " + recursion(word));
	}

	public static String recursion(String word) {
		if (reverse(word).equals(word)) {
			if (word.length() > longest.length()) {
				longest = word;
			}
			return longest;
		} else {

			if (recursion(word.substring(0, word.length() - 1)).length() > recursion(
					word.substring(1, word.length())).length())
				return recursion(word.substring(0, word.length() - 1));
			else
				return recursion(word.substring(1, word.length()));

		}
	}

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



//if (first.equals(second)) {
//	longest = first;
//} else {
//	if (first.length() > 1) {
//
//		if (Common(first.substring(0, first.length() - 1), second)
//				.length() > Common(first.substring(1, first.length()),
//				second).length()) {
//			return Common(first.substring(0, first.length() - 1),
//					second);
//		} else {
//
//			return Common(first.substring(1, first.length()), second);
//		}
//	}
//	else{
//		return "";
//	}
//
//}
//return longest;



//
//if (first.equals(second)) {
//	longest = first;
//} else {
//	if (first.length() > 1) {
//
//		if (Common(first.substring(0, first.length() - 1), Common(second,first.substring(0, first.length()-1)))
//				.length() > Common(first.substring(1, first.length()),
//						Common(second,first.substring(1, first.length()))).length()) {
//			return Common(first.substring(0, first.length() - 1),
//					second);
//		} else {
//
//			return Common(first.substring(1, first.length()), second);
//		}
//	}
//	else{
//		return "";
//	}
//
//}
//return longest;


//
//if (first.equals(second)) {
//	longest = first;
//} else {
//	if (first.length() > 1) {
//
//		String temp1 = first.substring(0, first.length() - 1);
//		String temp2 = first.substring(1, first.length());
//
//		if (Common(temp1, Common(second,temp1)).length() > Common(temp2, Common(second,temp2)).length()) {
//			return Common(temp1, Common(second,temp1));
//		} else {
//
//
//			
//			
//			return Common(temp2, Common(second,temp2));
//		}
//	} else {
//		return "";
//	}
//
//}
//return longest;

