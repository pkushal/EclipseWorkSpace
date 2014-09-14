package Practise;

import java.util.ArrayList;

/**
 * Not good solution... will not work if the given binary number is too large
 * for the int or long .... better do it with the string manipulation
 * 
 * @author Kushal
 * 
 */
public class BinaryAddition {
	public static void main(String[] args) {
		BinaryAddition b = new BinaryAddition();
		b.binarySum("10100000100100110", "11010100101110111000110011");
	}

	public String binarySum(String a, String b) {
		long sumBinary = stringToDecimal(a) + stringToDecimal(b);
		if (sumBinary == 0) {
			return "0";
		} else {
			System.out.println(arrayToString(decimalToBinary(sumBinary)));
			return arrayToString(decimalToBinary(sumBinary));
		}
	}

	public long stringToDecimal(String s) {
		long length = s.length();
		long result = 0;
		for (int i = 0; i < length; i++) {
			if (s.charAt(i) == '1') {
				result += Math.pow(2, length - 1 - i);
			}
		}
		System.out.println(result);
		return result;
	}

	public ArrayList<Long> decimalToBinary(long n) {
		ArrayList<Long> arr = new ArrayList<>();
		while (n != 1) {
			long rem = n % 2;
			arr.add(rem);
			n = n / 2;
		}
		long val = 1;
		arr.add(val);
		return arr;
	}

	public String arrayToString(ArrayList<Long> arr) {
		StringBuffer sb = new StringBuffer();
		for (int i = arr.size() - 1; i >= 0; i--) {
			sb.append(arr.get(i));
		}
		return sb.toString();
	}
}
