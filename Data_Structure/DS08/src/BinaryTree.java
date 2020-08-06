
public class BinaryTree {
	private Object root;
	private BinaryTree left, right;

	// Constructor
	public BinaryTree() {
		this.setRoot(null);
		this.setLeft(null);
		this.setRight(null);
	}

	public BinaryTree(Object root) {
		this();
		this.setRoot(root);
	}

	public BinaryTree(Object root, BinaryTree left, BinaryTree right) {
		this.setRoot(root);
		this.setLeft(left);
		this.setRight(right);
	}

	// getter
	public Object getRoot() {
		return this.root;
	}

	public BinaryTree getLeft() {
		return this.left;
	}

	public BinaryTree getRight() {
		return this.right;
	}

	// Assignment01 ----------------------------------------------------
	// setter
	public Object setRoot(Object root) {
		Object removedObj = this.root;
		this.root = root;
		return removedObj;
	}

	public BinaryTree setLeft(BinaryTree left) {
		BinaryTree removedTree = this.left;
		this.left = left;
		return removedTree;
	}

	public BinaryTree setRight(BinaryTree right) {
		BinaryTree removedTree = this.right;
		this.right = right;
		return removedTree;
	}

	// Assignment02 ----------------------------------------------------
	public boolean isLeaf() {
		return (this.left == null) && (this.right == null);
	}

	// Assignment03 ----------------------------------------------------
	public boolean contains(Object object) {
		boolean result = false;

		// searching left side recursively
		if (this.left != null) {
			result = this.left.contains(object);
		}

		// if find matching object at left/this node, return true
		if (this.root == object || result)
			return true;

		// if not found, searching right side recursively
		if (this.right != null) {
			result = this.right.contains(object);
		}

		return result;
	}

	// Assignment04 ----------------------------------------------------
	@Override
	public String toString() { // using inorder traversal
		String strGraph = "(";

		// check left side
		if (this.left != null) {
			strGraph += this.left.toString() + ", ";
		}

		// store root object
		strGraph += root.toString();

		// check right side
		if (this.right != null) {
			strGraph += ", " + this.right.toString();
		}

		return strGraph + ")";
	}
}
