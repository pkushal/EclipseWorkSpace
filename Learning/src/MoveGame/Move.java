package MoveGame;

public class Move {

	public static int[][] value = { { 12, 8, 7, 3 }, { 14, 9, 1, 0 },
			{ 4, 6, 10, 11 }, { 5, 15, 13, 2 } };
	private static int[][] standard = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 },
			{ 8, 9, 10, 11 }, { 12, 13, 14, 15 } };
	
	public static boolean flag = false;
	public static int xz;
	public static int yz;
	public static int xm;
	public static int ym;
	public static boolean invalid = false;

	public static void validateAndMove() {
		getZeroLoc();
		getDestinationLoc();
		computeValidity();

		while (invalid) {
			Display.display();
			System.out.println("``````````Invalid Move, Try Again```````````` ");
			//Display.interact();
			//Move.validateAndMove();
			invalid = false;
		}
	}

	public static void getZeroLoc() {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				if (value[i][j] == 0) {
					xz = i; // finding the position of the Zero
					yz = j; // and storing in xz and yz
					//System.out.println("position of zero is " + xz + " and "
						//	+ yz);
				}
			}
		}
	}

	public static void getDestinationLoc() {
		for (int k = 0; k <= 3; k++) {
			for (int l = 0; l <= 3; l++) {
				if (value[k][l] == Display.select) {
					xm = k; // finding the position of the selected value
					ym = l; // and storing in xm and ym

					//System.out.println("position of " + Display.select + " is "
						//	+ xm + " and " + ym);
				}
			}
		}
	}

	public static void computeValidity() {
		int xdiff = Math.abs(xz - xm);
		int ydiff = Math.abs(yz - ym);

		if (xdiff <= 1 && ydiff <= 1) {
			value[xz][yz] = Display.select;
			value[xm][ym] = 0;
		} else {
			invalid = true;
		}

	}

	public static boolean check() {
		

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				if (standard[i][j] == value[i][j]) {
					flag = true;
				} else{
					flag = false;
					break;
				}
			}
		}
		
		if (flag == true) {
			Display.display();
			System.out.println("Congratulations !!! ");
		} else {
			Display.display();
			System.out.println("Next Move...");
		}
		return flag;
	}
}
