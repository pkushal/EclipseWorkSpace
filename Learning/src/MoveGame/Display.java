package MoveGame;

import java.util.Scanner;

public class Display {
	public static int select;

	public static void display() {
		for(int i = 0; i<=3; i++){
			System.out.println();
			for(int j = 0; j<=3; j++){
				System.out.print("    ");
				System.out.print(Move.value[i][j] + " ");
			}
		}
		System.out.println();
		System.out.print("  ");
		System.out.println("------------------------");
	}
	
	static Scanner in = new Scanner(System.in);
	
	public static void interact() {
		System.out.print("Enter the value to swap with: ");
		select = in.nextInt(); 
		
	}
}
