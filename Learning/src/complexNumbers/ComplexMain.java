package complexNumbers;

import java.util.Scanner;

public class ComplexMain {
	public static String complex1;
	public static String complex2;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first complex number (a+bj) to be computed: ");
		complex1 = in.next();
		//System.out.println();
		System.out.print("Enter the second complex number (c+dj)to be computed: ");
		complex2 = in.next();
		in.close();
		Extraction.open();
	}

}
//flaws:
//rigid bhayo program
//make it loose; loosely connected is the key
// just make a complex class and client should be able to use this class to compute different instances of the complex objects
//while creating the object the user will make the object as per the constructor and invoke different methods the to do the manipulations


//use the concept of the OOP.
