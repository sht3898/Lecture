
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
	 * 입력 : 이진 탐색 트리 T와 키값
	 * 출력 : 키가 T에 이미 있다면 false, 아니면 true.
	 * 
	 * 1. 만일 T가 공백이면 키를 포함하는 단독 트리를 만들고, true 리턴.
	 * 2. 만일 key < root.key 이면, 순환적으로 왼쪽 서브트리에서 키 삽입에 의해 반환되는 값을 리턴.
	 * (힌트. left가 null일 경우와 아닐 경우로 나누어 생각)
	 * 3. 만일 key > root.key 이면, 순환적으로 오른쪽 서브트리에서 키 삽입에 의해 반환되는 값을 리턴.
	 * (힌트. right가 null일 경우와 아닐 경우로 나누어 생각)
	 * 4. 만일 key == rot.key 이면, false를 리턴.
	 * 5. true를 리턴. 
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
	 * 입력 : 이진 탐색 트리 T와 키.
	 * 출력 : T에서 키를 발견할 수 없으면 false; 아니면 true.
	 * 
	 * 1. 만일 T가 공백이면, false를 리턴
	 * (힌트. T가 공백인지 아닌지를 확인하기 위한 별도의 장치 필요 [key값을 null로 두어 사용가능])
	 * 2. 만일 key < root.key이면, 순환적으로 왼쪽 서브트리로부터 키의 삭제에 의해 반환되는 값을 리턴.
	 * 3. 만일 key > root.key이면, 순환적으로 오른쪽 서브트리로부터 키의 삭제에 의해 반환되는 값을 리턴.
	 * 4. 만일 T가 단독 트리이면, 이것을 공백 트리로 만들고, true 리턴.
	 * (힌트. root 혹은 리프노드가 단독 트리로 가능하다.)
	 * 5. 만일 삭제할 노드가 루트일 경우...
	 * 5-1. 만일 자식노드가 하나일 경우 현재 노드와 자식노드로를 교체한다.
	 * (힌트. 바꾸는 순서에 주의한다.)
	 * 5-2. 만일 자식노드가 둘일 경우 현재노드와 오른쪽 서브트리에 대해 deleteMinimum을 적용하여 반환되는 노드의 값을 교환한다.
	 * (힌트. deleteMinimum(...) 메소드에 의해 변형되는 트리의 구조를 생각한다.)
	 * 6. 만일 왼쪽, 오른쪽 서브트리가 모두 공백이 아닐 경우. 현재노드와 오른쪽 서브트리에 대해 deleteMinimum을 적용하여 반환되는 노드의 값을 교환한다.
	 * 7. 만일 왼쪽 서브트리가 공백이면, T의 오른쪽 서브트리의 루트, 왼쪽, 오른쪽 필드를 T자체에 복사하고, true를 리턴.
	 * 8. 만익 오른쪽 서브트리가 공백이면, T의 왼쪽 서브트리의 루트, 왼쪽, 오른쪽 필드를 T자체에 복사하고, true를 리턴.
	 * (힌트. bst에 바로 연결하는 경우 함수의 종료시점에서 복사된 값이 유지되지 않는다! 따라서 left나 right를 활용하기 위해 적절히 remove(...)메소드를 호출한다.)
	 * 9. true를 리턴.
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
