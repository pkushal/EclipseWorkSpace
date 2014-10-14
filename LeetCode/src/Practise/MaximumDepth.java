package Practise;

public class MaximumDepth {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		else {
			return recursion(root, 0);
		}

	}

	public int recursion(TreeNode root, int depth) {
		depth++;
		if (root.left != null && root.right == null) {
			return recursion(root.left, depth);
		} else if (root.right != null && root.left == null) {
			return recursion(root.right, depth);
		} else {
			return Math.max(recursion(root.right, depth),
					recursion(root.left, depth));
		}

	}
}
