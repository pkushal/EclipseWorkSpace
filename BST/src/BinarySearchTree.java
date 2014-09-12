public class BinarySearchTree {
	Node root = null;

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(50);
		bst.add(25);
		bst.add(30);
		bst.add(12);
		bst.add(60);
		bst.add(55);
		bst.add(75);
		bst.inOrder(bst.root);
		bst.findNode(25);
	}

	void add(int d) {
		Node newnode = new Node(d);
		if (root == null) {
			root = newnode;
		} else {
			Node focusNode = root;
			Node parent;
			while (true) {
				parent = focusNode; // euta matrai Node variable liyera garna
									// milena
				if (focusNode.data > newnode.data) {
					focusNode = focusNode.left; // final step (leaf tira ma ni
												// ma herne ho bhane,
												// focusNode le ta null value
												// lai point gardai cha

					if (focusNode == null) { // euta matrai node variable lida,
												// focusNode nai update bhayera
												// focusNode.left bhaisakyo and
												// tyo updated Node ta null
												// cha...so null Node lai
												// newnode ma halna mildaina ani
												// faida pani hunnna ..so parent
												// bhanne Node ek step mathi cha
												// bhane, final ma update garda
												// tyo parent.left garna milyo
												// ni ta

						parent.left = newnode;
						return;
					}
				} else {
					focusNode = focusNode.right;
					if (focusNode == null) {
						parent.right = newnode;
						return;
					}
				}
			}
		}
	}

	public void inOrder(Node parent) {
		if (parent != null) {
			inOrder(parent.left);
			System.out.print(parent.data + "\t");
			inOrder(parent.right);
		}
	}

	public Node findNode(int key) {

		Node focusNode = root;
		while (focusNode.data != key) {
			if (key < focusNode.data) {
				focusNode = focusNode.left;

			} else {
				focusNode = focusNode.right;
			}
			if (focusNode == null)
				return null;
		}
		System.out.println("\n" + focusNode.data + " found");
		return focusNode;
	}

	
	
	
//	remove operation:
//	focusNode.right ko most left most child le focusNode lai replace garcha .... 0Oo
	
	
	public boolean remove(int key) {

		// Start at the top of the tree

		Node focusNode = root;
		Node parent = root;

		// When searching for a Node this will
		// tell us whether to search to the
		// right or left

		boolean isItALeftChild = true;

		// While we haven't found the Node
		// keep looking

		while (focusNode.data != key) {

			parent = focusNode;

			// If we should search to the left

			if (key < focusNode.data) {

				isItALeftChild = true;

				// Shift the focus Node to the left child

				focusNode = focusNode.left;

			} else {

				// Greater than focus node so go to the right

				isItALeftChild = false;

				// Shift the focus Node to the right child

				focusNode = focusNode.right;

			}

			// The node wasn't found

			if (focusNode == null)
				return false;

		}

		// If Node doesn't have children delete it

		if (focusNode.left == null && focusNode.right == null) {

			// If root delete it

			if (focusNode == root)
				root = null;

			// If it was marked as a left child
			// of the parent delete it in its parent

			else if (isItALeftChild)
				parent.left = null;

			// Vice versa for the right child

			else
				parent.right = null;

		}

		// If no right child

		else if (focusNode.right == null) {

			if (focusNode == root)
				root = focusNode.left;

			// If focus Node was on the left of parent
			// move the focus Nodes left child up to the
			// parent node

			else if (isItALeftChild)
				parent.left = focusNode.left;

			// Vice versa for the right child

			else
				parent.right = focusNode.left;

		}

		// If no left child

		else if (focusNode.left == null) {

			if (focusNode == root)
				root = focusNode.right;

			// If focus Node was on the left of parent
			// move the focus Nodes right child up to the
			// parent node

			else if (isItALeftChild)
				parent.left = focusNode.right;

			// Vice versa for the left child

			else
				parent.right = focusNode.right;

		}

		// Two children so I need to find the deleted nodes
		// replacement

		else {
//			focusNode.right ko most left most child le focusNode lai replace garcha .... 0Oo

			Node replacement = getReplacementNode(focusNode);

			// If the focusNode is root replace root
			// with the replacement

			if (focusNode == root)
				root = replacement;

			// If the deleted node was a left child
			// make the replacement the left child

			else if (isItALeftChild)
				parent.left = replacement;

			// Vice versa if it was a right child

			else
				parent.right = replacement;

			replacement.left = focusNode.left;

		}

		return true;

	}

	public Node getReplacementNode(Node replacedNode) {

		Node replacementParent = replacedNode;
		Node replacement = replacedNode;

		Node focusNode = replacedNode.right;

		// While there are no more left children

		while (focusNode != null) {

			replacementParent = replacement;

			replacement = focusNode;

			focusNode = focusNode.left;

		}

		// If the replacement isn't the right child
		// move the replacement into the parents
		// leftChild slot and move the replaced nodes
		// right child into the replacements rightChild

		if (replacement != replacedNode.right) {

			replacementParent.left = replacement.right;
			replacement.right = replacedNode.right;

		}

		return replacement;

	}

}
// void add(int d) {
// Node newnode = new Node(d);
// if (root == null) {
// root = newnode;
// System.out.print(root.data + "\t");
// } else {
// Node parent = root;
// while (parent != null) {
// if (parent.data > newnode.data) {
// parent = parent.left;
// } else {
// parent = parent.right;
// }
// }
// parent = newnode;
// System.out.print(parent.data + "\t");
// }
// }

