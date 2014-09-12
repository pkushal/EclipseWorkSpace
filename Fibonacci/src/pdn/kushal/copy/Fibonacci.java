package pdn.kushal.copy;

import java.util.Scanner;

public class Fibonacci {
	static Scanner in = new Scanner(System.in);
	static int limit = 0;

	public static void main(String[] args) {
		System.out.println("\n Enter the range for the Fibonacci Series: ");

		while (in.hasNextInt()) {
			limit = in.nextInt();
			int ans = fibonacci(limit);
			System.out.println(ans);
		}
	}

	static int fibonacci(int n) {
		
		if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
