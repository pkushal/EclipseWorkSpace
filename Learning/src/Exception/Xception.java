package Exception;
import java.util.Scanner;

public class Xception {

	public Scanner in = new Scanner(System.in);
	public int input;

	public static void main(String[] args) {
		Xception obj = new Xception(); // for calling a non-static methods from
										// the Static main method...make an
										// object
		System.out.print("Please enter a even number: ");
		try {
			obj.run();
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			
		} finally {
			obj.in.close();
		}

	}

	public void run() throws NumberFormatException {
		input = in.nextInt();
		if (input >= 25) {
			throw new NumberFormatException(" Number Greater than 24");
		} else
			System.out.println("Haha, you have entered a number less than 25");
	}

	public void close() {
		in.close();
	}
}
