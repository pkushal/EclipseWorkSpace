public class Combination {

	public static void main(String[] args) {
		permutation("abc");
	}

	public static void permutation(String str) {
		permutation("", str);
	}

	private static void permutation(String prefix, String str) {
//		System.out.println("prefix : " + prefix + "  str  : " + str);
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++) {
//				System.out.println("i : "+ i + " and  n : " + n);
				permutation(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1, n));
			}
		}
	}
}
// System.out.println(inp.substring(i, j));
// }
// }
//