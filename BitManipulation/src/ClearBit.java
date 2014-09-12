public class ClearBit {
	public static void main(String[] args) {
		System.out.println(clearBit(18, 1)); // 18 is 10010
		System.out.println("clearBitsMSBthroughI "
				+ clearBitsMSBthroughI(75, 3));
		System.out.println("clearBitsIthrough0 " + clearBitsIthrough0(75, 3));
		}

	public static int clearBit(int num, int i) {
		int mask = ~(1 << i);
		return num & mask; // result should be 10000 which is 16
	}

	public static int clearBitsMSBthroughI(int num, int i) {
		int mask = (1 << i) - 1; // kya simple raicha yo pani...suppose num =
									// 1001011 cha bhane i lai shift garda
									// 0001000 huncha and teslai -1 garda
									// 0000111 huncha ani finally mask garne
		return num & mask;
	}

	public static int clearBitsIthrough0(int num, int i) { // -1 le sabai bit haru lai 11111 banai dincha
		int mask = ~(-1 >>> (31 - i)); // shift by (31-i) places... >>> operator
										// will shift the initial 1 as well as
										// that sign bit...This gives us a
										// sequence of 1s followed by i 0s bits
		System.out.println(mask); // yo ta -16 po aaudo raicha ta... um 2's
									// compliment haru hera
		return num & mask;  // 31-i le i ota bits bahek sabai lai zero banai dincha ani tes pachi flip garne ta ho ni

	}
}
