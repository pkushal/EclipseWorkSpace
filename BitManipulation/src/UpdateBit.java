public class UpdateBit {
	public static void main(String[] args) {
		System.out.println(updateBit(20, 2, 1)); // ok nai cha
	}

	public static int updateBit(int num, int i, int v) {
		int mask = ~(1 << i);
		return (num & mask) | (v << i); // first ma tyo specific bit lai clear
										// garne ani tyo position ma desired
										// value lai shift garne ani finally or
										// garne...simple
	}
}
