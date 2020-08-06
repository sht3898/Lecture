import java.util.ArrayList;
import java.util.List;

public class Test {
	private static final int A = 0;
	private static final int B = 1;
	private static final int C = 2;
	private static final int D = 3;
	private static final int E = 4;
	private static final int F = 5;
	private static final int G = 6;
	static List<Object> aryQueue = new ArrayList<>();

	public static void main(String[] args) {

		// AS01. Setter
		BinaryTree[] trees = new BinaryTree[7];
		trees[D] = new BinaryTree("D");
		trees[G] = new BinaryTree("G");
		trees[F] = new BinaryTree("F");
		trees[B] = new BinaryTree("B");
		trees[B].setRight(trees[D]);
		trees[E] = new BinaryTree("E");
		trees[E].setLeft(trees[G]);
		trees[C] = new BinaryTree("C", trees[E], trees[F]);
		trees[A] = new BinaryTree("A", trees[B], trees[C]);

		BinaryTree[] trees2 = new BinaryTree[7];
		trees2[D] = new BinaryTree("D");
		trees2[G] = new BinaryTree("G");
		trees2[F] = new BinaryTree("F");
		trees2[B] = new BinaryTree("b");
		trees2[B].setRight(trees2[D]);
		trees2[E] = new BinaryTree("E");
		trees2[E].setLeft(trees2[G]);
		trees2[C] = new BinaryTree("C", trees2[E], trees2[F]);
		trees2[A] = new BinaryTree("A", trees2[B], trees2[C]);
		
		BinaryTree[] trees3 = new BinaryTree[7];
		trees3[D] = new BinaryTree("D");
		trees3[G] = new BinaryTree("G");
		trees3[F] = new BinaryTree("F");
		trees3[B] = new BinaryTree("B");
		trees3[B].setLeft(trees3[D]);
		trees3[E] = new BinaryTree("E");
		trees3[E].setLeft(trees3[G]);
		trees3[C] = new BinaryTree("C", trees3[E], trees3[F]);
		trees3[A] = new BinaryTree("A", trees3[B], trees3[C]);

		// 과제1 테스트
		System.out.println("과제1) Reverse");
		{
			System.out.println("Original : " + trees[A]);
			trees[A].reverse();
			System.out.println("Reversed : " + trees[A]);
			trees[A].reverse(); // 다음 테스트를 위해 복구
		}
		System.out.println();

		// 과제2 테스트
		System.out.println("과제2) Equals");
		{
			System.out.println(trees[A].equals(trees2[A])); // false : trees[B]의 값이 다르다.
			System.out.println(trees[A].equals(trees3[A])); // false : tree[B]의 자식 위치가 다르다.
			System.out.println(trees[C].equals(trees2[C])); // true
		}
		System.out.println();

		// 과제3 테스트
		System.out.println("과제3) Pre/Post-Order");
		{
			System.out.println("Inorder : " + trees[0]);
			System.out.println("PreOrder : " + preOrderPrint(trees[0]));
			System.out.println("PostOrder : " + postOrderPrint(trees[0]));
		}
		System.out.println();

		// 과제4 테스트
		System.out.println("과제4) LevelOrder");
		{
			System.out.print("LevelOrder : ");
			levelOrderPrint(trees[0]);
		}
		System.out.println();

	}

	// Assignment03 ----------------------------------------------------
	static String preOrderPrint(BinaryTree tree) {
		String strGraph = "(" + tree.getRoot();

		// check left side
		if (tree.getLeft() != null) {
			strGraph += ", " + preOrderPrint(tree.getLeft());
		}

		// check right side
		if (tree.getRight() != null) {
			strGraph += ", " + preOrderPrint(tree.getRight());
		}

		return strGraph + ")";
	}

	static String postOrderPrint(BinaryTree tree) {
		String strGraph = "(";

		// check left side
		if (tree.getLeft() != null) {
			strGraph += postOrderPrint(tree.getLeft()) + ", ";
		}

		// check right side
		if (tree.getRight() != null) {
			strGraph += postOrderPrint(tree.getRight()) + ", ";
		}

		strGraph += (String) tree.getRoot();

		return strGraph + ")";
	}

	// Assignment04 ----------------------------------------------------
	/**
	 * 알고리즘 : 트리의 루트를 시작점으로 큐에 삽입한 뒤, 매번 큐에서 하나의 원소를 뽑아 출력 한 후
	 * 각각의 자식노드들을 큐에 넣는 작업을 큐가 빌때까지 반복한다.
	 * 큐는 선입선출로 동작하기 때문에 트리의 상위노드부터 추가하고, 상위노드의 직속 자식들만을
	 * 큐에 추가하는 위 과정의 알고리즘을 반복함으로써, 트리를 단계별로(Level) 출력할 수 있다.
	 * 
	 * 예) 1, 2, 3레벨을 가지는 트리에 대한 동작
	 * 1) 1레벨(루트)를 큐에 추가.
	 * 2) 큐의 원소 하나 제거/출력 이후 제거된 원소의 자식들(2레벨) 추가.
	 * 3) 반복 -> 큐의 원소 하나(2레벨) 제거/출력 이후 제거된 원소의 자식들(3레벨) 추가.
	 * 4) 반복 -> 큐의 원소 하나(3레벨) 제거/출력 이후 제거된 원소의 자식들(없음) 추가.
	 * 5) 자식이 없으므로 큐에는 원소가 추가되지 않고, 조건문에 의해 순회 종료.
	 * @param tree
	 */
	static void levelOrderPrint(BinaryTree tree) {
		aryQueue.add(tree);		// add root of tree
		while (!aryQueue.isEmpty()) {	// check the queue until empty
			// print
			BinaryTree bt = (BinaryTree) aryQueue.remove(0);
			System.out.print(bt.getRoot() + " ");
			
			// add child's info. to the queue
			if (bt.getLeft() != null) aryQueue.add(bt.getLeft());
			if (bt.getRight() != null) aryQueue.add(bt.getRight());
		}
	}
}
