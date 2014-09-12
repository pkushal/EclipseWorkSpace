public class LargestCommonString {

	private static String first = "kushal";
	private static String second = "pkusis";

	public static void main(String[] args) {

		System.out.println("so the common substring turns out to be:   "
				+ lcs(first, second));

	}

	public static String lcs(String first, String second) {
		if (first.equals(second)) {
			return first;
		} else if (first.isEmpty() || second.isEmpty()) {
			return "";
		} else {
			String[] v = new String[4];
			v[0] = lcs(first, second.substring(0, second.length() - 1));
			v[1] = lcs(first, second.substring(1, second.length()));
			v[2] = lcs(first.substring(0, first.length() - 1), second);
			v[3] = lcs(first.substring(1, first.length()), second);

			String temp = v[0];
			for (int i = 1; i < v.length; i++) {
				if (temp.length() < v[i].length())
					temp = v[i];
			}
			return temp;

		}

	}

}
