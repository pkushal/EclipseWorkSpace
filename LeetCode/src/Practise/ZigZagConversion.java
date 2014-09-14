package Practise;

public class ZigZagConversion {
	public static void main(String[] args) {
		ZigZagConversion z = new ZigZagConversion();
		System.out.println("Final result: " + z.convert("A", 1));
	}

	public String convert(String s, int nRows) {
		if(nRows ==1){
			return s;
		}
		int gap = nRows - 2;
		// Created the StringBuffer for the each rows
		StringBuffer[] sb = new StringBuffer[nRows];
		for (int row = 0; row < nRows; row++) {
			sb[row] = new StringBuffer();
		}

		for (int row = 0; row < nRows; row++) {
			// for the first and the last element in the row. It moves by the
			// constant jump of (nRows + gap)
			if (row == 0 || row == nRows - 1) {
				for (int i = row; i < s.length(); i += (nRows + gap)) {
					sb[row].append(s.charAt(i));
				}
			} else {
				// for the elements other than first and the last elements
				int middle = 2 * row;
				for (int i = row; i < s.length(); i += (nRows + gap)) {
					sb[row].append(s.charAt(i));

					int intermediate = i + (nRows + gap) - middle;
					System.out.println(intermediate);
					System.out.println("length: " + s.length());
					if (intermediate < s.length()) {
						sb[row].append(s.charAt(intermediate));
					}
				}
			}
		}

		// finally appending all the StringBuffer
		System.out.println("sb[0]: " + sb[0]);
		for (int combo = 1; combo < nRows; combo++) {
			System.out.println("sb[combo]: " + sb[combo]);
			sb[0].append(sb[combo]);
		}
		return sb[0].toString();
	}
}

/**
 * public String convert(String s, int nRows) { // Created the StringBuffer for
 * the each rows StringBuffer[] sb = new StringBuffer[nRows]; for (int row = 0;
 * row < nRows; row++) { sb[row] = new StringBuffer(); } // Checking if the rows
 * are even or odd // if even, all the columns are filled // if odd, the odd
 * columns will have only one element and the even // columns will have more
 * than one element if (nRows % 2 == 0) { for (int start = 0; start < nRows;
 * start++) {
 * 
 * for (int i = start; i < s.length(); i += nRows) {
 * sb[start].append(s.charAt(i)); } } // for only one row } else if (nRows == 1)
 * { return s; } else { // for odd number of rows for (int start = 0; start <
 * nRows; start++) {
 * 
 * if (start == nRows / 2) { // for the middle of the odd number of rows for
 * (int i = start; i < s.length(); i += (nRows - ((nRows / 2) + 1)) + 1) {
 * sb[start].append(s.charAt(i)); } } else { // for rows other than the middle
 * of the odd number of rows for (int i = start; i < s.length(); i += nRows + 1)
 * {
 * 
 * sb[start].append(s.charAt(i)); } } }
 * 
 * } System.out.println("first: " + sb[0]); System.out.println("second: " +
 * sb[1]); System.out.println("third: " + sb[2]);
 * 
 * for (int combo = 1; combo < nRows; combo++) { sb[0].append(sb[combo]); }
 * 
 * return sb[0].toString(); }
 * 
 * 
 * 
 * // for the elements other than first and the last elements int jump =
 * findTheJumpValue(row, gap, nRows);
 * System.out.println("Jump garnu parne value: " + jump); for (int i = row; i <
 * s.length(); i += jump) { sb[row].append(s.charAt(i)); }
 * 
 * 
 * public int findTheJumpValue(int rowNumber, int gap, int nRows) { int
 * remaining = nRows - rowNumber - 1; int newGap = gap + 1 - rowNumber; return
 * remaining + newGap; }
 * 
 * 
 * 
 */
