import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Recursive implementation of Binary Search Tree
 * 
 * @author Kushal
 * 
 */
public class BST {
	public static Node root;

	public static void main(String[] args) {
		BST b = new BST();
		b.put(4, 40);
		b.put(2, 20);
		b.put(6, 60);
		b.put(1, 10);
		b.put(5, 50);
		b.put(3, 30);
		b.put(7, 70);
		System.out.println("           datas loaded into the bst...");
		findMin(root);

		System.out.println("           Inorder Traversal");
		inOrder(root);

		System.out.println("           BFS Traversal");
		Bfs(root);

		System.out.println("           DFS Normal Traversal");
		Dfsnormal(root);

		System.out.println("           DFS Recursive implementation Traversal");
		DfsRecursion(root);

		System.out
				.println("           deleting a specific key in the BST, say key .. and BFS traveral");
		delete(4);
		Bfs(root);

		System.out
				.println("           deleting the minimum from the BST and the dfs after the deletion of the minimum...");
		deleteMin();
		Dfsnormal(root);
	}

	public void put(int key, int value) {
		root = put(root, key, value);

	}

	public Node put(Node x, int key, int value) {
		if (x == null) {
			return new Node(key, value);
		}
		int cmp = Integer.compare(key, x.key);//
		/**
		 * int cmp = key.compareTo(x.key); comparing the input key and root ko
		 * key int cmp = key > x.key ? +1 : key < x.key ? -1 : 0; int cmp =
		 * Integer.compare(key, x.key); OR public Node put(Node x, Integer key,
		 * int value) { garera int cmp = key.compareTo(x.key); garepani huncha
		 */

		if (cmp < 0) {
			x.left = put(x.left, key, value);
		} else if (cmp > 0) {
			x.right = put(x.right, key, value);
		} else {
			x.value = value;
		}
		return x;
	}

	public static void inOrder(Node parent) { // in order le jahile pani
												// ascending order ma answer
												// dincha (left-middle-right)
		if (parent != null) {
			inOrder(parent.left);
			System.out.println(parent.value);
			inOrder(parent.right);
		}
	}

	public static void Bfs(Node parent) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(parent);
		while (!q.isEmpty()) {
			Node n = q.remove();
			System.out.println(n.value);
			if (n.left != null)
				q.add(n.left);
			if (n.right != null)
				q.add(n.right);
		}
	}

	public static void Dfsnormal(Node parent) {
		Stack<Node> q = new Stack<Node>();
		q.push(parent);
		while (!q.isEmpty()) {
			Node n = q.pop();
			System.out.println(n.value);
			if (n.right != null)
				q.push(n.right); // right child lai pahila push gareko
			if (n.left != null)
				q.push(n.left);// then pushing the left child
		}
	}

	public static void DfsRecursion(Node parent) {
		System.out.println(parent.value);
		if (parent.left != null) {
			DfsRecursion(parent.left);
		}
		if (parent.right != null) {
			DfsRecursion(parent.right);
		}
	}

	/**
	 * go until the finding the node with left null node Replace the node with
	 * its right link, if any
	 */
	public static void deleteMin() {
		root = deleteMin(root);
	}

	private static Node deleteMin(Node n) {
		if (n.left == null) {
			return n.right;
		}
		n.left = deleteMin(n.left);
		return n;
	}

	public static Node findMin(Node n) {
		if (n.left != null) {
			n = findMin(n.left);
		}
		return n;
	}

	/**
	 * Hibbard deletion: Case 0: NO child: Search the node and delete by setting
	 * the parent link to be null. Garbage collector will handle the
	 * unreferenced node
	 * 
	 * Case 1: One child present for the node to be deleted: Search the node and
	 * delete by replacing the parent link to the child link
	 * 
	 * Case 2: Two child present for the node to be deleted: Search the node to
	 * be deleted (say t) and find the successor (say x). Successor is the
	 * minimum in the right half of the node to be deleted (go right and go left
	 * until the null left link) Delete that successor but don't garbage collect
	 * Then finally put that successor in the place of the node to be removed.
	 * This method is not so be good because it results in asymmetric tree
	 * structure
	 */
	public static void delete(int key) {
		root = delete(root, key);
	}

	private static Node delete(Node x, int key) {
		if (x == null) {
			return null;
		}
		System.out.println("key: " + key + " and x.key: " + x.key);
		int cmp = Integer.compare(key, x.key);
		if (cmp < 0) {
			System.out.println("left tira po cha jasto cha ta");
			x.left = delete(x.left, key);
		} else if (cmp > 0) {
			System.out.println("right tira po cha jasto cha ta");
			x.right = delete(x.right, key);
		} else {
			System.out.println("key bhettiyo");
			if (x.left == null) // no left child
				return x.right; // return garera mathi ko assigment operation
								// lai update gareko( e.g.: x.left =
								// delete(x.left, key))
			if (x.right == null) // no right child
				return x.left;
			/**
			 * That node say x, has two child, left and right findMin(t.right)
			 * will give the smallest node on the right branch of the given node
			 * t, so the x is gonna be that new node that replace the old node t
			 * left of x is gonna be the left of the old node t i.e., t.left
			 * right of x is gonna be the right of the old node t with the
			 * minimum x, deleted i.e., deleteMin(t.right)
			 */
			Node t = x;
			x = findMin(t.right);
			x.right = deleteMin(t.right);
			x.left = t.left;
		}
		return x;
	}
}
