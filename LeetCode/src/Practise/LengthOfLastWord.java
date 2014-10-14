package Practise;

public class LengthOfLastWord {
	public static void main(String[] args) {
		LengthOfLastWord l = new LengthOfLastWord();
		System.out.println(l.lengthOfLastWord(""));

	}

   	public int lengthOfLastWord(String s) {
		int count = 0;
		String trimmed = s.trim();
		for (int i = trimmed.length() - 1; i >= 0; i--) {
			if (trimmed.charAt(i) != ' ') {
				count++;
			} else {
			    if (count == 0) {
					return count;
				}
				break;
			}
		}
		return count;
	}
}

