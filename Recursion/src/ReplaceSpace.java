public class ReplaceSpace {
	private static String input = "KP   KUSH                    ";
	private static char[] ans = new char[input.length()];
//	private static int space;

	public static void main(String[] args) {
		ans = input.toCharArray();
		replaceSpace(ans, 9);
//		int add = space * 3;
//		System.out.println(add);
		for (int i = 0; i < input.length(); i++) {
			System.out.print(ans[i]);
		}
	}

	public static void print(int i) {
		System.out.println("checking for " + ans[i] + " i = " + i);
		for (int j = 0; j < input.length(); j++) {
			System.out.print(ans[j]);
		}
		System.out.println("\n____________________________");

	}

	public static void replaceSpace(char[] ans, int len) {
		int space =0;
		for (int i = 0; i < 15; i++) {
			if (ans[i] != ' ') {
//				print(i);
			} else {
//				print(i);
				for (int j = len + (space * 2) + 1; j >= i + 3; j--) {
					ans[j] = ans[j - 2];
				}

				ans[i] = '%';
				ans[i + 1] = '2';
				ans[i + 2] = '0';
				
				space++;
			}
		}

	}
}