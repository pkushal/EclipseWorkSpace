public class MathsR {
	public static void main(String[] args) {

		System.out.println("The result is " + compute("5+2355/5*10-50")); // answer
																			// should
																			// be
																			// 5
	}

	public static int compute(String input) {

		CharSequence p = "+";
		CharSequence m = "-";
		CharSequence mu = "*";

		if (input.matches("[0-9]+")) // checking if the input string has only
										// digits
										// and no other operations
			return Integer.parseInt(input);
		else if (input.contains(p)) {
			String[] parts = input.split("\\+", 2); // checking the plus
													// condition
			String input1 = parts[0]; // SPLIT 1
			System.out.println("Split 1 : " + input1);
			String input2 = parts[1]; // SPLIT 2
			System.out.println("Split 2 : " + input2);

			return compute(input1) + compute(input2);
		} else if (input.contains(m)) {
			String[] parts = input.split("\\-", 2); // checking the minus
													// condition
			String input1 = parts[0]; // SPLIT 1
			System.out.println("Split 1 : " + input1);
			String input2 = parts[1]; // SPLIT 2
			System.out.println("Split 2 : " + input2);

			return compute(input1) - compute(input2);
		} else if (input.contains(mu)) {
			String[] parts = input.split("\\*", 2); // checking the
													// multiplication
													// condition
			String input1 = parts[0]; // SPLIT 1
			System.out.println("Split 1 : " + input1);
			String input2 = parts[1]; // SPLIT 2
			System.out.println("Split 2 : " + input2);

			return compute(input1) * compute(input2);
		} else {
			String[] parts = input.split("\\/", 2); // checking the division
													// condition
			String input1 = parts[0]; // SPLIT 1
			System.out.println("Split 1 : " + input1);
			String input2 = parts[1]; // SPLIT 2
			System.out.println("Split 2 : " + input2);

			return compute(input1) / compute(input2);
		}
	}
}
