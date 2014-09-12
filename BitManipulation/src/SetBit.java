public class SetBit {
	public static void main(String[] args) {
		System.out.println(setBit(16, 4));
	}

	public static boolean setBit(int num, int i) {
		return ((num | (1 << i)) != 0); // simple raicha... i le chai kun chai
										// bit position ho herna khojeko
		// so tyo bit position ma chai 1 lai shift garne st aru position ma zero
		// huncha ani finally given num sanga OR garne
		// ani 1 raicha bhane true aaucha hoina bhane false..just think sajilo
		// cha
	}
}
