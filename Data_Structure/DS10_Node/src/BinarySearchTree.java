
public class BinarySearchTree {

	// Node class
	class Node {
		int key;
		Node left, right;

		public Node(int key) {
			this.key = key;
			this.left = null;
			this.right = null;
		}

		public boolean isLeaf() {
			return (this.left == null) && (this.right == null);
		}

		@Override
		public String toString() { // using inorder traversal
			String strGraph = "(";

			if (this.left != null)
				strGraph += this.left + ", "; // check left side
			strGraph += this.key + ""; // store root object
			if (this.right != null)
				strGraph += ", " + this.right; // check right side

			return strGraph + ")";
		}
	}

	// Attribute
	private Node root;

	// Constructor
	public BinarySearchTree(int key) {
		this.root = new Node(key);
	}

	// Method
	@Override
	public String toString() { // using inorder traversal
		if(root != null) return root.toString(); 
		return "()";
	}

	// ----------------------------------------------------------------------
	// AS 01. add(...)
	public boolean add(BinarySearchTree bst, int key) {
		Node curNode = bst.root;
		if(curNode == null) bst.root = new Node(key);

		while (curNode != null) {
			if (curNode.key > key) {
				if (curNode.left != null)
					curNode = curNode.left;
				else {
					curNode.left = new Node(key);
					return true;
				}
			} else if (curNode.key < key) {
				if (curNode.right != null)
					curNode = curNode.right;
				else {
					curNode.right = new Node(key);
					return true;
				}
			} else { // duplicated
				break;
			}
		}
		return false;
	}

	// AS 02. remove(...)
	public boolean remove(BinarySearchTree bst, int key) {
		return removeWithNode(bst.root, key);
	}
	
	public boolean removeWithNode(Node root, int key){
		Node parentNode = root;
		Node curNode = root;
		
		while(curNode != null){
			if(curNode.key == key)
			{
				if(curNode == parentNode){	// for root
					if(curNode.left == null) this.root = curNode.right;
					else if(curNode.right == null) this.root = curNode.left;
					else{
						curNode.key = deleteMinimumUsingNode(curNode, curNode.right).key;
					}
				}
				else if(!curNode.isLeaf())		// for interNode
				{
					if(curNode.left == null){
						if(parentNode.left == curNode) parentNode.left = curNode.right;
						else parentNode.right = curNode.right;
					}
					else if(curNode.right == null){
						if(parentNode.left == curNode) parentNode.left = curNode.left;
						else parentNode.right = curNode.left;
					}
					else{
						curNode.key = deleteMinimumUsingNode(curNode, curNode.right).key;
					}
				}
				else	// for leaf
				{
					if(parentNode.left == curNode) parentNode.left = null;
					else parentNode.right = null;
				}
				return true;
			}
			else if(curNode.left != null && curNode.key > key){
					parentNode = curNode;
					curNode = curNode.left;
			}
			else if(curNode.right != null && curNode.key < key){
					parentNode = curNode;
					curNode = curNode.right;
			}
			else{
				return false;
			}
		}
		
		return false;		
	}

	// bonus. deleteMinimum(...)
	/**
	 * 
	 * @param bst
	 * @return
	 */
	public BinarySearchTree deleteMinimum(BinarySearchTree bst) {
		return null;
	}
	
	public Node deleteMinimumUsingNode(Node parent, Node root){
		Node delNode = null;
		
		// check child's left side (for searching minValue)
		if(root.left == null)
		{
			if(parent.left == root){
				delNode = parent.left;
				parent.left = root.right;
			}
			else{
				delNode = parent.right;
				parent.right = root.right;
			}
			return delNode;
		}
		else if(root.left.isLeaf())	
		{
			delNode = root.left;
			root.left = null;
			return delNode;
		}
		
		return deleteMinimumUsingNode(root, root.left);
	}
}
