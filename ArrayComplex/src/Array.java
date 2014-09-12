public class Array {
	static int[] pi = { 2, 0, 3, 1 };
	static char[] ch = { 'A', 'B', 'C', 'D' };
	static int[] visited = { 0, 0, 0, 0 };

	public static void main(String[] args) {

		displayint(pi);
		System.out.println();
		display(ch);
		System.out.println("-------------------------");
		modify();
	}

	public static void modify() {

		for (int i = 0; i < ch.length; i++) {

			if (visited[i] != 0)
				continue;

			int pos = pi[i]; // pi[0] = 2
			char temp = ch[i]; // A
			int start = pos; // 2

			do {
				System.out.println("Pos: " + pos + " temp: " + temp
						+ "   start: " + start);
				// Swapping gareko
				visited[pos] = 1;

				char swap = temp; //A
				temp = ch[pos]; // C
				ch[pos] = swap; // C ko thau ma A aayo
				pos = pi[pos]; // aba C lai lanu parne thau bhaneko 3

				display(ch);
			} while (pos != start);
		}

	}

	public static void displayint(int[] ch) {
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + "\t");
		}
		System.out.println("\n");
	}

	public static void display(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + "\t");
		}
		System.out.println();
	}
}
