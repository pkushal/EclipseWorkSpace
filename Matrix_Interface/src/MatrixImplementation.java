import java.util.Scanner;

public class MatrixImplementation implements Matrix {
	private int rows;
	private int cols;
	private double[][] mat;
	Scanner in = new Scanner(System.in);

	public MatrixImplementation() {
		read();
		mat = new double[getRows()][getCols()];
		System.out.println("Mat bhanne matrix pani initialize bhayo");
		takeInput();
	}

	public MatrixImplementation(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		mat = new double[rows][cols];

	}

	public void takeInput() {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getCols(); j++) {
				System.out.println("Enter the element for row " + i
						+ " column " + j);
				double v = in.nextDouble();
				mat[i][j] = v;
			}
		}
	}

	@Override
	public void read() {
		System.out.println("Enter the matrix dimension");
		System.out.println("Enter the number of rows : ");
		this.rows = in.nextInt();
		System.out.println("Enter the number of cols : ");
		this.cols = in.nextInt();

	}

	@Override
	public void display() {
		System.out.println("____________________________");
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getCols(); j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("____________________________");
	}

	@Override
	public int getRows() {
		return rows;
	}

	@Override
	public int getCols() {
		return cols;
	}

	@Override
	public void set(int i, int j, double v) {
		mat[i][j] = v;

	}

	@Override
	public double get(int i, int j) {
		return mat[i][j];
	}

	@Override
	public Matrix times(Matrix other) {
		double v = 0;
		int i;
		int j;
		Matrix c = new MatrixImplementation(this.getRows(), other.getCols());
		for (i = 0; i < this.getRows(); i++) {
			for (j = 0; j < other.getCols(); j++) {
				{
					for (int k = 0; k < getCols(); k++) {
						v += this.mat[i][k] * other.get(k, j);

					}
				}
				c.set(i, j, v);
				v = 0;
			}
		}

		return c;
	}

	@Override
	public Matrix plus(Matrix other) {

		Matrix c = new MatrixImplementation(this.getRows(), this.getCols());

		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getCols(); j++) {
				double v = this.mat[i][j] + other.get(i, j);
				c.set(i, j, v);
			}
		}

		return c;
	}

}
