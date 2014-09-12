import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sparse implements Matrix {

	private int rowvalue;
	private int colvalue;
	private List<Value> arraylist = new ArrayList<>();

	@Override
	public void read() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Row: ");
		this.rowvalue = in.nextInt();
		System.out.println("Enter the column: ");
		this.colvalue = in.nextInt();
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getCols(); j++) {
				System.out.println("Enter [" + i + "," + j + "] ");
				double v = in.nextDouble();
				if (v != 0)
					arraylist.add(new Value(i, j, v));
			}
		}
	}

	public void setRowvalue(int rowvalue) {
		this.rowvalue = rowvalue;
	}

	public void setColvalue(int colvalue) {
		this.colvalue = colvalue;
	}

	@Override
	public void display() {
		System.out.println("~~~---~~~~----~~~~");
		double v = 0;
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getCols(); j++) {
				for (Value val : getArray()) {
					if (val.getRow() == i && val.getCol() == j) {
						v = val.getValue();
					}
				}
				System.out.print(v + "\t");
				v = 0;
			}
			System.out.println();
		}

	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return rowvalue;
	}

	@Override
	public int getCols() {
		// TODO Auto-generated method stub
		return colvalue;
	}

	public List<Value> getArray() {
		return arraylist;
	}

	@Override
	public void set(int i, int j, double v) {
		boolean found = false;
		for (Value val : arraylist) {
			if (val.getRow() == i && val.getCol() == j) {
				found = true;
				val.setValue(v); // yo old value lai delete garnu cha
				arraylist.add(new Value(i, j, v));
				return;
			}
		}
		// arraylist ma tyo entry chaina raicha i.e. the entry at the position
		// is zero
		if (found == false) {
			arraylist.add(new Value(i, j, v));
		}
	}

	@Override
	public double get(int i, int j) {
		for (Value val : arraylist) {
			if (val.getRow() == i && val.getCol() == j) {
				return val.getValue();
			}
		}
		return 0;
	}

	@Override
	public Matrix times(Matrix other) {
		double v = 0;
		int i;
		int j;
		Sparse d = new Sparse();
		d.setRowvalue(this.getRows());
		d.setColvalue(this.getCols());

		for (i = 0; i < this.getRows(); i++) {
			for (j = 0; j < other.getCols(); j++) {
				for (int k = 0; k < this.getCols(); k++) {
					v += this.get(i, k) * other.get(k, j);
				}
				System.out.println("Sum is " + v);
				if (v > 0) {
					d.set(i, j, v);
				}
				v = 0;
			}
		}
		return d;
	}

	@Override
	public Matrix plus(Matrix other) {
		Sparse c = new Sparse();
		c.setRowvalue(this.getRows());
		c.setColvalue(this.getCols());
		for (int i = 0; i < this.getRows(); i++) {
			for (int j = 0; j < this.getCols(); j++) {
				if (this.get(i, j) + other.get(i, j) > 0) {
					double add = this.get(i, j) + other.get(i, j);
					System.out.println("Sum is : " + add);
					c.set(i, j, add);
				}
			}
		}
		return c;
	}
}
