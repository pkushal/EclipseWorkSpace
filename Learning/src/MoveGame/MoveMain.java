package MoveGame;

public class MoveMain {

	private static boolean result = false;

	public static void main(String[] args) {

		System.out.println(" Welcome to 4*4 matrix game !!");
		System.out.println("Generating the random sequence ");
		Display.display();

		while (!result) {
			Display.interact();
			Move.validateAndMove();
			result = Move.check();
		}

	}

}

// do not use magic numbers...use variables...make them final something
// zero ko position lai harek time loop bata check garnu pardaina...change gare pachi kei value ma store gara
// For loop haru ma kunai specific condition check garnu parma...break rakha...like in for loop of check method. 
