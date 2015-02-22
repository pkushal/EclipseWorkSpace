package Practise;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs = { "aa", "dga" };
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		System.out.println(lcp.longestCommonPrefix(strs));

	}

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		else if (strs.length == 1)
			return strs[0];
		StringBuffer sb = new StringBuffer();

		int v = 0;

		while (v < strs[0].length()) {
			for (int i = 1; i < strs.length; i++) {
				if (v > strs[i].length()-1 || strs[0].charAt(v) != strs[i].charAt(v)) {
					v = strs[0].length();
					break;
				}
			}
			if (v != strs[0].length()) {
				System.out.println("appended : " + strs[0].charAt(v));
				sb.append(strs[0].charAt(v));
				v++;
			}
		}
		return sb.toString();
	}
}
