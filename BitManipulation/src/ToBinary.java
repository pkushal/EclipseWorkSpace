public class ToBinary {
	public static void main(String[] args) {
		toBinary(12);
	}

	public static void toBinary(int d) {
		StringBuffer sb = new StringBuffer(); // yesle oolto display gareko cha so i made a string for correct display below
		String dec= "";
//		sb.append(d&1);
		while (d != 0) {
			int v=d&1;
			sb.append(v);
			dec = v + dec;
			d = (d >> 1);
		}
		System.out.println(sb.toString());
		System.out.println(dec);
	}
}
