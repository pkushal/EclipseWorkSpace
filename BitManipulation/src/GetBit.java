public class GetBit {
	public static void main(String[] args) {
		System.out.println(getBit(16, 4));
	}

	public static boolean getBit(int num, int i) {
		return ((num & (1 << i)) != 0); // simple raicha... i le chai kun chai
										// bit position ho herna khojeko
		// so tyo bit position ma chai 1 lai shift garne st aru position ma zero
		// huncha ani finally given num sanga AND garne
		// ani 1 raicha bhane true aaucha hoina bhane false..yaha 16 bhaneko
		// 10000 ho so 1 lai 4 bit le shift garda 10000 huncha ani tini haru ko
		// and operation true huncha
	}
}
