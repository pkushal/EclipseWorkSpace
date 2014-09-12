public class App {
	public static void main(String[] args) {
		// MatrixImplementation m = new MatrixImplementation();
		// m.display();
		// MatrixImplementation n = new MatrixImplementation();
		// n.display();
		//
		// m.plus(n).display();
		// m.times(n).display();

		Matrix s = new Sparse();
		s.read();
		s.display();
		Matrix t = new Sparse();
		t.read();
		t.display();
		System.out.println();
		s.plus(t).display();
		s.times(t).display();
		
	}
}
