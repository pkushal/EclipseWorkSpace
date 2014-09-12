//Given A and B, find the number of bit to be swapped to make B equal to A
public class BitToSwap {
	public static void main(String[] args) {
		System.out.println("There need to be "+findBitNumber(19, 29)+ " flips.");
	}

	public static int findBitNumber(int A, int B) {
		int flipbits = 0;
		while (A != 0) {
			if ((A & 1) != (B & 1)) {
				flipbits++;
				System.out.println("Flip");
				A = A >> 1;
				B = B >> 1;
			} else {
				System.out.println("No flip");
				A = A >> 1;
				B = B >> 1;
			}
		}
		return flipbits;
	}
}
