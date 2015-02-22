package Practise;

public class SetMatrixZeros {

		private static int[][] matrix = { { 0} };

		public static void main(String[] args) {
			SetMatrixZeros set = new SetMatrixZeros();

			display(matrix);

			set.setZeroes(matrix);

			display(matrix);
		}

		public void setZeroes(int[][] matrix) {
			int row = matrix.length;
			int col = matrix[0].length;

			boolean hasRowAZero = false;
			boolean hasColumnAZero = false;
			// Looping in the first row, matrix[0]
			for (int j = 0; j < col; j++) {
				if (matrix[0][j] == 0) {
					hasRowAZero = true;
					break;
				}
			}
			// Looping in the first column, matrix[0]
			System.out.println();
			for (int j = 0; j < row; j++) {
				if (matrix[j][0] == 0) {
					hasColumnAZero = true;
					break;
				}
			}
			System.out.println("Has rows: " + hasRowAZero + " has column: "
					+ hasColumnAZero + "\n");
			// Noting the indexes in column and row which are zero

			for (int i = 1; i < row; i++) {
				for (int j = 1; j < col; j++) {
					if (matrix[i][j] == 0) {
						matrix[i][0] = 0;
						matrix[0][j] = 0;
					}
				}
			}

			System.out.println("After noting the indexes for the zeros");
			display(matrix);

			// Finally making the change in the given matrix Phase 1
			for (int i = 1; i < col; i++) {
				if (matrix[0][i] == 0) {
					for (int j = 1; j < row; j++) {
						matrix[j][i] = 0;
					}
				}
			}
			for (int i = 1; i < row; i++) {
				if (matrix[i][0] == 0) {
					for (int j = 1; j < col; j++) {
						matrix[i][j] = 0;
						System.out.println("matrix "+i + " "+j);
					}
				}
			}
			display(matrix);
			// Ultimately handling the first row and first column
			if (hasRowAZero) {
				for (int i = 0; i < col; i++) {
					matrix[0][i] = 0;
				}
			}
			if (hasColumnAZero) {
				for (int i = 0; i < row; i++) {
					matrix[i][0] = 0;
				}
			}
			System.out.println("Should be done by now....fingers crossed");

		}

		public static void display(int[][] matrix) {
			System.out.println();
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print("\t" + matrix[i][j]);
				}
				System.out.println();
			}
			System.out.println("   ---------------------------");
		}
	}

