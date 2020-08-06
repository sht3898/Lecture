
public class BinarySearchTree {
	
	private Object key;
	private BinarySearchTree left, right;

	// Constructor
	private BinarySearchTree() {
		this.key = null;
		this.left = this.right = null;
	}
	
	public BinarySearchTree(int key) {
		this();
		this.key = key;
	}

	public boolean isLeaf() {return (this.left == null) && (this.right == null);}
	
	@Override
	public String toString() { // using inorder traversal
		String strGraph = "(";
		
		if(this.left != null && this.left.key != null) strGraph += this.left + ", ";		// check left side
		if(this.key != null) strGraph += this.key + "";		// store root object
		if(this.right != null && this.right.key != null) strGraph += ", " + this.right;	// check right side

		return strGraph + ")";
	}

	// ----------------------------------------------------------------------
	// AS 01. add(...)
	/**
	 * �Է� : ���� Ž�� Ʈ�� T�� Ű��
	 * ��� : Ű�� T�� �̹� �ִٸ� false, �ƴϸ� true.
	 * 
	 * 1. ���� T�� �����̸� Ű�� �����ϴ� �ܵ� Ʈ���� �����, true ����.
	 * 2. ���� key < root.key �̸�, ��ȯ������ ���� ����Ʈ������ Ű ���Կ� ���� ��ȯ�Ǵ� ���� ����.
	 * (��Ʈ. left�� null�� ���� �ƴ� ���� ������ ����)
	 * 3. ���� key > root.key �̸�, ��ȯ������ ������ ����Ʈ������ Ű ���Կ� ���� ��ȯ�Ǵ� ���� ����.
	 * (��Ʈ. right�� null�� ���� �ƴ� ���� ������ ����)
	 * 4. ���� key == rot.key �̸�, false�� ����.
	 * 5. true�� ����. 
	 * 
	 * 
	 * @param bst
	 * @param key
	 * @return
	 */
	public boolean add(BinarySearchTree bst, int key){
		// 1) BST is empty
		if(bst.key == null) {
			bst.key = key;
			return true;
		}
		
		// Searching
		int rootKey = (int)bst.key;
		if(key < rootKey)		// 2)
		{
			if(bst.left != null) return this.add(bst.left, key);
			bst.left = new BinarySearchTree(key);
		}
		else if(key > rootKey)	// 3)
		{
			if(bst.right != null) return this.add(bst.right, key);
			bst.right = new BinarySearchTree(key);
		}
		else		// 4)
		{
			return false;
		}
		
		return true;	// 5)
	}

	
	// AS 02. remove(...)
	/**
	 * �Է� : ���� Ž�� Ʈ�� T�� Ű.
	 * ��� : T���� Ű�� �߰��� �� ������ false; �ƴϸ� true.
	 * 
	 * 1. ���� T�� �����̸�, false�� ����
	 * (��Ʈ. T�� �������� �ƴ����� Ȯ���ϱ� ���� ������ ��ġ �ʿ� [key���� null�� �ξ� ��밡��])
	 * 2. ���� key < root.key�̸�, ��ȯ������ ���� ����Ʈ���κ��� Ű�� ������ ���� ��ȯ�Ǵ� ���� ����.
	 * 3. ���� key > root.key�̸�, ��ȯ������ ������ ����Ʈ���κ��� Ű�� ������ ���� ��ȯ�Ǵ� ���� ����.
	 * 4. ���� T�� �ܵ� Ʈ���̸�, �̰��� ���� Ʈ���� �����, true ����.
	 * (��Ʈ. root Ȥ�� ������尡 �ܵ� Ʈ���� �����ϴ�.)
	 * 5. ���� ������ ��尡 ��Ʈ�� ���...
	 * 5-1. ���� �ڽĳ�尡 �ϳ��� ��� ���� ���� �ڽĳ��θ� ��ü�Ѵ�.
	 * (��Ʈ. �ٲٴ� ������ �����Ѵ�.)
	 * 5-2. ���� �ڽĳ�尡 ���� ��� ������� ������ ����Ʈ���� ���� deleteMinimum�� �����Ͽ� ��ȯ�Ǵ� ����� ���� ��ȯ�Ѵ�.
	 * (��Ʈ. deleteMinimum(...) �޼ҵ忡 ���� �����Ǵ� Ʈ���� ������ �����Ѵ�.)
	 * 6. ���� ����, ������ ����Ʈ���� ��� ������ �ƴ� ���. ������� ������ ����Ʈ���� ���� deleteMinimum�� �����Ͽ� ��ȯ�Ǵ� ����� ���� ��ȯ�Ѵ�.
	 * 7. ���� ���� ����Ʈ���� �����̸�, T�� ������ ����Ʈ���� ��Ʈ, ����, ������ �ʵ带 T��ü�� �����ϰ�, true�� ����.
	 * 8. ���� ������ ����Ʈ���� �����̸�, T�� ���� ����Ʈ���� ��Ʈ, ����, ������ �ʵ带 T��ü�� �����ϰ�, true�� ����.
	 * (��Ʈ. bst�� �ٷ� �����ϴ� ��� �Լ��� ����������� ����� ���� �������� �ʴ´�! ���� left�� right�� Ȱ���ϱ� ���� ������ remove(...)�޼ҵ带 ȣ���Ѵ�.)
	 * 9. true�� ����.
	 * 
	 * @param bst
	 * @param key
	 * @return
	 */
	public boolean remove(BinarySearchTree bst, int key) {
		// 1) BST is empty
		if(bst == null || bst.key == null) return false;
		
		int rootKey = (int)bst.key;
		
		if(key < rootKey) return bst.remove(bst.left, key);	//	2)
		else if(key > rootKey) return bst.remove(bst.right, key);	// 3)
		else{
			if(bst.isLeaf())		// 4) delete leaf
			{
				if(this.left == bst) this.left = null;
				else if(this.right == bst) this.right = null;
				else
					bst.key = null;
			}
			else if(bst == this)		// 5) delete root
			{
				if(bst.left == null){	// 5-1)
					bst.key = bst.right.key;
					bst.left = bst.right.left;
					bst.right = bst.right.right;
				}
				else if(bst.right == null){
					bst.key = bst.left.key;
					bst.right = bst.left.right;
					bst.left = bst.left.left;
				}
				else	// 5-2)
				{
					bst.key = bst.deleteMinimum(bst.right).key;	// swap key with child's minimum key
				}
			}
			else if(bst.left != null && bst.right != null)	// 6) delete child(1)
			{
				bst.key = bst.deleteMinimum(bst.right).key;	// swap key with child's minimum key
			}
			else if(bst.left == null)		// 7) delete child(2)
			{
				if(bst == this.left) this.left = bst.right;
				else this.right = bst.right;
			}
			else if(bst.right == null)	// 8) delete child(3)
			{
				if(bst == this.left) this.left = bst.left;
				else this.right = bst.left;
			}
			
			return true;	// 9)
		}
	}
	
	// bonus. deleteMinimum(...)
	/**
	 * 
	 * @param bst
	 * @return
	 */
	public BinarySearchTree deleteMinimum(BinarySearchTree bst){
		BinarySearchTree delNode = null; 
		
		// check child's left side (for searching minValue)
		if(bst.left == null)
		{
			delNode = bst;
			if(this.right == bst) this.right = bst.right;
			else this.left = bst.right;
			return delNode;
		}
		else if(bst.left.isLeaf())	
		{
			delNode = bst.left;
			bst.left = null;
			return delNode;
		}
		
		return bst.deleteMinimum(bst.left);
	}
}
