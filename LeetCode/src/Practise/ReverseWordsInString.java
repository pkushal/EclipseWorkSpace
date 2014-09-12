package Practise;

public class ReverseWordsInString {
	public static void main(String[] args) {
		ReverseWordsInString r = new ReverseWordsInString();
		// System.out.println(r.trimString("    "));
		System.out.println(r.reverseWords(r.trimString("")));
		// System.out.println(r.reverseWordsFast(r.trimString(" 1")));
	}

	public String reverseWordsFast(String s) {
		String[] parts = s.trim().split("\\s+");
		/**
		 * . / is the escape character and what we want is the /s only In most
		 * regex dialects there are a set of convenient character summaries you
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

	public String reverseWords(String s) {

		int length = s.length();
		int space = 0;
		int stop = length - 1;
		int hasCharacter = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = length - 1; i >= 0; i--) {
			if (Character.isWhitespace(s.charAt(i))) {
				space = i;
				append(sb, s, i + 1, stop, true);
				stop = space - 1;
			} else {
				hasCharacter++;
			}

		}
		append(sb, s, 0, space - 1, false);
		if (hasCharacter == 0) {
			return "";
		} else if (space == 0) {
			return s;

		} else {
			return sb.toString();
		}
	}

	public void append(StringBuffer sb, String s, int start, int stop, boolean b) {
		if (start > stop) {
			return;
		}
		sb.append(s.substring(start, stop + 1));
		if (b) {
			sb.append(" ");
		}
	}

	public String trimString(String s) {
		int length = s.length();
		if (length == 0) {
			return "";
		}
		int start = 0;
		while (s.charAt(start) == ' ' && start < length) {
			if (start < length - 1) {
				start++;
			} else {
				break;
			}
		}
		int last = s.length() - 1;

		while (s.charAt(last) == ' ' && last >= 0 && start != length - 1) {
			last--;
		}

		String trimmed;
		if (start == 0 && last == 0) {
			trimmed = s;
		} else {
			trimmed = s.substring(start, last + 1);
		}
		return trimmed;
	}
}
