package Practise;

public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.reverseWords(" a b "));
		System.out.println(s.reverseWordsFast(" a b "));
		
		System.out.println("   kushal   ".trim());
	}

	public String reverseWords(String s) {
		String result = "";
		String[] splitStr = s.split(" ");
		/**
		 * s.split le space bata split garcha...but doesn't puts the space in
		 * the array. However if there is more than one space then it puts that
		 * space in the array as well
		 */
		for (String str : splitStr) {
			if (str.length() != 0)
				result = str + " " + result;
		}
		return result.trim();
	}

	public String reverseWordsFast(String s) {
		String[] parts = s.trim().split("\\s+");
		/**
		 * . / is the escape character and what we want is the /s only 
		 * In most regex dialects there are a set of convenient character summaries you
		 * can use for this kind of thing - these are good ones to remember:
		 * 
		 * \w - Matches any word character.
		 * 
		 * \W - Matches any nonword character.
		 * 
		 * \s - Matches any white-space character.
		 * 
		 * \S - Matches anything but white-space characters.
		 * 
		 * \d - Matches any digit.
		 * 
		 * \D - Matches anything except digits.
		 * 
		 * A search for "Regex Cheatsheets" should reward you with a whole lot
		 * of useful summaries
		 * 
		 */
		String out = "";
		if (parts.length > 0) {
			for (int i = parts.length - 1; i > 0; i--) {
				out += parts[i] + " ";
			}
			out += parts[0];
		}
		return out;

	}
}
