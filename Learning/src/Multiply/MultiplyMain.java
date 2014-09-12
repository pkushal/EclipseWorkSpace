package Multiply;

import java.util.Scanner;

public class MultiplyMain {
	private static String first_str = null;
	private static String second_str = null;
	private static int first = 0;
	private static int second = 0;
	private static int length = 0;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a first number to multiply: ");
		first_str = in.nextLine();
		System.out.print("Enter the second number: ");
		// Scanner inp = new Scanner(System.in);
		second_str = in.nextLine();

		first = Integer.parseInt(first_str);
		second = Integer.parseInt(second_str);

		int multiply = first * second;

		length = (String.valueOf(multiply)).length();

		in.close();
		// inp.close();
		System.out.println();
		printSpaces(length - first_str.length(), " ");
		System.out.println(first);
		printSpaces(length - second_str.length(), " ");
		System.out.println(second);
		printSpaces(length, "-");
		System.out.println();
		compute();
	}

	public static void printSpaces(int l, String s) {
		for (int i = 0; i < l; i++)
			System.out.print(s);
	}

	public static void compute() {

		for (int i = second_str.length() - 1, k = 0; i >= 0; i--, k++) {
			int num = Integer.parseInt(second_str.substring(i, i + 1));
			int value = num * first;
			printSpaces(length - (String.valueOf(value)).length() - k, " ");
			System.out.println(value);
		}
		printSpaces(length, "-");
		System.out.println();
		System.out.println(first*second);
	}

}
