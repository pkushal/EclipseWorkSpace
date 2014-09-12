public class ReplaceZeroInMatrix {
	private static int[][] mat = new int[4][4];

	public static void main(String[] args) {
		// Matrix form gareko
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				mat[i][j] = i + j;
			}
		}
		mat[0][0] = 2;
		mat[1][2] = 0;
		mat[3][1] = 0;
		// Matrix formed

		print(mat);
		replace(mat, 4, 4);
	}

	public static void print(int[][] mat) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(mat[i][j] + "   ");

			}
			System.out.println("\n______________");
		}
	}

	public static void replace(int[][] mat, int m, int n) {
		int[] row = { 0, 0, 0, 0 };
		int[] col = { 0, 0, 0, 0 };

		// Finding out the location of zero in the given matrix

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (mat[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;

				}
			}
		}
//Replacing with zeros in the specific rows and columns
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(col[j]==1 || row[i]==1){
					mat[i][j]=0;
									
				}
				
			}
		}
		print(mat);
	}
}
