public class ArrayToBst {

	private static int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

	public static void main(String[] args) {

		Node talakorootpreservegareko = getBst(arr, 0, 6); // tala function bata
															// aayeko root ko
		// value ta lost huncha so tes lai
		// preserve garna pheri Node root define gareko
		inOrder(talakorootpreservegareko);

	}

	public static Node getBst(int[] arr, int start, int stop) {
		if (start > stop)
			return null;

		else {

			int mid = (start + stop) / 2;
			Node root = new Node(arr[mid]); // yaha Node lai define garyo bhane
											// every recursion ma naya naya
											// reference bancha, natra bhane ta
											// pahila eutai reference to mathi
											// nai arko new node banthiyo
			System.out.println(root.data);
			root.left = getBst(arr, start, mid - 1);
			root.right = getBst(arr, mid + 1, stop);
			// System.out.print(root.data + " \t");
			return root;
		}
	}

	public static void inOrder(Node parent) { // in order le jahile pani ascending order ma answer dincha (left-middle-right)
		if (parent != null) {
			inOrder(parent.left);
			System.out.print(" data " + parent.data + "\t");
			inOrder(parent.right);
		}
	}
}

// System.out.println(upto);
// return root.data;
