public interface Matrix {
	public void read();

	public void display();

	public int getRows();

	public int getCols();

	public void set(int i, int j, double v);

	public double get(int i, int j);

	/**
	 * Multiplies this matrix with other matrix.
	 * 
	 * @param other
	 *            - matrix to be multiplied with
	 * @return new matrix as a multiplication of this and other
	 * @preconditions this.getCols()==other.getRows()
	 * @postconditions new matrix.getRows=this.getRows and new matrix.getCols=
	 *                 other.getCols
	 */
	public Matrix times(Matrix other);

	public Matrix plus(Matrix other);
}
