public class RemoveDuplicate {
	public static void main(String[] args) {
		removeDuplicateString("abracadabra");
	}

	public static void removeDuplicateString(String inp) {
		// ASCII ko array generate and initialize gareko

		int[] ascii = new int[256];
		StringBuffer wala = new StringBuffer();
		for (int i = 0; i < ascii.length; i++) {
			ascii[i] = 0;
		}
		for (int i = 0; i < inp.length(); i++) {
			int temp = inp.charAt(i);
			ascii[temp]++;
			if (ascii[temp] == 1) { //pahila aayeko chaina bhane matrai append garcha natra gardiana
				wala.append(inp.charAt(i));
			}
		}
		System.out.println("Given input : " + inp + " and the trimmed output is : " + wala);
	}

}